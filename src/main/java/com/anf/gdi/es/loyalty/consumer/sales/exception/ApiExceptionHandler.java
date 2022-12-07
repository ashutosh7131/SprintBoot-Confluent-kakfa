package com.anf.gdi.es.loyalty.consumer.sales.exception;

import java.util.Arrays;

import com.anf.logservice.LoggingService;
import com.anf.logservice.models.LogRequest;
import com.anf.gdi.es.loyalty.consumer.sales.data.Constants;
import com.anf.gdi.es.loyalty.consumer.sales.model.response.ApiErrorModel;
import com.anf.gdi.es.loyalty.consumer.sales.model.response.ApiResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {
    private final LoggingService logger;

    public ApiExceptionHandler() {
        logger = LoggingService.getNew(ApiExceptionHandler.class);
    }

    @ExceptionHandler(value = {ApiException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiException ex) {
        var logRequest = LogRequest.error(ex.getCorrelationId(), ex).defaultLogger();

        var errorModel = new ApiErrorModel();
        errorModel.setDetail(ex.getDetails());
        errorModel.setFaultDescription(ex.getDescription());

        var payload = new ApiResponse();
        payload.addError(errorModel);

        if (ex.getCause() != null) {
            var cause = ex.getCause();
            var causeMessage = cause.getMessage();
            var stackTrace = Arrays.toString(cause.getStackTrace());

            var causeErrorModel = new ApiErrorModel();
            causeErrorModel.setDetail(causeMessage);
            causeErrorModel.setFaultDescription(stackTrace);

            payload.addError(causeErrorModel);
            logRequest = logRequest.addErrors(cause.getMessage()).addObjects(causeErrorModel);
        }

        logger.log(logRequest);

        var headers = new HttpHeaders();
        headers.add(Constants.COUNT_HEADER, "0");
        headers.add(Constants.RECORDS_EFFECTED_HEADER, "0");
        headers.add(Constants.CONTENT_LANGUAGE_HEADER, "EN");

        return new ResponseEntity<>(payload, headers, ex.getHttpStatus());
    }
}
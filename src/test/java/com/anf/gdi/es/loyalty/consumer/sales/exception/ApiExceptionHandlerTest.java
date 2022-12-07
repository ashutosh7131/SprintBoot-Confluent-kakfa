package com.anf.gdi.es.loyalty.consumer.sales.exception;

import com.anf.gdi.es.loyalty.consumer.sales.model.response.ApiResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.TestPropertySource;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestPropertySource(locations = "classpath:test.application.properties")
@ExtendWith(MockitoExtension.class)
class ApiExceptionHandlerTest {

    @InjectMocks
    ApiExceptionHandler apiExceptionHandler;

    @Test
    @DisplayName("Should return a `ApiErrorModel` when `ApiExceptionHandler` is handling an `ApiException`.")
    void shouldReturnApiErrorModelResponseEntityWhenCalled() {
        var httpStatus = HttpStatus.BAD_REQUEST;
        var desc = "exception desc";
        var detail = "exception detail";
        var throwableException = new IllegalStateException("Something bad happened.");
        var exception = new ApiException(desc, detail, UUID.randomUUID(), httpStatus, throwableException);

        var response = apiExceptionHandler.handleApiRequestException(exception);
        var responseEntity = response.getBody();
        assertEquals(httpStatus, response.getStatusCode());
        assertNotNull(responseEntity);
        assertEquals(ApiResponse.class, responseEntity.getClass());

        exception = new ApiException(desc, detail, UUID.randomUUID(), httpStatus);

        response = apiExceptionHandler.handleApiRequestException(exception);
        responseEntity = response.getBody();
        assertEquals(httpStatus, response.getStatusCode());
        assertNotNull(responseEntity);
        assertEquals(ApiResponse.class, responseEntity.getClass());
    }
}

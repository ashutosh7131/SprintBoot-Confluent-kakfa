package com.anf.gdi.es.loyalty.consumer.sales.util;

import com.anf.gdi.es.loyalty.consumer.sales.data.Constants;
import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.LoyaltyTransactionRequestOBJ;
import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.LoyaltyTransactionReturnRequestOBJ;
import com.anf.gdi.es.loyalty.consumer.sales.model.response.ApiErrorModel;
import com.anf.logservice.LoggingService;
import com.anf.logservice.models.LogRequest;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import javax.annotation.Resource;
import java.util.UUID;

@Component
public class SalesLoyaltyApiUtil {

    @Setter
    @Resource(name = "salesApiWebClient")
    private WebClient webClient;

    @Setter
    @Value("${sales-endpoint}")
    private String salesLoyaltyUrl;

    @Autowired
    public SalesLoyaltyApiUtil(WebClient webClient) {
        this.webClient = webClient;
    }


    public void callSalesLoyaltyApi(String correlationId, LoyaltyTransactionRequestOBJ apiRequest, ApiErrorModel apiErrorModel) {
        if (apiRequest == null) {
            throw new NullPointerException("ApiRequest can not be null");
        } else {

                LoggingService logger = LoggingService.getNew(getClass());
                logger.log(LogRequest.debug(UUID.randomUUID(), String.format("%s - Calling Sales Loyalty Rest Api", Constants.LOG_ENTRY_START))
                        .defaultLogger()
                        .addObject("Correlation-ID", correlationId)
                        .addObject("SALES_LOYALTY_API_REQUEST", apiRequest)
                );

                this.webClient
                        .post()
                        .uri(salesLoyaltyUrl)
                        .headers(httpHeaders -> {
                            httpHeaders.set("Correlation-ID", correlationId.toString());
                            httpHeaders.set("Version-Key", "Version-Key");
                        })
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(Mono.just(apiRequest), LoyaltyTransactionRequestOBJ.class)
                        .retrieve()
                        .bodyToMono(String.class)
                        .doOnSuccess(x ->{
                            logger.log(LogRequest.info(UUID.randomUUID(), String.format("%s - Sales Loyalty API call success", Constants.LOG_ENTRY_START))
                                    .defaultLogger()
                            );
                            System.out.println("x.getBytes() ---> "+x.toString()) ;

                        } )
                        .doOnError(err -> {
                            logger.log(LogRequest.error(UUID.randomUUID(), err, String.format("%s - Sales Loyalty API call failed - %s", Constants.LOG_ENTRY_START, err.getMessage()))
                                    .defaultLogger()
                                    .addObject("FAULT_CODE", apiErrorModel.getFaultCode())
                                    .addObject("FAULT_DESCRIPTION", apiErrorModel.getFaultDescription())
                                    .addObject("DETAIL", apiErrorModel.getDetail())
                            );
                        })
                        .subscribe();
            }
        }

    public void callSalesLoyaltyReturnApi(String correlationId, LoyaltyTransactionRequestOBJ apiRequest, LoyaltyTransactionReturnRequestOBJ apiReturnRequest, ApiErrorModel apiErrorModel) {
        if (apiRequest == null) {
            throw new NullPointerException("ApiRequest can not be null");
        } else {

            LoggingService logger = LoggingService.getNew(getClass());
            logger.log(LogRequest.debug(UUID.randomUUID(), String.format("%s - Calling Sales Loyalty Return Rest Api", Constants.LOG_ENTRY_START))
                    .defaultLogger()
                    .addObject("Correlation-ID", correlationId)
                    .addObject("SALES_LOYALTY_RETURN_API_REQUEST", apiRequest)
            );

            this.webClient
                    .post()
                    .uri(salesLoyaltyUrl)
                    .headers(httpHeaders -> {
                        httpHeaders.set("Correlation-ID", correlationId.toString());
                        httpHeaders.set("Version-Key", "Version-Key");
                    })
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(Mono.just(apiReturnRequest), LoyaltyTransactionReturnRequestOBJ.class)
                    .retrieve()
                    .bodyToMono(String.class)
                    .doOnSuccess(x ->{
                        logger.log(LogRequest.info(UUID.randomUUID(), String.format("%s - Sales Loyalty Return API call success", Constants.LOG_ENTRY_START))
                                .defaultLogger()
                        );
                        System.out.println("x.getBytes() ---> "+x.toString()) ;

                    } )
                    .doOnError(err -> {
                        logger.log(LogRequest.error(UUID.randomUUID(), err, String.format("%s - Sales Loyalty Return API call failed - %s", Constants.LOG_ENTRY_START, err.getMessage()))
                                .defaultLogger()
                                .addObject("FAULT_CODE", apiErrorModel.getFaultCode())
                                .addObject("FAULT_DESCRIPTION", apiErrorModel.getFaultDescription())
                                .addObject("DETAIL", apiErrorModel.getDetail())
                        );
                    })
                    .subscribe();
        }
    }
}


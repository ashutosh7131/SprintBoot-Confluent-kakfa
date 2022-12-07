package com.anf.gdi.es.loyalty.consumer.sales.service;

import com.anf.gdi.es.loyalty.consumer.sales.config.AppKafkaConfig;
import com.anf.gdi.es.loyalty.consumer.sales.mapper.SalesRequestMapper;
import com.anf.gdi.es.loyalty.consumer.sales.mapper.SalesRequestReturnMapper;
import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.LoyaltyTransactionRequestOBJ;
import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.LoyaltyTransactionReturnRequestOBJ;
import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.SalesTopicMessage;
import com.anf.gdi.es.loyalty.consumer.sales.model.response.ApiErrorModel;
import com.anf.gdi.es.loyalty.consumer.sales.util.SalesLoyaltyApiUtil;
import com.anf.kafkaservicejsonschema.models.Consumer;
import com.anf.logservice.LoggingService;
import com.anf.logservice.models.LogRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.confluent.kafka.schemaregistry.client.rest.exceptions.RestClientException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.UUID;

import static com.anf.gdi.es.loyalty.consumer.sales.data.Constants.LOG_ENTRY_START;
@Service
public class SalesLoyaltyConsumerServiceImpl implements SalesLoyaltyConsumerService {

    private LoggingService loggingService;

    static final String eventReCount = "EVENT_RECEIVED";

    private final AppKafkaConfig kafkaProperties;

    private final Consumer<SalesTopicMessage> consumer;

    private final SalesLoyaltyApiUtil salesLoyaltyApiUtil;

    @Autowired
    public SalesLoyaltyConsumerServiceImpl(Consumer<SalesTopicMessage> consumer, LoggingService loggingService, AppKafkaConfig kafkaProperties, SalesLoyaltyApiUtil salesLoyaltyApiUtil) {
        this.consumer = consumer;
        this.loggingService = loggingService;
        this.kafkaProperties = kafkaProperties;
        this.salesLoyaltyApiUtil = salesLoyaltyApiUtil;
    }

    @Override
    public void processEvent(SalesTopicMessage salesTopicMessage) throws RestClientException, IOException{

        this.loggingService.log(LogRequest.debug(salesTopicMessage.getCorrelationIdAsUUID(), String.format("%s - EVENT RECEIVED", LOG_ENTRY_START))
                .defaultLogger()
                .addObject(eventReCount, salesTopicMessage.toString())
        );

        try {
            if(salesTopicMessage.getSaleTransactionMessage().getSaleTransaction().getSaleTransactionHDRType().getSaleType().equals("purchase")) {
                SalesRequestMapper mapper = new SalesRequestMapper();
                LoyaltyTransactionRequestOBJ salesRequest = mapper.getPayload(salesTopicMessage);
                String correlationId = salesTopicMessage.getCorrelationId();
                ApiErrorModel apiErrorModel = new ApiErrorModel();
                salesLoyaltyApiUtil.callSalesLoyaltyApi(correlationId, salesRequest, apiErrorModel);
                ObjectMapper objectMapper = new ObjectMapper();
                JSONObject outputJson = new JSONObject(objectMapper.writeValueAsString(salesRequest));
                loggingService.log(LogRequest.debug(salesTopicMessage.getCorrelationIdAsUUID(),"Sale Type is purchase"));
            } else if (salesTopicMessage.getSaleTransactionMessage().getSaleTransaction().getSaleTransactionHDRType().getSaleType().equals("return") || salesTopicMessage.getSaleTransactionMessage().getSaleTransaction().getSaleTransactionHDRType().getSaleType().equals("")) {
                SalesRequestReturnMapper returnMapper = new SalesRequestReturnMapper();
                SalesRequestMapper mapper = new SalesRequestMapper();
                LoyaltyTransactionRequestOBJ salesRequest = mapper.getPayload(salesTopicMessage);
                LoyaltyTransactionReturnRequestOBJ returnSalesRequest = returnMapper.getReturnPayload(salesTopicMessage,salesRequest);
                String correlationId = salesTopicMessage.getCorrelationId();
                ApiErrorModel apiErrorModel = new ApiErrorModel();
                salesLoyaltyApiUtil.callSalesLoyaltyReturnApi(correlationId, salesRequest,returnSalesRequest, apiErrorModel);
                ObjectMapper objectReturnMapper = new ObjectMapper();
                JSONObject outputReturnJson = new JSONObject(objectReturnMapper.writeValueAsString(returnSalesRequest));
                loggingService.log(LogRequest.debug(salesTopicMessage.getCorrelationIdAsUUID(),"Sale Type is return"));

            }
        } catch (Exception e) {

            loggingService.log(LogRequest.error(salesTopicMessage.getCorrelationIdAsUUID(), e).defaultLogger());
        }
    }
    @Override
    public void setLoggerInformation(LoggingService logger) {
        this.loggingService = logger;
    }

}


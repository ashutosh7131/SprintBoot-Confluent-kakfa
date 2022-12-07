package com.anf.gdi.es.loyalty.consumer.sales.service;

import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.SalesTopicMessage;
import com.anf.logservice.LoggingService;
import io.confluent.kafka.schemaregistry.client.rest.exceptions.RestClientException;
import java.io.IOException;


public interface SalesLoyaltyConsumerService {
    void processEvent(SalesTopicMessage salesTopicMessage) throws RestClientException, IOException;
    void setLoggerInformation(LoggingService logger);

}

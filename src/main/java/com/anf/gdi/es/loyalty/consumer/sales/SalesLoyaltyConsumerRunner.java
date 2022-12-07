package com.anf.gdi.es.loyalty.consumer.sales;

import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.SalesTopicMessage;
import com.anf.gdi.es.loyalty.consumer.sales.service.SalesLoyaltyConsumerService;
import com.anf.kafkaservicejsonschema.KafkaServiceJsonSchema;
import com.anf.kafkaservicejsonschema.models.Consumer;
import com.anf.logservice.LoggingService;
import com.anf.logservice.models.LogRequest;
import com.anf.gdi.es.loyalty.consumer.sales.data.Constants;
import com.anf.gdi.es.loyalty.consumer.sales.service.SalesLoyaltyConsumerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.lang.reflect.Method;
import java.util.UUID;

@Component
public class SalesLoyaltyConsumerRunner implements CommandLineRunner {
    private final KafkaServiceJsonSchema kafkaJsonService;
    private final LoggingService loggingService;
    private final SalesLoyaltyConsumerService salesLoyaltyConsumerService;
    private final Consumer<SalesTopicMessage> consumer;

    @Autowired
    public SalesLoyaltyConsumerRunner(Consumer<SalesTopicMessage> consumer, SalesLoyaltyConsumerService salesLoyaltyConsumerService, KafkaServiceJsonSchema kafkaJsonService) {
        this.consumer = consumer;
        this.salesLoyaltyConsumerService = salesLoyaltyConsumerService;
        this.kafkaJsonService = kafkaJsonService;
        loggingService = LoggingService.getNew(this.getClass());
    }

    @Override
    public void run(String... args) {
        var correlationId = new UUID(0, 0);
        kafkaJsonService.setLoggerInformation(loggingService, correlationId);
        salesLoyaltyConsumerService.setLoggerInformation(loggingService);
        this.loggingService.log(LogRequest.debug(correlationId, String.format("%s - LOYALTY CONSUMER RUNNER STARTING", Constants.LOG_ENTRY_START)).defaultLogger());

        try {
            var parameterTypes = new Class[1];
            parameterTypes[0] = SalesTopicMessage.class;

            Method functionToPass = SalesLoyaltyConsumerServiceImpl.class.getMethod("processEvent", parameterTypes);
            this.consumer.setCallback(salesLoyaltyConsumerService, functionToPass);
            consumer.processRecords();
        } catch (Exception ex) {
            loggingService.log(LogRequest.error(correlationId, ex).defaultLogger());
        }
    }
}
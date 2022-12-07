package com.anf.gdi.es.loyalty.consumer.sales.beans;

import com.anf.gdi.es.loyalty.consumer.sales.config.AppKafkaConfig;
import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.SalesTopicMessage;
import com.anf.kafkaservicejsonschema.KafkaServiceJsonSchema;
import com.anf.kafkaservicejsonschema.models.Consumer;
import com.anf.logservice.LoggingService;
import com.anf.logservice.models.LogRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;
import java.util.UUID;

@Configuration
public class AnfKafkaConsumerBean {
    private final KafkaServiceJsonSchema kafkaService;
    private final AppKafkaConfig appKafkaConfig;
    private final LoggingService logger;

    @Autowired
    public AnfKafkaConsumerBean(KafkaServiceJsonSchema kafkaService, AppKafkaConfig appKafkaConfig) {
        this.kafkaService = kafkaService;
        this.appKafkaConfig = appKafkaConfig;
        logger = LoggingService.getNew(getClass());
    }

    @Bean
    public Consumer<SalesTopicMessage> getConsumer() throws ParseException {
        var loggingService = LoggingService.getNew(getClass());
        var correlationId = UUID.randomUUID();
        kafkaService.setLoggerInformation(loggingService, correlationId);
        try {
            return kafkaService.getConsumer(this.appKafkaConfig.getTopic(), this.appKafkaConfig.getGroup());
        } catch (ParseException e) {
            this.logger.log(LogRequest.error(correlationId, e, "ERROR GETTING THE CONSUMER").defaultLogger());
            throw e;
        }
    }

}

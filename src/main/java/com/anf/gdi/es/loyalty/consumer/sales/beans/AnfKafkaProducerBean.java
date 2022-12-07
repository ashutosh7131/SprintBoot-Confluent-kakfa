package com.anf.gdi.es.loyalty.consumer.sales.beans;

import com.anf.gdi.es.loyalty.consumer.sales.config.AppKafkaConfig;
import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.SalesTopicMessage;
import com.anf.kafkaservicejsonschema.KafkaServiceJsonSchema;
import com.anf.kafkaservicejsonschema.models.Producer;
import com.anf.logservice.LoggingService;
import io.confluent.kafka.schemaregistry.client.rest.exceptions.RestClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.io.IOException;

@Configuration
public class AnfKafkaProducerBean {

    private final KafkaServiceJsonSchema kafkaService;
    private final AppKafkaConfig appKafkaConfig;
    private final LoggingService logger;

    @Autowired
    public AnfKafkaProducerBean(KafkaServiceJsonSchema kafkaService, AppKafkaConfig appKafkaConfig) {
        this.kafkaService = kafkaService;
        this.appKafkaConfig = appKafkaConfig;
        logger = LoggingService.getNew(getClass());
    }
    @Bean(name = "kafka-producer")
    public Producer<Object> getProducer() throws RestClientException, IOException {
        this.kafkaService.setLoggerInformation(logger);
        return kafkaService.getProducer(this.appKafkaConfig.getTopic());

    }
}

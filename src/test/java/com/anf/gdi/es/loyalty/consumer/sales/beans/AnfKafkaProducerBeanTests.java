package com.anf.gdi.es.loyalty.consumer.sales.beans;


import com.anf.gdi.es.loyalty.consumer.sales.config.AppKafkaConfig;
import com.anf.kafkaservicejsonschema.KafkaServiceJsonSchema;
import com.anf.kafkaservicejsonschema.models.Consumer;
import io.confluent.kafka.schemaregistry.client.rest.exceptions.RestClientException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class AnfKafkaProducerBeanTests {

    @Mock
    KafkaServiceJsonSchema kafkaService;

    @Mock
    AppKafkaConfig appKafkaConfig;

    @InjectMocks
    AnfKafkaProducerBean producerBean;

    @Test
    @DisplayName("Should return a Null Producer object when getConsumer method is called.")
    void shouldReturnANullProducerObjectWhenGetProducerMethodIsCalled() throws ParseException, RestClientException, IOException {
        var topicName = "test-topic-name";

        when(this.appKafkaConfig.getTopic()).thenReturn(topicName);

        var producer = this.producerBean.getProducer();
        assertAll(
                () -> assertNull(producer),
                () -> verify(this.appKafkaConfig, times(1)).getTopic()
        );
    }
}

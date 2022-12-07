package com.anf.gdi.es.loyalty.consumer.sales.beans;


import com.anf.kafkaservicejsonschema.KafkaServiceJsonSchema;
import com.anf.kafkaservicejsonschema.models.Consumer;
import com.anf.gdi.es.loyalty.consumer.sales.config.AppKafkaConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AnfKafkaConsumerBeanTests {
    @Mock
    KafkaServiceJsonSchema kafkaService;

    @Mock
    AppKafkaConfig appKafkaConfig;

    @InjectMocks
    AnfKafkaConsumerBean consumerBean;

    @Test
    @DisplayName("Should return a Consumer object when getConsumer method is called.")
    void shouldReturnAConsumerObjectWhenGetConsumerMethodIsCalled() throws ParseException {
        var topicName = "test-topic-name";
        var consumerGroupName = "test-consumer-group-name";

        when(this.appKafkaConfig.getTopic()).thenReturn(topicName);
        when(this.appKafkaConfig.getGroup()).thenReturn(consumerGroupName);
        when(this.kafkaService.getConsumer(topicName, consumerGroupName)).thenReturn(mock(Consumer.class));

        var consumer = this.consumerBean.getConsumer();
        assertAll(
                () -> assertNotNull(consumer),
                () -> verify(this.appKafkaConfig, times(1)).getGroup(),
                () -> verify(this.appKafkaConfig, times(1)).getTopic()
        );
    }

    @Test
    @DisplayName("Should rethrow the exception if kafka service is throwing an exception when calling getConsumer method.")
    void shouldRethrowTheExceptionIfKafkaServiceIsThrowingAnExceptionWhenCallingGetConsumerMethod() throws ParseException {

        var topicName = "test-topic-name";
        var consumerGroupName = "test-consumer-group-name";

        when(this.appKafkaConfig.getTopic()).thenReturn(topicName);
        when(this.appKafkaConfig.getGroup()).thenReturn(consumerGroupName);
        when(this.kafkaService.getConsumer(topicName, consumerGroupName)).thenThrow(ParseException.class);

        assertThrows(ParseException.class, () -> consumerBean.getConsumer());
    }
}

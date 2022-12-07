package com.anf.gdi.es.loyalty.consumer.sales;

import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.SalesTopicMessage;
import com.anf.gdi.es.loyalty.consumer.sales.service.SalesLoyaltyConsumerService;
import com.anf.kafkaservicejsonschema.KafkaServiceJsonSchema;
import com.anf.kafkaservicejsonschema.models.Consumer;
import com.anf.logservice.LoggingService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class SalesLoyaltyConsumerRunnerTest {

    @Mock
    private KafkaServiceJsonSchema kafkaService;

    @Mock
    private SalesLoyaltyConsumerService salesLoyaltyConsumerService;

    @Mock
    private Consumer<SalesTopicMessage> consumer;

    @InjectMocks
    private SalesLoyaltyConsumerRunner runner;
    @Mock
    LoggingService logservice;

    @Test
    @DisplayName("Should start consuming kafka messages when run method is called")
    void shouldStartConsumingMessagesWhenRunMethodIsCalled() throws Exception {
        //   doNothing().when(salesLoyaltyConsumerService).setLoggerInformation(isA(LoggingService.class));
        runner.run();
        verify(consumer, times(1)).processRecords();
    }



}

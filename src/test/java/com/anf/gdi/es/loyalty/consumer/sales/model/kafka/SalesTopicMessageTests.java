package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesTopicMessageTests {

    @Test
    @DisplayName("Should be able to set the values using the setters and retrieve them using the getters.")
    void shouldBeAbleToSetTheValuesUsingTheSettersAndRetrieveThemUsingTheGetters() {
        var correlationId="13245";
        var sourceSystemId="345";
        var triggerSystemId="56346";
        var messageTimestamp=new Date();
        var saleTransactionMessage=new SaleTransactionMessage();

        var model = new SalesTopicMessage();
        model.setSaleTransactionMessage(saleTransactionMessage);
        model.setCorrelationId(correlationId);
        model.setMessageTimestamp(messageTimestamp);
        model.setSourceSystemId(sourceSystemId);
        model.setTriggerSystemId(triggerSystemId);

        assertAll(
                ()->assertEquals(saleTransactionMessage, model.getSaleTransactionMessage()),
                ()->assertEquals(correlationId, model.getCorrelationId()),
                ()->assertEquals(sourceSystemId, model.getSourceSystemId()),
                ()->assertEquals(triggerSystemId, model.getTriggerSystemId()),
                ()->assertEquals(messageTimestamp, model.getMessageTimestamp())
        );
    }
}


package com.anf.gdi.es.loyalty.consumer.sales.model.request;

import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.LoyaltyTransactionRequestOBJ;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class ApiRequestTests {

    @Test
    @DisplayName("Should be able to set the values using the setters and retrieve them using the getters.")
    void shouldBeAbleToSetTheValuesUsingTheSettersAndRetrieveThemUsingTheGetters() {

        var loyaltyTransactionRequestOBJ = mock(LoyaltyTransactionRequestOBJ.class);
        List<LoyaltyTransactionRequestOBJ> loyaltyTransactionRequest = new ArrayList<LoyaltyTransactionRequestOBJ>();
        loyaltyTransactionRequest.add(loyaltyTransactionRequestOBJ);

    }
}

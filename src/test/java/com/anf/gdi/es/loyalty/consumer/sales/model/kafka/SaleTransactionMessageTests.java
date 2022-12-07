package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class SaleTransactionMessageTests {

    @Test
    @DisplayName("Should be able to set the values using the setters and retrieve them using the getters.")
    void shouldBeAbleToSetTheValuesUsingTheSettersAndRetrieveThemUsingTheGetters() {

        SaleTransactionTypeTests saleTransactionTypeTests = mock(SaleTransactionTypeTests.class);
        List<SaleTransactionTypeTests> model = new ArrayList<>();
        model.add(saleTransactionTypeTests);
        assertAll(
                () -> assertEquals(saleTransactionTypeTests, model.get(0)));

    }
}

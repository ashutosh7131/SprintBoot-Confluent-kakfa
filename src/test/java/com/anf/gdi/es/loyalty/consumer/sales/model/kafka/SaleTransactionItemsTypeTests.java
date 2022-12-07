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
class SaleTransactionItemsTypeTests {

    @Test
    @DisplayName("Should be able to set the values using the setters and retrieve them using the getters.")
    void shouldBeAbleToSetTheValuesUsingTheSettersAndRetrieveThemUsingTheGetters() {

        SaleLineItemTypeTests saleLineItemTypeTests = mock(SaleLineItemTypeTests.class);
        List<SaleLineItemTypeTests> model = new ArrayList<>();
        model.add(saleLineItemTypeTests);
        assertAll(
                () -> assertEquals(saleLineItemTypeTests, model.get(0)));
    }
}

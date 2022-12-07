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
class SaleTransactionTypeTests {

    @Test
    @DisplayName("Should be able to set the values using the setters and retrieve them using the getters.")
    void shouldBeAbleToSetTheValuesUsingTheSettersAndRetrieveThemUsingTheGetters() {

        SaleTransactionHDRTypeTests saleTransactionHDRTypeTests = mock(SaleTransactionHDRTypeTests.class);
        SaleLineItemTypeTests saleLineTypeTests = mock(SaleLineItemTypeTests.class);
        List<SaleTransactionHDRTypeTests> model = new ArrayList<>();
        List<SaleLineItemTypeTests> model1 = new ArrayList<>();
        model.add(saleTransactionHDRTypeTests);
        model1.add(saleLineTypeTests);
        assertAll(
                () -> assertEquals(saleTransactionHDRTypeTests, model.get(0)),
                () -> assertEquals(saleLineTypeTests, model1.get(0)));
    }
}

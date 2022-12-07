package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class TaxLineItemTypeTests {

    @InjectMocks
    TaxLineItemType model;
    @Test
    @DisplayName("Should be able to set the values using the setters and retrieve them using the getters.")
    void shouldBeAbleToSetTheValuesUsingTheSettersAndRetrieveThemUsingTheGetters() {

        var amount="32.00";
        var taxLinetype="test";
        var authority="authority";
        var rate="22.00";
        var name="test";
        model.setAmount(amount);
        model.setAuthority(authority);
        model.setName(name);
        model.setRate(rate);
        model.setTaxLinetype(taxLinetype);

        assertAll(
                ()-> assertEquals(amount, model.getAmount()),
                ()-> assertEquals(authority, model.getAuthority()),
                ()-> assertEquals(name, model.getName()),
                ()-> assertEquals(rate, model.getRate()),
                ()-> assertEquals(taxLinetype, model.getTaxLinetype())
        );
    }

}

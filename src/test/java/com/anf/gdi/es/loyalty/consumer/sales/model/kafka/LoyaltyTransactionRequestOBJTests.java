package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class LoyaltyTransactionRequestOBJTests {

    @Test
    @DisplayName("Should be able to set the values using the setters and retrieve them using the getters.")
    void shouldBeAbleToSetTheValuesUsingTheSettersAndRetrieveThemUsingTheGetters() {

        var sourceSys = "1234@78";
        var customerId = 123;
        var brand = 1;
        var email = "ashutosh713@outlook.com";
        var country = "INDIA";
        var webStoreId = "12345";
        var channel = "Sony";
        var subChannel = "pix";
        var transactionDate = "2022-12-2";
        var transaction = mock(Transaction.class);
        var model = new LoyaltyTransactionRequestOBJ();
        model.setSourceSys(sourceSys);
        model.setCustomerId(customerId);
        model.setBrand(brand);
        model.setEmail(email);
        model.setCountry(country);
        model.setWebStoreId(webStoreId);
        model.setChannel(channel);
        model.setSubChannel(subChannel);
        model.setTransactionDate(transactionDate);
        model.setTransaction(transaction);

        assertAll(
                () -> assertEquals(sourceSys, model.getSourceSys()),
                () -> assertEquals(customerId, model.getCustomerId()),
                () -> assertEquals(brand, model.getBrand()),
                () -> assertEquals(email, model.getEmail()),
                () -> assertEquals(country, model.getCountry()),
                () -> assertEquals(webStoreId, model.getWebStoreId()),
                () -> assertEquals(channel, model.getChannel()),
                () -> assertEquals(subChannel, model.getSubChannel()),
                () -> assertEquals(transactionDate, model.getTransactionDate()),
                () -> assertEquals(transaction, model.getTransaction()));
    }

    }

package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class LoyaltyTransactionReturnRequestOBJTests {
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
        var orgBusinessDate = "2022-11-10";
        var originalTransactionId = "12345";
        var amount = 0;
        var capReturns  = true;
        var detail = "hi";
        var autoEnroll = "agv";
        var pointsForVAT = true;
        var sellAmount = 0;
        var totalReturnAmount = 1;
        var merchCreditAmount = 234;
        var subChannelDetail = 1L;
        Date startTime = new Date(2022);
        Date endTime = new Date(2021);
        var model = new LoyaltyTransactionReturnRequestOBJ();
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
        model.setOriginalTransactionId(originalTransactionId);
        model.setAmount(amount);
        model.setCapReturns(capReturns);
        model.setDetail(detail);
        model.setAutoEnroll(autoEnroll);
        model.setPointsForVAT(pointsForVAT);
        model.setSellAmount(sellAmount);
        model.setTotalReturnAmount(totalReturnAmount);
        model.setMerchCreditAmount(merchCreditAmount);
        model.setSubChannelDetail(subChannelDetail);
        model.setStartTime(startTime);
        model.setEndTime(endTime);


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
                () -> assertEquals(transaction, model.getTransaction()),
                () -> assertEquals(originalTransactionId, model.getOriginalTransactionId()),
                () -> assertEquals(amount, model.getAmount()),
                () -> assertEquals(capReturns, model.isCapReturns()),
                () -> assertEquals(detail, model.getDetail()),
                () -> assertEquals(autoEnroll, model.getAutoEnroll()),
                () -> assertEquals(pointsForVAT, model.isPointsForVAT()),
                () -> assertEquals(sellAmount, model.getSellAmount()),
                () -> assertEquals(totalReturnAmount, model.getTotalReturnAmount()),
                () -> assertEquals(merchCreditAmount, model.getMerchCreditAmount()),
                () -> assertEquals(subChannelDetail, model.getSubChannelDetail()),
                () -> assertEquals(startTime, model.getStartTime()),
                () -> assertEquals(endTime, model.getEndTime()));
    }

}

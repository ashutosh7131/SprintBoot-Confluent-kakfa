package com.anf.gdi.es.loyalty.consumer.sales.mapper;

import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;


@ExtendWith(MockitoExtension.class)
class SalesRequestReturnMapperTests {

    @InjectMocks
    SalesRequestMapper salesRequestMapper;

    @InjectMocks
    SalesRequestReturnMapper salesRequestReturnMapper;

    @Mock
    SalesTopicMessage salesTopicMessage;
    @Mock
    LoyaltyTransactionRequestOBJ loyaltyTransactionRequestOBJ;

    @Mock
    LoyaltyTransactionReturnRequestOBJ loyaltyTransactionReturnRequestOBJ;


    @Test
    @DisplayName("Should Send Exception If WebStore ID Is Null")
    public void shouldSendExceptionForWebStoreId(){

            Exception exception = assertThrows(NullPointerException.class, () -> {

            salesRequestReturnMapper.getReturnPayload(null,mock(LoyaltyTransactionRequestOBJ.class));
        });
        assertTrue(exception.getMessage().contains("WebStore ID can not be null"));

    }

    @Test
    @DisplayName("Should Send ParseException If date to compare format Is incorrect")
    public void shouldSendRuntimeExceptionForDateToCompare(){

        Exception exception = assertThrows(ParseException.class, () -> {

            DateFormat dateToCompare = new SimpleDateFormat("yyyy-MM-dd");
            dateToCompare.parse("2022");

        });
        Assertions.assertThatExceptionOfType(ParseException.class);

    }



    @Test
    @DisplayName("Should transform request in loyalty 500f format")
    public void shouldTransformRequest() throws JSONException, IOException {
        salesRequestMapper = new SalesRequestMapper();
        salesRequestReturnMapper = new SalesRequestReturnMapper();
        String jsonStr = "{\"correlationId\":\"640868\",\"sourceSystemId\":\"1052\",\"triggerSystemId\":\"1052\",\"messageTimestamp\":\"2022-04-07T21:01:53.000-04:00\",\"saleTransactionMessage\":{\"saleTransaction\":{\"saleTransactionHDRType\":{\"sequenceNumber\":\"10001\",\"storeId\":\"101\",\"rewardsEligiblePurchaseStore\":true,\"rewardsEligibleReturnStore\":true,\"workstationId\":\"11\",\"businessDate\":\"2022-04-07T21:01:53.000-04:00\",\"storeType\":\"BRAND_STORE\",\"saleType\":\"\",\"reasonCode\":\"\",\"status\":\"COMPLETE\",\"employeeSaleId\":\"111\",\"startTime\":\"2022-04-07T21:01:53.000-04:00\",\"endTime\":\"2022-04-07T21:01:53.000-04:00\",\"cashierId\":\"001\",\"authorizerId\":\"121\",\"taxExemptId\":\"11\",\"subtotalAmount\":778.5,\"discountAmount\":-25.75,\"taxAmount\":309,\"totalAmount\":730,\"grandTotalAmount\":516.25,\"filingCurrencyConversionFactor\":735.5,\"filingCurrencyCode\":\"USD\",\"origCurrencyCode\":\"USD\",\"storeCurrencyCode\":\"USD\",\"customerInfo\":{\"lineItemNumber\":215,\"lastName\":\"X\",\"firstName\":\"Johan\",\"email\":\"johan@abc.com\",\"phone\":\"234567890\",\"address1\":\"\",\"address2\":\"\",\"city\":\"East Brunswick\",\"state\":\"NJ\",\"zipCode\":\"08816\",\"zipCodeExt\":\"\",\"country\":\"US\",\"idType\":\"\",\"idSwiped\":false,\"encryptedId\":\"\",\"customerLinkType\":\"\",\"customerLinkCode\":\"2345\",\"customerReturnLinkCode\":\"2345\",\"checkForRewardsAccount\":false,\"shipToAddress1\":\"ABCDEFGHIJK\",\"shipToaddress2\":\"ABCDEFGH\",\"shipTocity\":\"East Brunswick\",\"shipTostate\":\"NJ\",\"shipTozipCode\":\"08816\",\"shipTozipCodeExt\":\"\",\"shipTocountry\":\"US\",\"shipToTaxAreaId\":241,\"shippingTransportMode\":\"\",\"shippingDate\":\"2022-04-07T21:01:53.000-04:00\",\"shippingDeliveryTerms\":\"\",\"shippingOverrideReason\":\"\",\"eReceiptIndicator\":19,\"marketingEmailIndicator\":601},\"tenderList\":{\"tender\":[{\"lineItemNumber\":23,\"tenderTypeId\":\"2334\",\"tenderAmount\":20}]},\"originateEntryType\":\"\",\"originateStoreId\":\"122\",\"originateWorkstationId\":\"101\",\"originateSequenceNumber\":910,\"originateBusinessDate\":\"2022-04-07T21:01:53.000-04:00\",\"downstreamSystemList\":[],\"creditOfflineUpdate\":\"Y\",\"storeCountry\":\"US\",\"pointsForVAT\":true},\"SaleTransactionItems\":{\"saleLineItem\":[{\"lineItemNumber\":23,\"quantity\":23,\"sellAmount\":10}]}}}}";
        ObjectMapper mapper = new ObjectMapper();
        JSONObject obj = new JSONObject(jsonStr);
        byte[] jsonData = obj.toString().getBytes();
        salesTopicMessage = mapper.readValue(jsonData ,SalesTopicMessage.class);
        loyaltyTransactionRequestOBJ = salesRequestMapper.getPayload(salesTopicMessage);
        loyaltyTransactionReturnRequestOBJ = salesRequestReturnMapper.getReturnPayload(salesTopicMessage,loyaltyTransactionRequestOBJ);
        String jsonString = "{\"shopId\":\"101\",\"memberCode\":\"2345\",\"srcSys\":\"BRAND_STORE\",\"srcId\":\"10001-101-11\",\"orderCode\":\"10001-101-11\",\"refundId\":\"\",\"createTime\":\"Fri Apr 08 06:31:53 IS  2022\",\"paymentTime\":null,\"taoBaoId\":\"\",\"orderStatus\":\"TRADE_FINISHED\",\"totalActual\":\"10.0\",\"totalPrice\":\"10.0\",\"paymentCombination\":[{\"mode\":\"2334\",\"amount\":\"20.0\"}],\"couponCodes\":\"\",\"salesOrderLine\":[{\"srcId\":\"23.0\",\"skuName\":null,\"skuCode\":null,\"skuCount\":\"23.0\",\"total\":\"\",\"totalPrice\":\"\",\"discountPrice\":\"\",\"barCode\":\"\",\"jmskuCode\":\"\"}]}";

        String outputStr = mapper.writeValueAsString(loyaltyTransactionReturnRequestOBJ);

    }

}


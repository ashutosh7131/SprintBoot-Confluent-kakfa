package com.anf.gdi.es.loyalty.consumer.sales.service;

import com.anf.gdi.es.loyalty.consumer.sales.config.AppKafkaConfig;
import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.LoyaltyTransactionRequestOBJ;
import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.SaleTransactionType;
import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.SalesTopicMessage;
import com.anf.gdi.es.loyalty.consumer.sales.util.SalesLoyaltyApiUtil;
import com.anf.kafkaservicejsonschema.KafkaServiceJsonSchema;
import com.anf.kafkaservicejsonschema.models.Consumer;
import com.anf.logservice.LoggingService;
import com.anf.logservice.models.LogRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestClientException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class SalesLoyaltyConsumerServiceImplTests {

    @Mock
    Consumer<Object> consumer;

    @Mock
    private LoggingService loggingService;

    @Mock
    private AppKafkaConfig kafkaProperties;

    @InjectMocks
    SalesLoyaltyConsumerServiceImpl service;

    @Mock
    SalesTopicMessage salesTopicMessage;

    @Mock
    SalesLoyaltyApiUtil salesLoyaltyApiUtil;

    @Mock
    LoyaltyTransactionRequestOBJ requestObj;

    @Mock
    KafkaServiceJsonSchema kafkaServiceJsonSchema;

    @Test
    @DisplayName("Should Read Message and Provide Transformed Data")
    void shouldReadMSGAndGiveTransFormedData() throws IOException, RestClientException, io.confluent.kafka.schemaregistry.client.rest.exceptions.RestClientException {
        var logger = mock(LoggingService.class);
        service.setLoggerInformation(logger);
        service.processEvent(salesTopicMessage);

        Mockito.verify(logger, Mockito.times(1)).log(Mockito.any(LogRequest.class));
    }

    @Test
    @DisplayName("Should let the consumer know that all messages are processed.")
    void shouldAllMessagesAreProcessed() throws IOException, RestClientException, JSONException, io.confluent.kafka.schemaregistry.client.rest.exceptions.RestClientException {
        String jsonStr = "{\"correlationId\":\"640868\",\"sourceSystemId\":\"1052\",\"triggerSystemId\":\"1052\",\"messageTimestamp\":\"2022-04-07T21:01:53.000-04:00\",\"saleTransactionMessage\":{\"saleTransaction\":{\"saleTransactionHDRType\":{\"sequenceNumber\":\"10001\",\"storeId\":\"101\",\"rewardsEligiblePurchaseStore\":true,\"rewardsEligibleReturnStore\":true,\"workstationId\":\"11\",\"businessDate\":\"2022-04-07T21:01:53.000-04:00\",\"storeType\":\"BRAND_STORE\",\"saleType\":\"\",\"reasonCode\":\"\",\"status\":\"COMPLETE\",\"employeeSaleId\":\"111\",\"startTime\":\"2022-04-07T21:01:53.000-04:00\",\"endTime\":\"2022-04-07T21:01:53.000-04:00\",\"cashierId\":\"001\",\"authorizerId\":\"121\",\"taxExemptId\":\"11\",\"subtotalAmount\":778.5,\"discountAmount\":-25.75,\"taxAmount\":309,\"totalAmount\":730,\"grandTotalAmount\":516.25,\"filingCurrencyConversionFactor\":735.5,\"filingCurrencyCode\":\"USD\",\"origCurrencyCode\":\"USD\",\"storeCurrencyCode\":\"USD\",\"customerInfo\":{\"lineItemNumber\":215,\"lastName\":\"X\",\"firstName\":\"Johan\",\"email\":\"johan@abc.com\",\"phone\":\"234567890\",\"address1\":\"\",\"address2\":\"\",\"city\":\"East Brunswick\",\"state\":\"NJ\",\"zipCode\":\"08816\",\"zipCodeExt\":\"\",\"country\":\"US\",\"idType\":\"\",\"idSwiped\":false,\"encryptedId\":\"\",\"customerLinkType\":\"\",\"customerLinkCode\":\"2345\",\"customerReturnLinkCode\":\"\",\"checkForRewardsAccount\":false,\"shipToAddress1\":\"ABCDEFGHIJK\",\"shipToaddress2\":\"ABCDEFGH\",\"shipTocity\":\"East Brunswick\",\"shipTostate\":\"NJ\",\"shipTozipCode\":\"08816\",\"shipTozipCodeExt\":\"\",\"shipTocountry\":\"US\",\"shipToTaxAreaId\":241,\"shippingTransportMode\":\"\",\"shippingDate\":\"2022-04-07T21:01:53.000-04:00\",\"shippingDeliveryTerms\":\"\",\"shippingOverrideReason\":\"\",\"eReceiptIndicator\":19,\"marketingEmailIndicator\":601},\"tenderList\":{\"tender\":[{\"lineItemNumber\":23,\"tenderTypeId\":\"2334\",\"tenderAmount\":20}]},\"originateEntryType\":\"\",\"originateStoreId\":\"122\",\"originateWorkstationId\":\"101\",\"originateSequenceNumber\":910,\"originateBusinessDate\":\"2022-04-07T21:01:53.000-04:00\",\"downstreamSystemList\":[],\"creditOfflineUpdate\":\"Y\",\"storeCountry\":\"US\",\"pointsForVAT\":true},\"SaleTransactionItems\":{\"saleLineItem\":[{\"lineItemNumber\":23,\"quantity\":23,\"sellAmount\":10}]}}}}";
        ObjectMapper mapper = new ObjectMapper();
        JSONObject obj = new JSONObject(jsonStr);
        byte[] jsonData = obj.toString().getBytes();
        salesTopicMessage = mapper.readValue(jsonData ,SalesTopicMessage.class);
        service.processEvent( salesTopicMessage);
        assertDoesNotThrow(() -> service.processEvent( salesTopicMessage));
    }

    @Test
    @DisplayName("Should let the consumer know that request messages processed are for purchase.")
    void shouldPurchaseMessagesAreProcessed() throws IOException, RestClientException, JSONException, io.confluent.kafka.schemaregistry.client.rest.exceptions.RestClientException {
        String jsonStr = "{\"correlationId\":\"640868\",\"sourceSystemId\":\"1052\",\"triggerSystemId\":\"1052\",\"messageTimestamp\":\"2022-04-07T21:01:53.000-04:00\",\"saleTransactionMessage\":{\"saleTransaction\":{\"saleTransactionHDRType\":{\"sequenceNumber\":\"10001\",\"storeId\":\"101\",\"rewardsEligiblePurchaseStore\":true,\"rewardsEligibleReturnStore\":true,\"workstationId\":\"11\",\"businessDate\":\"2022-04-07T21:01:53.000-04:00\",\"storeType\":\"BRAND_STORE\",\"saleType\":\"purchase\",\"reasonCode\":\"\",\"status\":\"COMPLETE\",\"employeeSaleId\":\"111\",\"startTime\":\"2022-04-07T21:01:53.000-04:00\",\"endTime\":\"2022-04-07T21:01:53.000-04:00\",\"cashierId\":\"001\",\"authorizerId\":\"121\",\"taxExemptId\":\"11\",\"subtotalAmount\":778.5,\"discountAmount\":-25.75,\"taxAmount\":309,\"totalAmount\":730,\"grandTotalAmount\":516.25,\"filingCurrencyConversionFactor\":735.5,\"filingCurrencyCode\":\"USD\",\"origCurrencyCode\":\"USD\",\"storeCurrencyCode\":\"USD\",\"customerInfo\":{\"lineItemNumber\":215,\"lastName\":\"X\",\"firstName\":\"Johan\",\"email\":\"johan@abc.com\",\"phone\":\"234567890\",\"address1\":\"\",\"address2\":\"\",\"city\":\"East Brunswick\",\"state\":\"NJ\",\"zipCode\":\"08816\",\"zipCodeExt\":\"\",\"country\":\"US\",\"idType\":\"\",\"idSwiped\":false,\"encryptedId\":\"\",\"customerLinkType\":\"\",\"customerLinkCode\":\"2345\",\"customerReturnLinkCode\":\"\",\"checkForRewardsAccount\":false,\"shipToAddress1\":\"ABCDEFGHIJK\",\"shipToaddress2\":\"ABCDEFGH\",\"shipTocity\":\"East Brunswick\",\"shipTostate\":\"NJ\",\"shipTozipCode\":\"08816\",\"shipTozipCodeExt\":\"\",\"shipTocountry\":\"US\",\"shipToTaxAreaId\":241,\"shippingTransportMode\":\"\",\"shippingDate\":\"2022-04-07T21:01:53.000-04:00\",\"shippingDeliveryTerms\":\"\",\"shippingOverrideReason\":\"\",\"eReceiptIndicator\":19,\"marketingEmailIndicator\":601},\"tenderList\":{\"tender\":[{\"lineItemNumber\":23,\"tenderTypeId\":\"2334\",\"tenderAmount\":20}]},\"originateEntryType\":\"\",\"originateStoreId\":\"122\",\"originateWorkstationId\":\"101\",\"originateSequenceNumber\":910,\"originateBusinessDate\":\"2022-04-07T21:01:53.000-04:00\",\"downstreamSystemList\":[],\"creditOfflineUpdate\":\"Y\",\"storeCountry\":\"US\",\"pointsForVAT\":true},\"SaleTransactionItems\":{\"saleLineItem\":[{\"lineItemNumber\":23,\"quantity\":23,\"sellAmount\":10}]}}}}";
        ObjectMapper mapper = new ObjectMapper();
        JSONObject obj = new JSONObject(jsonStr);
        byte[] jsonData = obj.toString().getBytes();
        salesTopicMessage = mapper.readValue(jsonData ,SalesTopicMessage.class);
        Object saleType = salesTopicMessage.getSaleTransactionMessage().getSaleTransaction().getSaleTransactionHDRType().getSaleType();
        assertTrue(saleType.equals("purchase"));
        service.processEvent( salesTopicMessage);
        assertDoesNotThrow(() -> service.processEvent( salesTopicMessage));
    }

}

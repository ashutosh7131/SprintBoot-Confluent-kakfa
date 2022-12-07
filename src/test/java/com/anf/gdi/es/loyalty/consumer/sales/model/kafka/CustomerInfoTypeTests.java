package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CustomerInfoTypeTests {
    @Test
    @DisplayName("Should be able to set the values using the setters and retrieve them using the getters.")
    void shouldBeAbleToSetTheValuesUsingTheSettersAndRetrieveThemUsingTheGetters() {

        String lastName = "Mater";
        String firstName = "Grace";
        String email = "ashutosh713@outlook.com";
        String phone = "8587097968";
        String address1 = "test-address";
        String address2 = "test-address2";
        String city = "noida";
        String state = "up";
        String zipCode = "202023";
        String zipCodeExt = "adsc@123";
        String country = "USA";
        String idType = "text";
        Boolean idSwiped = true;
        String encryptedId = "123id";
        String customerLinkType = "test";
        String customerLinkCode = "test2";
        boolean checkForRewardsAccount = false;
        String customerReturnLinkCode = "23657";
        String shipToAddress1 = "test-ship";
        String shipToAddress2 = "test-ship1";
        String shipToCity = "nn";
        String shipToState = "xyz";
        String shipToZipCode = "11289";
        String shipToZipCodeExt = "78659";
        String shipToCountry = "India";
        Integer shipToTaxAreaId = 123;
        String shippingTransportMode = "courier";
        Date shippingDate = new Date();
        String shippingDeliveryTerms = "test-term";
        String shippingOverrideReason = "test-reason";
        Integer eReceiptIndicator = 12345;
        Integer marketingEmailIndicator = 2345;
        String lineItemNumber = "123456";


        var model = new CustomerInfoType();
        model.setLastName(lastName);
        model.setFirstName(firstName);
        model.setEmail(email);
        model.setPhone(phone);
        model.setAddress1(address1);
        model.setAddress2(address2);
        model.setCity(city);
        model.setState(state);
        model.setZipCode(zipCode);
        model.setZipCodeExt(zipCodeExt);
        model.setCountry(country);
        model.setIdType(idType);
        model.setEncryptedId(encryptedId);
        model.setCustomerLinkType(customerLinkType);
        model.setCustomerLinkCode(customerLinkCode);
        model.setCheckForRewardsAccount(checkForRewardsAccount);
        model.setIdSwiped(idSwiped);
        model.setCustomerReturnLinkCode(customerReturnLinkCode);
        model.setShipToAddress1(shipToAddress1);
        model.setShipToaddress2(shipToAddress2);
        model.setShipTocity(shipToCity);
        model.setShipTostate(shipToState);
        model.setShipTozipCode(shipToZipCode);
        model.setShipTozipCodeExt(shipToZipCodeExt);
        model.setShipTocountry(shipToCountry);
        model.setShipToTaxAreaId(shipToTaxAreaId);
        model.setShippingTransportMode(shippingTransportMode);
        model.setShippingDate(shippingDate);
        model.setShippingDeliveryTerms(shippingDeliveryTerms);
        model.setShippingOverrideReason(shippingOverrideReason);
        model.seteReceiptIndicator(eReceiptIndicator);
        model.setMarketingEmailIndicator(marketingEmailIndicator);
        model.setLineItemNumber(lineItemNumber);

        assertAll(
                () -> assertEquals(lastName, model.getLastName()),
                () -> assertEquals(firstName, model.getFirstName()),
                () -> assertEquals(email, model.getEmail()),
                () -> assertEquals(phone, model.getPhone()),
                () -> assertEquals(address1, model.getAddress1()),
                () -> assertEquals(address2, model.getAddress2()),
                () -> assertEquals(city, model.getCity()),
                () -> assertEquals(state, model.getState()),
                () -> assertEquals(zipCode, model.getZipCode()),
                () -> assertEquals(zipCodeExt, model.getZipCodeExt()),
                () -> assertEquals(country, model.getCountry()),
                () -> assertEquals(idType, model.getIdType()),
                () -> assertEquals(encryptedId, model.getEncryptedId()),
                () -> assertEquals(customerLinkType, model.getCustomerLinkType()),
                () -> assertEquals(checkForRewardsAccount, model.getCheckForRewardsAccount()),
                () -> assertEquals(idSwiped, model.getIdSwiped()),
                () -> assertEquals(customerReturnLinkCode, model.getCustomerReturnLinkCode()),
                () -> assertEquals(shipToAddress1, model.getShipToAddress1()),
                () -> assertEquals(shipToAddress2, model.getShipToaddress2()),
                () -> assertEquals(shipToCity, model.getShipTocity()),
                () -> assertEquals(shipToState, model.getShipTostate()),
                () -> assertEquals(shipToZipCode, model.getShipTozipCode()),
                () -> assertEquals(zipCodeExt, model.getZipCodeExt()),
                () -> assertEquals(country, model.getCountry()),
                () -> assertEquals(idType, model.getIdType()),
                () -> assertEquals(encryptedId, model.getEncryptedId()),
                () -> assertEquals(customerLinkType, model.getCustomerLinkType()),
                () -> assertEquals(customerLinkCode, model.getCustomerLinkCode()),
                () -> assertEquals(checkForRewardsAccount, model.getCheckForRewardsAccount()),
                () -> assertEquals(idSwiped, model.getIdSwiped()),
                () -> assertEquals(customerReturnLinkCode, model.getCustomerReturnLinkCode()),
                () -> assertEquals(shipToAddress1, model.getShipToAddress1()),
                () -> assertEquals(shipToAddress2, model.getShipToaddress2()),
                () -> assertEquals(shipToCity, model.getShipTocity()),
                () -> assertEquals(shipToState, model.getShipTostate()),
                () -> assertEquals(shipToZipCode, model.getShipTozipCode()),
                () -> assertEquals(shipToZipCodeExt, model.getShipTozipCodeExt()),
                () -> assertEquals(shipToCountry, model.getShipTocountry()),
                () -> assertEquals(shipToTaxAreaId, model.getShipToTaxAreaId()),
                () -> assertEquals(shippingTransportMode, model.getShippingTransportMode()),
                () -> assertEquals(shippingDate, model.getShippingDate()),
                () -> assertEquals(shippingDeliveryTerms, model.getShippingDeliveryTerms()),
                () -> assertEquals(shippingOverrideReason, model.getShippingOverrideReason()),
                () -> assertEquals(eReceiptIndicator, model.geteReceiptIndicator()),
                () -> assertEquals(lineItemNumber, model.getLineItemNumber()),
                () -> assertEquals(marketingEmailIndicator, model.getMarketingEmailIndicator()));
    }

}

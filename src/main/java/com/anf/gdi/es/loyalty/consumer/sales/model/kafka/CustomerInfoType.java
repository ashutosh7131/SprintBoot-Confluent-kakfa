
package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import java.util.Date;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lastName",
        "firstName",
        "email",
        "phone",
        "address1",
        "address2",
        "city",
        "state",
        "zipCode",
        "zipCodeExt",
        "country",
        "idType",
        "idSwiped",
        "encryptedId",
        "customerLinkType",
        "customerLinkCode",
        "customerReturnLinkCode",
        "checkForRewardsAccount",
        "shipToAddress1",
        "shipToaddress2",
        "shipTocity",
        "shipTostate",
        "shipTozipCode",
        "shipTozipCodeExt",
        "shipTocountry",
        "shipToTaxAreaId",
        "shippingTransportMode",
        "shippingDate",
        "shippingDeliveryTerms",
        "shippingOverrideReason",
        "eReceiptIndicator",
        "marketingEmailIndicator",
        "lineItemNumber"
})
@Generated("jsonschema2pojo")
public class CustomerInfoType {

    @JsonProperty("lastName")
    @JsonPropertyDescription("Last Name")
    private String lastName;
    @JsonProperty("firstName")
    @JsonPropertyDescription("First Name")
    private String firstName;
    @JsonProperty("email")
    @JsonPropertyDescription("Email Address")
    private String email;
    @JsonProperty("phone")
    @JsonPropertyDescription("Phone Number")
    private String phone;
    @JsonProperty("address1")
    @JsonPropertyDescription("Address Line 1")
    private String address1;
    @JsonProperty("address2")
    @JsonPropertyDescription("Address Line 2")
    private String address2;
    @JsonProperty("city")
    @JsonPropertyDescription("City")
    private String city;
    @JsonProperty("state")
    @JsonPropertyDescription("State")
    private String state;
    @JsonProperty("zipCode")
    @JsonPropertyDescription("Zip Code")
    private String zipCode;
    @JsonProperty("zipCodeExt")
    @JsonPropertyDescription("Zip Code Ext")
    private String zipCodeExt;
    @JsonProperty("country")
    @JsonPropertyDescription("Country")
    private String country;
    @JsonProperty("idType")
    @JsonPropertyDescription("Id Type")
    private String idType;
    @JsonProperty("idSwiped")
    @JsonPropertyDescription("Id Swiped Flag")
    private Boolean idSwiped;
    @JsonProperty("encryptedId")
    @JsonPropertyDescription("Encrypted Id")
    private String encryptedId;
    @JsonProperty("customerLinkType")
    @JsonPropertyDescription("Customer Link Type")
    private String customerLinkType;
    @JsonProperty("customerLinkCode")
    @JsonPropertyDescription("Customer Link Code")
    private String customerLinkCode;
    @JsonProperty("customerReturnLinkCode")
    @JsonPropertyDescription("Customer Returns Link Code")
    private String customerReturnLinkCode;
    @JsonProperty("checkForRewardsAccount")
    @JsonPropertyDescription("Check Rewards Account Flag")
    private Boolean checkForRewardsAccount;
    @JsonProperty("shipToAddress1")
    @JsonPropertyDescription("Shipt TO Address 1")
    private String shipToAddress1;
    @JsonProperty("shipToaddress2")
    @JsonPropertyDescription("Shipt To Address 2")
    private String shipToaddress2;
    @JsonProperty("shipTocity")
    @JsonPropertyDescription("Shipt To City")
    private String shipTocity;
    @JsonProperty("shipTostate")
    @JsonPropertyDescription("Ship To State")
    private String shipTostate;
    @JsonProperty("shipTozipCode")
    @JsonPropertyDescription("Ship To Zip Code")
    private String shipTozipCode;
    @JsonProperty("shipTozipCodeExt")
    @JsonPropertyDescription("Ship To Zip Code Ext")
    private String shipTozipCodeExt;
    @JsonProperty("shipTocountry")
    @JsonPropertyDescription("Ship To Country")
    private String shipToCountry;
    @JsonProperty("shipToTaxAreaId")
    @JsonPropertyDescription("Ship To Tax Area Id")
    private Integer shipToTaxAreaId;
    @JsonProperty("shippingTransportMode")
    @JsonPropertyDescription("Shipping Transport Mode")
    private String shippingTransportMode;
    @JsonProperty("shippingDate")
    @JsonPropertyDescription("Shipping Date")
    private Date shippingDate;
    @JsonProperty("shippingDeliveryTerms")
    @JsonPropertyDescription("Shipping Delivery terms")
    private String shippingDeliveryTerms;
    @JsonProperty("shippingOverrideReason")
    @JsonPropertyDescription("Shipping Override Reason")
    private String shippingOverrideReason;
    @JsonProperty("eReceiptIndicator")
    @JsonPropertyDescription("Ereceipt Indicator")
    private Integer eReceiptIndicator;
    @JsonProperty("marketingEmailIndicator")
    @JsonPropertyDescription("Marketing Email Indicator")
    private Integer marketingEmailIndicator;

    @JsonProperty("lineItemNumber")
    @JsonPropertyDescription("Line Item Number")
    private String lineItemNumber;

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("lineItemNumber")
    public String getLineItemNumber() {
        return lineItemNumber;
    }

    @JsonProperty("lineItemNumber")
    public void setLineItemNumber(String lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
    }
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("zipCodeExt")
    public String getZipCodeExt() {
        return zipCodeExt;
    }

    @JsonProperty("zipCodeExt")
    public void setZipCodeExt(String zipCodeExt) {
        this.zipCodeExt = zipCodeExt;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("idType")
    public String getIdType() {
        return idType;
    }

    @JsonProperty("idType")
    public void setIdType(String idType) {
        this.idType = idType;
    }

    @JsonProperty("idSwiped")
    public Boolean getIdSwiped() {
        return idSwiped;
    }

    @JsonProperty("idSwiped")
    public void setIdSwiped(Boolean idSwiped) {
        this.idSwiped = idSwiped;
    }

    @JsonProperty("encryptedId")
    public String getEncryptedId() {
        return encryptedId;
    }

    @JsonProperty("encryptedId")
    public void setEncryptedId(String encryptedId) {
        this.encryptedId = encryptedId;
    }

    @JsonProperty("customerLinkType")
    public String getCustomerLinkType() {
        return customerLinkType;
    }

    @JsonProperty("customerLinkType")
    public void setCustomerLinkType(String customerLinkType) {
        this.customerLinkType = customerLinkType;
    }

    @JsonProperty("customerLinkCode")
    public String getCustomerLinkCode() {
        return customerLinkCode;
    }

    @JsonProperty("customerLinkCode")
    public void setCustomerLinkCode(String customerLinkCode) {
        this.customerLinkCode = customerLinkCode;
    }

    @JsonProperty("customerReturnLinkCode")
    public String getCustomerReturnLinkCode() {
        return customerReturnLinkCode;
    }

    @JsonProperty("customerReturnLinkCode")
    public void setCustomerReturnLinkCode(String customerReturnLinkCode) {
        this.customerReturnLinkCode = customerReturnLinkCode;
    }

    @JsonProperty("checkForRewardsAccount")
    public Boolean getCheckForRewardsAccount() {
        return checkForRewardsAccount;
    }

    @JsonProperty("checkForRewardsAccount")
    public void setCheckForRewardsAccount(Boolean checkForRewardsAccount) {
        this.checkForRewardsAccount = checkForRewardsAccount;
    }

    @JsonProperty("shipToAddress1")
    public String getShipToAddress1() {
        return shipToAddress1;
    }

    @JsonProperty("shipToAddress1")
    public void setShipToAddress1(String shipToAddress1) {
        this.shipToAddress1 = shipToAddress1;
    }

    @JsonProperty("shipToaddress2")
    public String getShipToaddress2() {
        return shipToaddress2;
    }

    @JsonProperty("shipToaddress2")
    public void setShipToaddress2(String shipToaddress2) {
        this.shipToaddress2 = shipToaddress2;
    }

    @JsonProperty("shipTocity")
    public String getShipTocity() {
        return shipTocity;
    }

    @JsonProperty("shipTocity")
    public void setShipTocity(String shipTocity) {
        this.shipTocity = shipTocity;
    }

    @JsonProperty("shipTostate")
    public String getShipTostate() {
        return shipTostate;
    }

    @JsonProperty("shipTostate")
    public void setShipTostate(String shipTostate) {
        this.shipTostate = shipTostate;
    }

    @JsonProperty("shipTozipCode")
    public String getShipTozipCode() {
        return shipTozipCode;
    }

    @JsonProperty("shipTozipCode")
    public void setShipTozipCode(String shipTozipCode) {
        this.shipTozipCode = shipTozipCode;
    }

    @JsonProperty("shipTozipCodeExt")
    public String getShipTozipCodeExt() {
        return shipTozipCodeExt;
    }

    @JsonProperty("shipTozipCodeExt")
    public void setShipTozipCodeExt(String shipTozipCodeExt) {
        this.shipTozipCodeExt = shipTozipCodeExt;
    }

    @JsonProperty("shipTocountry")
    public String getShipTocountry() {
        return shipToCountry;
    }

    @JsonProperty("shipTocountry")
    public void setShipTocountry(String shipTocountry) {
        this.shipToCountry = shipTocountry;
    }

    @JsonProperty("shipToTaxAreaId")
    public Integer getShipToTaxAreaId() {
        return shipToTaxAreaId;
    }

    @JsonProperty("shipToTaxAreaId")
    public void setShipToTaxAreaId(Integer shipToTaxAreaId) {
        this.shipToTaxAreaId = shipToTaxAreaId;
    }

    @JsonProperty("shippingTransportMode")
    public String getShippingTransportMode() {
        return shippingTransportMode;
    }

    @JsonProperty("shippingTransportMode")
    public void setShippingTransportMode(String shippingTransportMode) {
        this.shippingTransportMode = shippingTransportMode;
    }

    @JsonProperty("shippingDate")
    public Date getShippingDate() {
        return shippingDate;
    }

    @JsonProperty("shippingDate")
    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    @JsonProperty("shippingDeliveryTerms")
    public String getShippingDeliveryTerms() {
        return shippingDeliveryTerms;
    }

    @JsonProperty("shippingDeliveryTerms")
    public void setShippingDeliveryTerms(String shippingDeliveryTerms) {
        this.shippingDeliveryTerms = shippingDeliveryTerms;
    }

    @JsonProperty("shippingOverrideReason")
    public String getShippingOverrideReason() {
        return shippingOverrideReason;
    }

    @JsonProperty("shippingOverrideReason")
    public void setShippingOverrideReason(String shippingOverrideReason) {
        this.shippingOverrideReason = shippingOverrideReason;
    }

    @JsonProperty("eReceiptIndicator")
    public Integer geteReceiptIndicator() {
        return eReceiptIndicator;
    }

    @JsonProperty("eReceiptIndicator")
    public void seteReceiptIndicator(Integer eReceiptIndicator) {
        this.eReceiptIndicator = eReceiptIndicator;
    }

    @JsonProperty("marketingEmailIndicator")
    public Integer getMarketingEmailIndicator() {
        return marketingEmailIndicator;
    }

    @JsonProperty("marketingEmailIndicator")
    public void setMarketingEmailIndicator(Integer marketingEmailIndicator) {
        this.marketingEmailIndicator = marketingEmailIndicator;
    }

}


package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Sale Transaction HDR Type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lineItemNumber",
        "itemId",
        "origItemId",
        "quantity",
        "nonMerch",
        "ticketAmount",
        "sellAmount",
        "discountAmount",
        "taxAmount",
        "extendedAmount",
        "voided",
        "giftReceiptPrinted",
        "maskedGiftCardId",
        "taxGroupId",
        "origStoreId",
        "origBusinessDay",
        "origWorkstationId",
        "origSequenceNumber",
        "origLineItemNumber",
        "origReceiptEntryMethod",
        "origReceiptType",
        "entryMethod",
        "returnReasonCode",
        "priceOverride",
        "priceOverrideReasonCode",
        "taxOverride",
        "giftCardRequestType",
        "encryptedGiftCardNumber",
        "shippingIntrastatCode",
        "shippingMass",
        "shippingCountryOfOrigin",
        "shippingFromCountry",
        "discountLineItemList",
        "taxLineItemList",
        "priceTypeCode",
        "originateStockOutReasonCode",
        "fulfillStoreID",
        "omniCode"
})
@Generated("jsonschema2pojo")
public class SaleLineItemType {

    @JsonProperty("lineItemNumber")
    @JsonPropertyDescription("Sales Transaction Sequence Number")
    private Double lineItemNumber;
    @JsonProperty("itemId")
    @JsonPropertyDescription("Item Id")
    private String itemId;
    /**
     * Orig Item Id
     */
    @JsonProperty("origItemId")
    @JsonPropertyDescription("Orig Item Id")
    private String origItemId;
    @JsonProperty("quantity")
    @JsonPropertyDescription("Quantity")
    private Double quantity;
    @JsonProperty("nonMerch")
    @JsonPropertyDescription("Non Merch Flag")
    private Boolean nonMerch;
    @JsonProperty("ticketAmount")
    @JsonPropertyDescription("Ticket Amount")
    private Double ticketAmount;
    @JsonProperty("sellAmount")
    @JsonPropertyDescription("Sell Amount")
    private Double sellAmount;
    @JsonProperty("discountAmount")
    @JsonPropertyDescription("Discount Amount")
    private Double discountAmount;
    @JsonProperty("taxAmount")
    @JsonPropertyDescription("Tax Amount")
    private Double taxAmount;
    @JsonProperty("extendedAmount")
    @JsonPropertyDescription("Entended Amount")
    private Double extendedAmount;
    @JsonProperty("voided")
    @JsonPropertyDescription("Voided status flag")
    private Boolean voided;
    @JsonProperty("giftReceiptPrinted")
    @JsonPropertyDescription("Gift Receipt Printed Flag")
    private Boolean giftReceiptPrinted;
    @JsonProperty("maskedGiftCardId")
    @JsonPropertyDescription("Masked Gift Card Id")
    private String maskedGiftCardId;
    @JsonProperty("taxGroupId")
    @JsonPropertyDescription("Tax Group Id")
    private String taxGroupId;
    @JsonProperty("origStoreId")
    @JsonPropertyDescription("Orig Store Id")
    private String origStoreId;
    @JsonProperty("origBusinessDay")
    @JsonPropertyDescription("Orig Business Day")
    private String origBusinessDay;
    @JsonProperty("origWorkstationId")
    @JsonPropertyDescription("orig Workstation id")
    private String origWorkstationId;
    @JsonProperty("origSequenceNumber")
    @JsonPropertyDescription("Orig Sequence NUmber")
    private Double origSequenceNumber;
    @JsonProperty("origLineItemNumber")
    @JsonPropertyDescription("Orig Line Item Number")
    private String origLineItemNumber;
    @JsonProperty("origReceiptEntryMethod")
    @JsonPropertyDescription("Entry Method Code")
    private Object origReceiptEntryMethod;
    @JsonProperty("origReceiptType")
    @JsonPropertyDescription("Orig Receipt Type")
    private Object origReceiptType;
    @JsonProperty("entryMethod")
    @JsonPropertyDescription("Entry Method Code")
    private Object entryMethod;
    @JsonProperty("returnReasonCode")
    @JsonPropertyDescription("Return Reason Code")
    private String returnReasonCode;
    @JsonProperty("priceOverride")
    @JsonPropertyDescription("Origin Currency Code")
    private Boolean priceOverride;
    @JsonProperty("priceOverrideReasonCode")
    @JsonPropertyDescription("Prie Override Reason Code")
    private String priceOverrideReasonCode;
    @JsonProperty("taxOverride")
    @JsonPropertyDescription("Tax Override")
    private Boolean taxOverride;
    @JsonProperty("giftCardRequestType")
    @JsonPropertyDescription("Gift Card Request Type")
    private Object giftCardRequestType;

    @JsonProperty("encryptedGiftCardNumber")
    @JsonPropertyDescription("Encrypted Gift Card NUmber")
    private String encryptedGiftCardNumber;
    @JsonProperty("shippingIntrastatCode")
    @JsonPropertyDescription("Shipping Intra Stat Code")
    private String shippingIntrastatCode;
    @JsonProperty("shippingMass")
    @JsonPropertyDescription("Shipping Mass")
    private String shippingMass;

    @JsonProperty("shippingCountryOfOrigin")
    @JsonPropertyDescription("Shipping Country Origin")
    private Double shippingCountryOfOrigin;
    @JsonProperty("shippingFromCountry")
    @JsonPropertyDescription("Shipping from Country")
    private String shippingFromCountry;
    @JsonProperty("discountLineItemList")
    private DiscountLineItemListType discountLineItemList;
    @JsonProperty("taxLineItemList")
    private TaxLineItemListType taxLineItemList;
    @JsonProperty("priceTypeCode")
    @JsonPropertyDescription("Priec Type Code")
    private Double priceTypeCode;
    /**
     * Originate Stock Out Reason Code
     */
    @JsonProperty("originateStockOutReasonCode")
    @JsonPropertyDescription("Originate Stock Out Reason Code")
    private Double originateStockOutReasonCode;
    @JsonProperty("fulfillStoreID")
    @JsonPropertyDescription("Fulfill Store Id")
    private String fulfillStoreID;
    @JsonProperty("omniCode")
    @JsonPropertyDescription("Omni Code")
    private String omniCode;

    @JsonProperty("lineItemNumber")
    public Double getLineItemNumber() {
        return lineItemNumber;
    }

    @JsonProperty("lineItemNumber")
    public void setLineItemNumber(Double lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
    }

    @JsonProperty("itemId")
    public String getItemId() {
        return itemId;
    }

    @JsonProperty("itemId")
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("origItemId")
    public String getOrigItemId() {
        return origItemId;
    }

    @JsonProperty("origItemId")
    public void setOrigItemId(String origItemId) {
        this.origItemId = origItemId;
    }

    @JsonProperty("quantity")
    public Double getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("nonMerch")
    public Boolean getNonMerch() {
        return nonMerch;
    }

    @JsonProperty("nonMerch")
    public void setNonMerch(Boolean nonMerch) {
        this.nonMerch = nonMerch;
    }

    @JsonProperty("ticketAmount")
    public Double getTicketAmount() {
        return ticketAmount;
    }

    @JsonProperty("ticketAmount")
    public void setTicketAmount(Double ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    @JsonProperty("sellAmount")
    public Double getSellAmount() {
        return sellAmount;
    }

    @JsonProperty("sellAmount")
    public void setSellAmount(Double sellAmount) {
        this.sellAmount = sellAmount;
    }

    @JsonProperty("discountAmount")
    public Double getDiscountAmount() {
        return discountAmount;
    }

    @JsonProperty("discountAmount")
    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @JsonProperty("taxAmount")
    public Double getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("taxAmount")
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    @JsonProperty("extendedAmount")
    public Double getExtendedAmount() {
        return extendedAmount;
    }

    @JsonProperty("extendedAmount")
    public void setExtendedAmount(Double extendedAmount) {
        this.extendedAmount = extendedAmount;
    }

    @JsonProperty("voided")
    public Boolean getVoided() {
        return voided;
    }

    @JsonProperty("voided")
    public void setVoided(Boolean voided) {
        this.voided = voided;
    }

    @JsonProperty("giftReceiptPrinted")
    public Boolean getGiftReceiptPrinted() {
        return giftReceiptPrinted;
    }

    @JsonProperty("giftReceiptPrinted")
    public void setGiftReceiptPrinted(Boolean giftReceiptPrinted) {
        this.giftReceiptPrinted = giftReceiptPrinted;
    }

    @JsonProperty("maskedGiftCardId")
    public String getMaskedGiftCardId() {
        return maskedGiftCardId;
    }

    @JsonProperty("maskedGiftCardId")
    public void setMaskedGiftCardId(String maskedGiftCardId) {
        this.maskedGiftCardId = maskedGiftCardId;
    }

    @JsonProperty("taxGroupId")
    public String getTaxGroupId() {
        return taxGroupId;
    }

    @JsonProperty("taxGroupId")
    public void setTaxGroupId(String taxGroupId) {
        this.taxGroupId = taxGroupId;
    }

    @JsonProperty("origStoreId")
    public String getOrigStoreId() {
        return origStoreId;
    }

    @JsonProperty("origStoreId")
    public void setOrigStoreId(String origStoreId) {
        this.origStoreId = origStoreId;
    }

    @JsonProperty("origBusinessDay")
    public String getOrigBusinessDay() {
        return origBusinessDay;
    }

    @JsonProperty("origBusinessDay")
    public void setOrigBusinessDay(String origBusinessDay) {
        this.origBusinessDay = origBusinessDay;
    }

    @JsonProperty("origWorkstationId")
    public String getOrigWorkstationId() {
        return origWorkstationId;
    }

    @JsonProperty("origWorkstationId")
    public void setOrigWorkstationId(String origWorkstationId) {
        this.origWorkstationId = origWorkstationId;
    }

    @JsonProperty("origSequenceNumber")
    public Double getOrigSequenceNumber() {
        return origSequenceNumber;
    }

    @JsonProperty("origSequenceNumber")
    public void setOrigSequenceNumber(Double origSequenceNumber) {
        this.origSequenceNumber = origSequenceNumber;
    }

    @JsonProperty("origLineItemNumber")
    public String getOrigLineItemNumber() {
        return origLineItemNumber;
    }

    @JsonProperty("origLineItemNumber")
    public void setOrigLineItemNumber(String origLineItemNumber) {
        this.origLineItemNumber = origLineItemNumber;
    }

    @JsonProperty("origReceiptEntryMethod")
    public Object getOrigReceiptEntryMethod() {
        return origReceiptEntryMethod;
    }

    @JsonProperty("origReceiptEntryMethod")
    public void setOrigReceiptEntryMethod(Object origReceiptEntryMethod) {
        this.origReceiptEntryMethod = origReceiptEntryMethod;
    }

    @JsonProperty("origReceiptType")
    public Object getOrigReceiptType() {
        return origReceiptType;
    }

    @JsonProperty("origReceiptType")
    public void setOrigReceiptType(Object origReceiptType) {
        this.origReceiptType = origReceiptType;
    }

    @JsonProperty("entryMethod")
    public Object getEntryMethod() {
        return entryMethod;
    }

    @JsonProperty("entryMethod")
    public void setEntryMethod(Object entryMethod) {
        this.entryMethod = entryMethod;
    }

    @JsonProperty("returnReasonCode")
    public String getReturnReasonCode() {
        return returnReasonCode;
    }

    @JsonProperty("returnReasonCode")
    public void setReturnReasonCode(String returnReasonCode) {
        this.returnReasonCode = returnReasonCode;
    }

    @JsonProperty("priceOverride")
    public Boolean getPriceOverride() {
        return priceOverride;
    }

    @JsonProperty("priceOverride")
    public void setPriceOverride(Boolean priceOverride) {
        this.priceOverride = priceOverride;
    }

    @JsonProperty("priceOverrideReasonCode")
    public String getPriceOverrideReasonCode() {
        return priceOverrideReasonCode;
    }

    @JsonProperty("priceOverrideReasonCode")
    public void setPriceOverrideReasonCode(String priceOverrideReasonCode) {
        this.priceOverrideReasonCode = priceOverrideReasonCode;
    }

    @JsonProperty("taxOverride")
    public Boolean getTaxOverride() {
        return taxOverride;
    }

    @JsonProperty("taxOverride")
    public void setTaxOverride(Boolean taxOverride) {
        this.taxOverride = taxOverride;
    }

    @JsonProperty("giftCardRequestType")
    public Object getGiftCardRequestType() {
        return giftCardRequestType;
    }

    @JsonProperty("giftCardRequestType")
    public void setGiftCardRequestType(Object giftCardRequestType) {
        this.giftCardRequestType = giftCardRequestType;
    }

    @JsonProperty("encryptedGiftCardNumber")
    public String getEncryptedGiftCardNumber() {
        return encryptedGiftCardNumber;
    }

    @JsonProperty("encryptedGiftCardNumber")
    public void setEncryptedGiftCardNumber(String encryptedGiftCardNumber) {
        this.encryptedGiftCardNumber = encryptedGiftCardNumber;
    }

    @JsonProperty("shippingIntrastatCode")
    public String getShippingIntrastatCode() {
        return shippingIntrastatCode;
    }

    @JsonProperty("shippingIntrastatCode")
    public void setShippingIntrastatCode(String shippingIntrastatCode) {
        this.shippingIntrastatCode = shippingIntrastatCode;
    }

    @JsonProperty("shippingMass")
    public String getShippingMass() {
        return shippingMass;
    }

    @JsonProperty("shippingMass")
    public void setShippingMass(String shippingMass) {
        this.shippingMass = shippingMass;
    }

    @JsonProperty("shippingCountryOfOrigin")
    public Double getShippingCountryOfOrigin() {
        return shippingCountryOfOrigin;
    }

    @JsonProperty("shippingCountryOfOrigin")
    public void setShippingCountryOfOrigin(Double shippingCountryOfOrigin) {
        this.shippingCountryOfOrigin = shippingCountryOfOrigin;
    }

    @JsonProperty("shippingFromCountry")
    public String getShippingFromCountry() {
        return shippingFromCountry;
    }

    @JsonProperty("shippingFromCountry")
    public void setShippingFromCountry(String shippingFromCountry) {
        this.shippingFromCountry = shippingFromCountry;
    }

    @JsonProperty("discountLineItemList")
    public DiscountLineItemListType getDiscountLineItemList() {
        return discountLineItemList;
    }

    @JsonProperty("discountLineItemList")
    public void setDiscountLineItemList(DiscountLineItemListType discountLineItemList) {
        this.discountLineItemList = discountLineItemList;
    }

    @JsonProperty("taxLineItemList")
    public TaxLineItemListType getTaxLineItemList() {
        return taxLineItemList;
    }

    @JsonProperty("taxLineItemList")
    public void setTaxLineItemList(TaxLineItemListType taxLineItemList) {
        this.taxLineItemList = taxLineItemList;
    }

    @JsonProperty("priceTypeCode")
    public Double getPriceTypeCode() {
        return priceTypeCode;
    }

    @JsonProperty("priceTypeCode")
    public void setPriceTypeCode(Double priceTypeCode) {
        this.priceTypeCode = priceTypeCode;
    }

    @JsonProperty("originateStockOutReasonCode")
    public Double getOriginateStockOutReasonCode() {
        return originateStockOutReasonCode;
    }

    @JsonProperty("originateStockOutReasonCode")
    public void setOriginateStockOutReasonCode(Double originateStockOutReasonCode) {
        this.originateStockOutReasonCode = originateStockOutReasonCode;
    }

    @JsonProperty("fulfillStoreID")
    public String getFulfillStoreID() {
        return fulfillStoreID;
    }

    @JsonProperty("fulfillStoreID")
    public void setFulfillStoreID(String fulfillStoreID) {
        this.fulfillStoreID = fulfillStoreID;
    }

    @JsonProperty("omniCode")
    public String getOmniCode() {
        return omniCode;
    }

    @JsonProperty("omniCode")
    public void setOmniCode(String omniCode) {
        this.omniCode = omniCode;
    }

}

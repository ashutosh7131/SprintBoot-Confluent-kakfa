
package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sequenceNumber",
        "storeId",
        "rewardsEligiblePurchaseStore",
        "rewardsEligibleReturnStore",
        "workstationId",
        "businessDate",
        "storeType",
        "saleType",
        "reasonCode",
        "status",
        "employeeSaleId",
        "startTime",
        "endTime",
        "cashierId",
        "authorizerId",
        "taxExemptId",
        "subtotalAmount",
        "discountAmount",
        "taxAmount",
        "totalAmount",
        "grandTotalAmount",
        "filingCurrencyConversionFactor",
        "filingCurrencyCode",
        "origCurrencyCode",
        "storeCurrencyCode",
        "customerInfo",
        "tenderList",
        "originateEntryType",
        "originateStoreId",
        "originateWorkstationId",
        "originateSequenceNumber",
        "originateBusinessDate",
        "downstreamSystemList",
        "creditOfflineUpdate",
        "pointsForVAT",
        "storeCountry"
})
@Generated("jsonschema2pojo")
public class SaleTransactionHDRType {

    @JsonProperty("sequenceNumber")
    @JsonPropertyDescription("Sales Transaction Sequence Number")
    private String sequenceNumber;
    @JsonProperty("storeId")
    @JsonPropertyDescription("Sales Transaction Sequence Number")
    private String storeId;
    @JsonProperty("rewardsEligiblePurchaseStore")
    @JsonPropertyDescription("rewards Eligible Purchase Store Flag")
    private Boolean rewardsEligiblePurchaseStore;
    @JsonProperty("rewardsEligibleReturnStore")
    @JsonPropertyDescription("rewards Eligible Return Store Flag")
    private Boolean rewardsEligibleReturnStore;
    @JsonProperty("workstationId")
    @JsonPropertyDescription("Work Station Id")
    private String workstationId;

    @JsonProperty("businessDate")
    @JsonPropertyDescription("business Date")
    private Date businessDate;

    @JsonProperty("storeType")
    @JsonPropertyDescription("Store Type")
    private Object storeType;

    @JsonProperty("saleType")
    @JsonPropertyDescription("Sale Type")
    private Object saleType;

    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Reason Code")
    private String reasonCode;

    @JsonProperty("status")
    @JsonPropertyDescription("Sale Status")
    private String status;

    @JsonProperty("employeeSaleId")
    @JsonPropertyDescription("Employee Sale Id")
    private String employeeSaleId;

    @JsonProperty("startTime")
    @JsonPropertyDescription("start time")
    private Date startTime;

    @JsonProperty("endTime")
    @JsonPropertyDescription("end Time")
    private Date endTime;

    @JsonProperty("cashierId")
    @JsonPropertyDescription("Store Cashier Id")
    private String cashierId;

    @JsonProperty("authorizerId")
    @JsonPropertyDescription("Authorizer Id")
    private String authorizerId;

    @JsonProperty("taxExemptId")
    @JsonPropertyDescription("Tax Exempt Id")
    private String taxExemptId;

    @JsonProperty("subtotalAmount")
    @JsonPropertyDescription("Sub Total Amount")
    private Double subtotalAmount;

    @JsonProperty("discountAmount")
    @JsonPropertyDescription("discount Amount")
    private Double discountAmount;

    @JsonProperty("taxAmount")
    @JsonPropertyDescription("Tax Amount")
    private Double taxAmount;

    @JsonProperty("totalAmount")
    @JsonPropertyDescription("Total Amount")
    private Double totalAmount;

    @JsonProperty("grandTotalAmount")
    @JsonPropertyDescription("Grand Total Amount")
    private Double grandTotalAmount;

    @JsonProperty("filingCurrencyConversionFactor")
    @JsonPropertyDescription("Currency Conversion Factor")
    private Double filingCurrencyConversionFactor;

    @JsonProperty("filingCurrencyCode")
    @JsonPropertyDescription("Filing Currency Code")
    private String filingCurrencyCode;

    @JsonProperty("origCurrencyCode")
    @JsonPropertyDescription("Origin Currency Code")
    private String origCurrencyCode;

    @JsonProperty("storeCurrencyCode")
    @JsonPropertyDescription("Store currency Code")
    private String storeCurrencyCode;

    @JsonProperty("customerInfo")
    @JsonPropertyDescription("Customer Info")
    private CustomerInfoType customerInfo;
    @JsonProperty("tenderList")
    private TenderListType tenderList;

    @JsonProperty("originateEntryType")
    @JsonPropertyDescription("Orginate Entry Type")
    private String originateEntryType;

    @JsonProperty("originateStoreId")
    @JsonPropertyDescription("Orig Store Id")
    private String originateStoreId;

    @JsonProperty("originateWorkstationId")
    @JsonPropertyDescription("Originate Work Station Id")
    private String originateWorkstationId;

    @JsonProperty("originateSequenceNumber")
    @JsonPropertyDescription("Originate Seq NUmber")
    private Integer originateSequenceNumber;

    @JsonProperty("originateBusinessDate")
    @JsonPropertyDescription("Originate Business Date")
    private Date originateBusinessDate;

    @JsonProperty("downstreamSystemList")
    @JsonPropertyDescription("Down Stream System List")
    private Object downstreamSystemList;

    @JsonProperty("creditOfflineUpdate")
    @JsonPropertyDescription("Credit Off Line Update Code ENUM")
    private CreditOfflineUpdateCode creditOfflineUpdate;

    @JsonProperty("storeCountry")
    @JsonPropertyDescription("Store Country")
    private String storeCountry;

    @JsonProperty("pointsForVAT")
    @JsonPropertyDescription("Points for VAT")
    private boolean pointsForVAT;

    @JsonProperty("sequenceNumber")
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @JsonProperty("storeId")
    public String getStoreId() {
        return storeId;
    }

    @JsonProperty("storeId")
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @JsonProperty("rewardsEligiblePurchaseStore")
    public Boolean getRewardsEligiblePurchaseStore() {
        return rewardsEligiblePurchaseStore;
    }

    @JsonProperty("rewardsEligiblePurchaseStore")
    public void setRewardsEligiblePurchaseStore(Boolean rewardsEligiblePurchaseStore) {
        this.rewardsEligiblePurchaseStore = rewardsEligiblePurchaseStore;
    }

    @JsonProperty("rewardsEligibleReturnStore")
    public Boolean getRewardsEligibleReturnStore() {
        return rewardsEligibleReturnStore;
    }

    @JsonProperty("rewardsEligibleReturnStore")
    public void setRewardsEligibleReturnStore(Boolean rewardsEligibleReturnStore) {
        this.rewardsEligibleReturnStore = rewardsEligibleReturnStore;
    }

    @JsonProperty("workstationId")
    public String getWorkstationId() {
        return workstationId;
    }

    @JsonProperty("workstationId")
    public void setWorkstationId(String workstationId) {
        this.workstationId = workstationId;
    }

    @JsonProperty("businessDate")
    public Date getBusinessDate() {
        return businessDate;
    }

    @JsonProperty("businessDate")
    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    @JsonProperty("storeType")
    public Object getStoreType() {
        return storeType;
    }

    @JsonProperty("storeType")
    public void setStoreType(Object storeType) {
        this.storeType = storeType;
    }

    @JsonProperty("saleType")
    public Object getSaleType() {
        return saleType;
    }

    @JsonProperty("saleType")
    public void setSaleType(Object saleType) {
        this.saleType = saleType;
    }

    @JsonProperty("reasonCode")
    public String getReasonCode() {
        return reasonCode;
    }

    @JsonProperty("reasonCode")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("employeeSaleId")
    public String getEmployeeSaleId() {
        return employeeSaleId;
    }

    @JsonProperty("employeeSaleId")
    public void setEmployeeSaleId(String employeeSaleId) {
        this.employeeSaleId = employeeSaleId;
    }

    @JsonProperty("startTime")
    public Date getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("endTime")
    public Date getEndTime() {
        return endTime;
    }

    @JsonProperty("endTime")
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @JsonProperty("cashierId")
    public String getCashierId() {
        return cashierId;
    }

    @JsonProperty("cashierId")
    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    @JsonProperty("authorizerId")
    public String getAuthorizerId() {
        return authorizerId;
    }

    @JsonProperty("authorizerId")
    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    @JsonProperty("taxExemptId")
    public String getTaxExemptId() {
        return taxExemptId;
    }

    @JsonProperty("taxExemptId")
    public void setTaxExemptId(String taxExemptId) {
        this.taxExemptId = taxExemptId;
    }

    @JsonProperty("subtotalAmount")
    public Double getSubtotalAmount() {
        return subtotalAmount;
    }

    @JsonProperty("subtotalAmount")
    public void setSubtotalAmount(Double subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
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

    @JsonProperty("totalAmount")
    public Double getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("totalAmount")
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @JsonProperty("grandTotalAmount")
    public Double getGrandTotalAmount() {
        return grandTotalAmount;
    }

    @JsonProperty("grandTotalAmount")
    public void setGrandTotalAmount(Double grandTotalAmount) {
        this.grandTotalAmount = grandTotalAmount;
    }

    @JsonProperty("filingCurrencyConversionFactor")
    public Double getFilingCurrencyConversionFactor() {
        return filingCurrencyConversionFactor;
    }

    @JsonProperty("filingCurrencyConversionFactor")
    public void setFilingCurrencyConversionFactor(Double filingCurrencyConversionFactor) {
        this.filingCurrencyConversionFactor = filingCurrencyConversionFactor;
    }

    @JsonProperty("filingCurrencyCode")
    public String getFilingCurrencyCode() {
        return filingCurrencyCode;
    }

    @JsonProperty("filingCurrencyCode")
    public void setFilingCurrencyCode(String filingCurrencyCode) {
        this.filingCurrencyCode = filingCurrencyCode;
    }

    @JsonProperty("origCurrencyCode")
    public String getOrigCurrencyCode() {
        return origCurrencyCode;
    }

    @JsonProperty("origCurrencyCode")
    public void setOrigCurrencyCode(String origCurrencyCode) {
        this.origCurrencyCode = origCurrencyCode;
    }

    @JsonProperty("storeCurrencyCode")
    public String getStoreCurrencyCode() {
        return storeCurrencyCode;
    }

    @JsonProperty("storeCurrencyCode")
    public void setStoreCurrencyCode(String storeCurrencyCode) {
        this.storeCurrencyCode = storeCurrencyCode;
    }

    @JsonProperty("customerInfo")
    public CustomerInfoType getCustomerInfo() {
        return customerInfo;
    }

    @JsonProperty("customerInfo")
    public void setCustomerInfo(CustomerInfoType customerInfo) {
        this.customerInfo = customerInfo;
    }

    @JsonProperty("tenderList")
    public TenderListType getTenderList() {
        return tenderList;
    }

    @JsonProperty("tenderList")
    public void setTenderList(TenderListType tenderList) {
        this.tenderList = tenderList;
    }

    @JsonProperty("originateEntryType")
    public String getOriginateEntryType() {
        return originateEntryType;
    }

    @JsonProperty("originateEntryType")
    public void setOriginateEntryType(String originateEntryType) {
        this.originateEntryType = originateEntryType;
    }

    @JsonProperty("originateStoreId")
    public String getOriginateStoreId() {
        return originateStoreId;
    }

    @JsonProperty("originateStoreId")
    public void setOriginateStoreId(String originateStoreId) {
        this.originateStoreId = originateStoreId;
    }

    @JsonProperty("originateWorkstationId")
    public String getOriginateWorkstationId() {
        return originateWorkstationId;
    }

    @JsonProperty("originateWorkstationId")
    public void setOriginateWorkstationId(String originateWorkstationId) {
        this.originateWorkstationId = originateWorkstationId;
    }

    @JsonProperty("originateSequenceNumber")
    public Integer getOriginateSequenceNumber() {
        return originateSequenceNumber;
    }

    @JsonProperty("originateSequenceNumber")
    public void setOriginateSequenceNumber(Integer originateSequenceNumber) {
        this.originateSequenceNumber = originateSequenceNumber;
    }

    @JsonProperty("originateBusinessDate")
    public Date getOriginateBusinessDate() {
        return originateBusinessDate;
    }

    @JsonProperty("originateBusinessDate")
    public void setOriginateBusinessDate(Date originateBusinessDate) {
        this.originateBusinessDate = originateBusinessDate;
    }

    @JsonProperty("downstreamSystemList")
    public Object getDownstreamSystemList() {
        return downstreamSystemList;
    }

    @JsonProperty("downstreamSystemList")
    public void setDownstreamSystemList(Object downstreamSystemList) {
        this.downstreamSystemList = downstreamSystemList;
    }
    @JsonProperty("creditOfflineUpdate")
    public CreditOfflineUpdateCode getCreditOfflineUpdate() {
        return creditOfflineUpdate;
    }

    @JsonProperty("creditOfflineUpdate")
    public void setCreditOfflineUpdate(CreditOfflineUpdateCode creditOfflineUpdate) {
        this.creditOfflineUpdate = creditOfflineUpdate;
    }
    @JsonProperty("storeCountry")
    public String getStoreCountry() {
        return storeCountry;
    }

    @JsonProperty("storeCountry")
    public void setStoreCountry(String storeCountry) {
        this.storeCountry = storeCountry;
    }

    @JsonProperty("pointsForVAT")
    public boolean isPointsForVAT() {
        return pointsForVAT;
    }

    @JsonProperty("pointsForVAT")
    public void setPointsForVAT(boolean pointsForVAT) {
        this.pointsForVAT = pointsForVAT;
    }

    @Generated("jsonschema2pojo")
    public enum CreditOfflineUpdateCode {

        __EMPTY__(""),
        Y("Y"),
        N("N");
        private final String value;
        private final static Map<String, CreditOfflineUpdateCode> CONSTANTS = new HashMap<String, CreditOfflineUpdateCode>();

        static {
            for (CreditOfflineUpdateCode c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CreditOfflineUpdateCode(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CreditOfflineUpdateCode fromValue(String value) {
            CreditOfflineUpdateCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

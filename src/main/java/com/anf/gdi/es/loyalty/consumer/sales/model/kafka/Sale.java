package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Sale {

    @JsonProperty("transactionType")
    private String transactionType;

    @JsonProperty("transactionId")
    private String transactionId;

    @JsonProperty("originalTransactionId")
    private String originalTransactionId;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("capReturns")
    private String capReturns;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("autoEnroll")
    private String autoEnroll;

    @JsonProperty("Product")
    private Product product;

    @JsonProperty("Tender")
    private Tender tender;


}

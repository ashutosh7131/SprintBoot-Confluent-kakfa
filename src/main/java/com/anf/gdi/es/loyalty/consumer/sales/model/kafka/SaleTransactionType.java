
package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "saleTransactionHDRType",
        "SaleTransactionItems"
})
@Generated("jsonschema2pojo")
public class SaleTransactionType {

    @JsonProperty("saleTransactionHDRType")
    @JsonPropertyDescription("Sale Transaction HDR Type")
    private SaleTransactionHDRType saleTransactionHDRType;
    @JsonProperty("SaleTransactionItems")
    @JsonPropertyDescription("Sale Line Items")
    private SaleTransactionItemsType saleTransactionItems;

    @JsonProperty("saleTransactionHDRType")
    public SaleTransactionHDRType getSaleTransactionHDRType() {
        return saleTransactionHDRType;
    }

    @JsonProperty("saleTransactionHDRType")
    public void setSaleTransactionHDRType(SaleTransactionHDRType saleTransactionHDRType) {
        this.saleTransactionHDRType = saleTransactionHDRType;
    }

    @JsonProperty("SaleTransactionItems")
    public SaleTransactionItemsType getSaleTransactionItems() {
        return saleTransactionItems;
    }

    @JsonProperty("SaleTransactionItems")
    public void setSaleTransactionItems(SaleTransactionItemsType saleTransactionItems) {
        this.saleTransactionItems = saleTransactionItems;
    }

}

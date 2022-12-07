
package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Sale Transaction Message
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "saleTransaction"
})
@Generated("jsonschema2pojo")
public class SaleTransactionMessage {

    @JsonProperty("saleTransaction")
    @JsonPropertyDescription("Sale Transaction Type")
    private SaleTransactionType saleTransaction;

    @JsonProperty("saleTransaction")
    public SaleTransactionType getSaleTransaction() {
        return saleTransaction;
    }

    @JsonProperty("saleTransaction")
    public void setSaleTransaction(SaleTransactionType saleTransaction) {
        this.saleTransaction = saleTransaction;
    }

}

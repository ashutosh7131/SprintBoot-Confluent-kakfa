
package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "saleLineItem"
})
@Generated("jsonschema2pojo")
public class SaleTransactionItemsType {

    @JsonProperty("saleLineItem")
    @JsonPropertyDescription("Sale Transaction HDR Type")
    private List<SaleLineItemType> saleLineItem;

    @JsonProperty("saleLineItem")
    public List<SaleLineItemType> getSaleLineItem() {
        return saleLineItem;
    }

    @JsonProperty("saleLineItem")
    public void setSaleLineItem(List<SaleLineItemType> saleLineItem) {
        this.saleLineItem = saleLineItem;
    }

}

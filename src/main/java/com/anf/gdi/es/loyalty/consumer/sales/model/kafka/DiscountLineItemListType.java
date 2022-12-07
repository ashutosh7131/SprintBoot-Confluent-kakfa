
package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "DiscountLineItem"
})
@Generated("jsonschema2pojo")
public class DiscountLineItemListType {

    @JsonProperty("DiscountLineItem")
    private DiscountLineItemType discountLineItem;

    @JsonProperty("DiscountLineItem")
    public DiscountLineItemType getDiscountLineItem() {
        return discountLineItem;
    }

    @JsonProperty("DiscountLineItem")
    public void setDiscountLineItem(DiscountLineItemType discountLineItem) {
        this.discountLineItem = discountLineItem;
    }

}


package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "taxLineItem"
})
@Generated("jsonschema2pojo")
public class TaxLineItemListType {

    @JsonProperty("taxLineItem")
    private TaxLineItemType taxLineItem;

    @JsonProperty("taxLineItem")
    public TaxLineItemType getTaxLineItem() {
        return taxLineItem;
    }

    @JsonProperty("taxLineItem")
    public void setTaxLineItem(TaxLineItemType taxLineItem) {
        this.taxLineItem = taxLineItem;
    }

}

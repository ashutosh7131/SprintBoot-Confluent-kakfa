
package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tender"
})
@Generated("jsonschema2pojo")
public class TenderListType {
    @JsonProperty("tender")
    @JsonPropertyDescription("Tender Type")
    private List<TenderType> tender = null;

    @JsonProperty("tender")
    public List<TenderType> getTender() {
        return tender;
    }

    @JsonProperty("tender")
    public void setTender(List<TenderType> tender) {
        this.tender = tender;
    }

}

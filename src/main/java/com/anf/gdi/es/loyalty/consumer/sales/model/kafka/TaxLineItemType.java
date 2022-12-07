
package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "amount",
        "taxLinetype",
        "authority",
        "rate",
        "name"
})
@Generated("jsonschema2pojo")
public class TaxLineItemType {

    @JsonProperty("amount")
    @JsonPropertyDescription("Amount")
    private String amount;
    @JsonProperty("taxLinetype")
    @JsonPropertyDescription("Type")
    private String taxLinetype;
    @JsonProperty("authority")
    @JsonPropertyDescription("Authority")
    private String authority;
    @JsonProperty("rate")
    @JsonPropertyDescription("Rate")
    private String rate;
    @JsonProperty("name")
    @JsonPropertyDescription("Name")
    private String name;

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("taxLinetype")
    public String getTaxLinetype() {
        return taxLinetype;
    }

    @JsonProperty("taxLinetype")
    public void setTaxLinetype(String taxLinetype) {
        this.taxLinetype = taxLinetype;
    }

    @JsonProperty("authority")
    public String getAuthority() {
        return authority;
    }

    @JsonProperty("authority")
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @JsonProperty("rate")
    public String getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(String rate) {
        this.rate = rate;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}

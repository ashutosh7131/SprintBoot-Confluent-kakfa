package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Tender {

    @JsonProperty("tenderType")
    private String tenderType;

    @JsonProperty("amount")
    private double amount;
}

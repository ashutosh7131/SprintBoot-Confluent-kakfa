package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Transaction {

    @JsonProperty("Sale")
    private Sale sale;


}

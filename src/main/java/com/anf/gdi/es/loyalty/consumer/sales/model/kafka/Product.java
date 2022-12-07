package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Product {

    @JsonProperty("item")
    private String item;

    @JsonProperty("price")
    private double price;

    @JsonProperty("omniCode")
    private double omniCode;
}

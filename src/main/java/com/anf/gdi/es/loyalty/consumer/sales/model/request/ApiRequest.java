package com.anf.gdi.es.loyalty.consumer.sales.model.request;

import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.LoyaltyTransactionRequestOBJ;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(Include.NON_NULL)
public class ApiRequest {

    private List<LoyaltyTransactionRequestOBJ> loyaltyTransactionRequest;
}

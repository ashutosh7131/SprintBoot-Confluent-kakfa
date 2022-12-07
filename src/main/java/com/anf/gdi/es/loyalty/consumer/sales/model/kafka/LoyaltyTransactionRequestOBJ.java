package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoyaltyTransactionRequestOBJ {

    public String sourceSys;
    public int customerId;
    public int brand;
    public String email;
    public String country;
    public String webStoreId;
    public String channel;
    public String subChannel;
    public String transactionDate;
    public Transaction transaction;

}

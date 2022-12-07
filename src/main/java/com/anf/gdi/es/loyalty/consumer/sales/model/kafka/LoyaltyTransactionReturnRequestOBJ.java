package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class LoyaltyTransactionReturnRequestOBJ {

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
    public String orgBusinessDate;
    public String originalTransactionId;
    public double amount;
    public boolean capReturns;
    public String detail;
    public String autoEnroll;
    public boolean pointsForVAT;
    public double sellAmount;
    public double totalReturnAmount;
    public double merchCreditAmount;
    public Long subChannelDetail;
    public Date startTime;
    public Date endTime;

}

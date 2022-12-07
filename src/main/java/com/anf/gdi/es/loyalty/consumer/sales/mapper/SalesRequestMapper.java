package com.anf.gdi.es.loyalty.consumer.sales.mapper;

import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.*;
import com.anf.logservice.LoggingService;
import com.anf.logservice.models.LogRequest;
import org.springframework.stereotype.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class SalesRequestMapper {

    LoggingService logger = LoggingService.getNew(getClass());
    public LoyaltyTransactionRequestOBJ getPayload(SalesTopicMessage salesTopicMessage) {
        if (salesTopicMessage == null) {
            throw new NullPointerException("ApiRequest can not be null");
        }
        LoyaltyTransactionRequestOBJ loyaltyTransactionRequestOBJ = new LoyaltyTransactionRequestOBJ();
        try {
            SaleTransactionMessage salesTransactionMessage = salesTopicMessage.getSaleTransactionMessage() != null
                    ? salesTopicMessage.getSaleTransactionMessage() : new SaleTransactionMessage();
            SaleTransactionType saleTransactionType = salesTransactionMessage.getSaleTransaction();
            SaleTransactionHDRType salesTransactionHDRType = saleTransactionType.getSaleTransactionHDRType();
            SaleTransactionItemsType saleTransactionItemsType = saleTransactionType.getSaleTransactionItems();
            CustomerInfoType customerInfoType = salesTransactionHDRType.getCustomerInfo();
            List<SaleLineItemType> saleLineItemTypeList = saleTransactionItemsType.getSaleLineItem();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            Product product = new Product();
            Tender tender = new Tender();
            Transaction transaction = new Transaction();
            Sale sale = new Sale();
            List<TenderType> tenderList = salesTransactionHDRType.getTenderList().getTender();
            double totalSellingAmount = 0;
            double merchCreditAmount = 0;
            if (!saleLineItemTypeList.isEmpty()) {
                for (int i = 0; i < saleLineItemTypeList.size(); i++) {
                    if (saleLineItemTypeList.get(i).getItemId() != null || saleLineItemTypeList.get(i).getItemId() != "") {
                        product.setItem(saleLineItemTypeList.get(i).getItemId());
                    }
                    if (saleLineItemTypeList.get(i).getSellAmount() != 0d) {
                        product.setPrice(saleLineItemTypeList.get(i).getSellAmount());
                        totalSellingAmount = product.getPrice();
                        sale.setAmount(String.valueOf(product.getPrice()));
                    }
                }
            }
            if (!tenderList.isEmpty()) {
                for (int i = 0; i < tenderList.size(); i++) {
                    if (tenderList.get(i).getTenderAmount() != 0d) {
                        merchCreditAmount = tenderList.get(i).getTenderAmount();
                    }
                    if (tenderList.get(i).getTenderType() == "MERD") {
                        tender.setTenderType("merch_credit");
                    } else {
                        tender.setTenderType(tenderList.get(i).getTenderType());
                    }
                }
            }
            if (merchCreditAmount >= totalSellingAmount) {
                tender.setAmount(totalSellingAmount);
            } else {
                tender.setAmount(merchCreditAmount);
            }
            sale.setTransactionType("purchase");
            transaction.setSale(sale);

            if (salesTransactionHDRType.getStoreType().equals("WEB")) {
                sale.setTransactionId(Optional.ofNullable(salesTransactionHDRType.getSequenceNumber()).orElse(""));
                sale.setDetail(Optional.ofNullable(salesTransactionHDRType.getSequenceNumber()).orElse(""));
            } else if (!salesTransactionHDRType.getStoreType().equals("WEB")) {
                String sequenceNumber = Optional.ofNullable(salesTransactionHDRType.getSequenceNumber()).orElse("");
                String storeId = Optional.ofNullable(salesTransactionHDRType.getStoreId()).orElse("");
                String workstationId = Optional.ofNullable(salesTransactionHDRType.getWorkstationId()).orElse("");
                String businessDate = Optional.ofNullable(dateFormat.format(salesTransactionHDRType.getBusinessDate())).orElse("");
                sequenceNumber.concat(storeId);
                sequenceNumber.concat(workstationId);
                sequenceNumber.concat(businessDate);
                sale.setTransactionId(sequenceNumber);
            }
            sale.setProduct(product);
            sale.setTender(tender);

            loyaltyTransactionRequestOBJ.setSourceSys(Optional.ofNullable(salesTopicMessage.getSourceSystemId()).orElse(""));
            loyaltyTransactionRequestOBJ.setCustomerId(Integer.parseInt(Optional.ofNullable(customerInfoType.getCustomerLinkCode()).orElse("")));
            if (salesTransactionHDRType.getStoreType().equals("WEB") && salesTransactionHDRType.getStoreId() == "10051") {
                loyaltyTransactionRequestOBJ.setBrand(1);
            } else if (salesTransactionHDRType.getStoreType().equals("WEB") && salesTransactionHDRType.getStoreId() == "30031") {

                loyaltyTransactionRequestOBJ.setBrand(3);
            } else {
                loyaltyTransactionRequestOBJ.setBrand(Integer.parseInt(Optional.ofNullable(salesTransactionHDRType.getStoreId().substring(0, 1)).orElse("")));
            }
            loyaltyTransactionRequestOBJ.setEmail(Optional.ofNullable(customerInfoType.getEmail()).orElse(""));
            loyaltyTransactionRequestOBJ.setCountry(Optional.ofNullable(customerInfoType.getCountry()).orElse(""));
            loyaltyTransactionRequestOBJ.setWebStoreId(Optional.ofNullable(salesTransactionHDRType.getStoreId()).orElse(""));
            loyaltyTransactionRequestOBJ.setTransaction(transaction);
            if (salesTransactionHDRType.getStoreType().equals("WEB")) {
                loyaltyTransactionRequestOBJ.setChannel("web");
            } else {
                loyaltyTransactionRequestOBJ.setChannel("pos");
            }
            if (salesTransactionHDRType.getStoreType().equals("BRK")) {
                loyaltyTransactionRequestOBJ.setSubChannel(Optional.ofNullable(salesTransactionHDRType.getStoreId()).orElse(""));
            }
            loyaltyTransactionRequestOBJ.setTransactionDate(Optional.ofNullable(dateFormat.format(salesTransactionHDRType.getBusinessDate())).orElse(""));
        }
        catch(Exception e){
            logger.log(LogRequest.info(UUID.randomUUID(),"Error in Transformation ---> "+e.getMessage()).defaultLogger());
        }
        logger.log(LogRequest.info(UUID.randomUUID(),"After Transformation ---> "+loyaltyTransactionRequestOBJ.toString()).defaultLogger());
        return loyaltyTransactionRequestOBJ;
    }

}

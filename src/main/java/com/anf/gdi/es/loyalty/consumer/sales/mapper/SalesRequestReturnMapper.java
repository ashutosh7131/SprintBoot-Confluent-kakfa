package com.anf.gdi.es.loyalty.consumer.sales.mapper;

import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.*;
import com.anf.logservice.LoggingService;
import com.anf.logservice.models.LogRequest;
import org.springframework.stereotype.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


@Component
public class SalesRequestReturnMapper {

    LoggingService logger = LoggingService.getNew(getClass());

    public LoyaltyTransactionReturnRequestOBJ getReturnPayload(SalesTopicMessage salesTopicMessage, LoyaltyTransactionRequestOBJ loyaltyTransactionRequestOBJ) {
        if (salesTopicMessage == null) {
            throw new NullPointerException("WebStore ID can not be null");
        }
        LoyaltyTransactionReturnRequestOBJ loyaltyTransactionReturnRequestOBJ = new LoyaltyTransactionReturnRequestOBJ();
        try {
            SaleTransactionMessage salesTransactionMessage = salesTopicMessage.getSaleTransactionMessage() != null
                    ? salesTopicMessage.getSaleTransactionMessage() : new SaleTransactionMessage();
            SaleTransactionType saleTransactionType = salesTransactionMessage.getSaleTransaction();
            SaleTransactionHDRType salesTransactionHDRType = saleTransactionType.getSaleTransactionHDRType();
            CustomerInfoType customerInfoType = salesTransactionHDRType.getCustomerInfo();
            SaleTransactionItemsType saleTransactionItemsType = saleTransactionType.getSaleTransactionItems();
            List<SaleLineItemType> saleLineItemTypeList = saleTransactionItemsType.getSaleLineItem();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String storeCountry = salesTransactionHDRType.getStoreCountry();
            double currencyConversionFactor = 0;
            double saleAmount = 0;
            String currency = null;
            Date dateToCompare;
            String autoEnroll = "1";
            Boolean pointsForVAT = salesTransactionHDRType.isPointsForVAT();
            double sellAmount = 0;
            String brand = null;
            String originalTransactionId = null;
            String detail = null;
            Product product = new Product();
            List<TenderType> tenderList = salesTransactionHDRType.getTenderList().getTender();
            TenderType tenderType = new TenderType();
            String tenderTypeId = null;
            Long subChannelDetail;
            List downstreamSystemList = new ArrayList();
            Date startTime;
            Date endTime;
            Date originateBusinessDate = Optional.ofNullable(salesTransactionHDRType.getOriginateBusinessDate()).orElse(null);
            try {
                dateToCompare = dateFormat.parse("2018-11-16");
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            if (loyaltyTransactionRequestOBJ.getTransaction() != null && loyaltyTransactionRequestOBJ.getTransaction().getSale() != null) {
                Transaction transaction = loyaltyTransactionRequestOBJ.getTransaction();
                Sale sale = transaction.getSale();
                product = Optional.ofNullable(sale.getProduct()).orElse(null);
            }
            double totalReturnAmount = 0;
            double merchCreditAmount = 0;
            if (storeCountry.equals("DK") || storeCountry.equals("SE") || storeCountry.equals("PL")) {
                if (!saleLineItemTypeList.isEmpty()) {
                    for (int i = 0; i < saleLineItemTypeList.size(); i++) {
                        if (saleLineItemTypeList.get(i).getQuantity() == -1 && saleLineItemTypeList.get(i).getNonMerch() == false) {
                            brand = saleLineItemTypeList.get(i).getOrigStoreId().substring(0, 1);
                            loyaltyTransactionReturnRequestOBJ.setBrand(Integer.parseInt(brand));
                            if (saleLineItemTypeList.get(i).getVoided() == false) {
                                currencyConversionFactor = salesTransactionHDRType.getFilingCurrencyConversionFactor();
                            } else {
                                currencyConversionFactor = 1;
                            }
                            if (salesTransactionHDRType.getRewardsEligibleReturnStore() && saleLineItemTypeList.get(i).getVoided() == false) {

                                saleAmount = (saleLineItemTypeList.get(i).getSellAmount() + Double.parseDouble(saleLineItemTypeList.get(i).getTaxLineItemList().getTaxLineItem().getAmount())) * currencyConversionFactor;
                            } else {
                                saleAmount = saleLineItemTypeList.get(i).getSellAmount() * currencyConversionFactor;
                            }


                        }
                        if (saleLineItemTypeList.get(i).getQuantity() == -1 && saleLineItemTypeList.get(i).getNonMerch() == false && saleLineItemTypeList.get(i).getOrigWorkstationId() == "999" && originateBusinessDate.compareTo(dateToCompare) >= 0) {
                            originalTransactionId = saleLineItemTypeList.get(i).getOrigSequenceNumber().toString().concat("-" + saleLineItemTypeList.get(i).getOrigStoreId()).concat("-" + saleLineItemTypeList.get(i).getOrigWorkstationId()).concat("-" + saleLineItemTypeList.get(i).getOrigBusinessDay());
                        } else if (saleLineItemTypeList.get(i).getOrigWorkstationId() == "999") {
                            originalTransactionId = saleLineItemTypeList.get(i).getOrigSequenceNumber().toString();
                        } else if (salesTopicMessage.getSaleTransactionMessage().getSaleTransaction().getSaleTransactionItems().getSaleLineItem().get(i).getOrigWorkstationId() != "999") {
                            originalTransactionId = String.valueOf(Optional.ofNullable(salesTransactionHDRType.getOriginateSequenceNumber()).orElse(0));
                        }

                    }
                }


            }
            loyaltyTransactionReturnRequestOBJ.setSourceSys("ORAESB");
            loyaltyTransactionReturnRequestOBJ.setCustomerId(Integer.parseInt(Optional.ofNullable(customerInfoType.getCustomerReturnLinkCode()).orElse("0")));
            if (salesTransactionHDRType.getStoreType().equals("WEB")) {
                if (salesTransactionHDRType.getStoreId() == "10051" || salesTransactionHDRType.getStoreId() == "10082") {
                    loyaltyTransactionReturnRequestOBJ.setBrand(1);
                } else if (salesTransactionHDRType.getStoreId() == "30031" || salesTransactionHDRType.getStoreId() == "30026"
                        || salesTransactionHDRType.getStoreId() == "31082") {
                    loyaltyTransactionReturnRequestOBJ.setBrand(3);
                }
            } else if (!salesTransactionHDRType.getStoreType().equals("WEB") && loyaltyTransactionReturnRequestOBJ.getBrand() == 2) {
                loyaltyTransactionReturnRequestOBJ.setBrand(1);
            } else {
                loyaltyTransactionReturnRequestOBJ.setBrand(Optional.ofNullable(loyaltyTransactionRequestOBJ.getBrand()).orElse(0));
            }
            loyaltyTransactionReturnRequestOBJ.setEmail(Optional.ofNullable(customerInfoType.getEmail()).orElse(""));
            if (customerInfoType.getShipTocountry().length() > 0) {
                loyaltyTransactionReturnRequestOBJ.setCountry(Optional.ofNullable(customerInfoType.getShipTocountry()).orElse(""));
            } else {
                loyaltyTransactionReturnRequestOBJ.setCountry(Optional.of(customerInfoType.getCountry()).orElse(""));
            }
            loyaltyTransactionReturnRequestOBJ.setWebStoreId(Optional.ofNullable(loyaltyTransactionRequestOBJ.getWebStoreId()).orElse(""));
            if (salesTransactionHDRType.getOrigCurrencyCode() == "USD" || salesTransactionHDRType.getStoreCurrencyCode() == "USD") {

                currency = "$";
            } else if (salesTransactionHDRType.getOrigCurrencyCode() == "GBP" || salesTransactionHDRType.getStoreCurrencyCode() == "GBP") {
                currency = "£";
            } else if (salesTransactionHDRType.getOrigCurrencyCode() == "EUR" || salesTransactionHDRType.getStoreCurrencyCode() == "EUR"
                    || customerInfoType.getCountry() == "DK" || customerInfoType.getCountry() == "SE" || customerInfoType.getCountry() == "PL") {
                currency = "€";
            } else {
                currency = Optional.ofNullable(salesTransactionHDRType.getOrigCurrencyCode()).orElse("");
            }
            String sequenceNumber = Optional.ofNullable(salesTransactionHDRType.getSequenceNumber()).orElse("0");
            String storeId = Optional.ofNullable(salesTransactionHDRType.getStoreId()).orElse("0");
            String workstationId = Optional.of(salesTransactionHDRType.getWorkstationId()).orElse("0");
            String businessDate = Optional.ofNullable(dateFormat.format(salesTransactionHDRType.getBusinessDate())).orElse("0");
            sequenceNumber.concat(storeId);
            sequenceNumber.concat(workstationId);
            sequenceNumber.concat(businessDate);
            loyaltyTransactionReturnRequestOBJ.setTransaction(Optional.ofNullable(loyaltyTransactionRequestOBJ.getTransaction()).orElse(null));
            loyaltyTransactionReturnRequestOBJ.getTransaction().setSale(Optional.ofNullable(loyaltyTransactionRequestOBJ.getTransaction().getSale()).orElse(null));
            loyaltyTransactionReturnRequestOBJ.getTransaction().getSale().setTransactionId(Optional.ofNullable(sequenceNumber).orElse("0"));
            loyaltyTransactionReturnRequestOBJ.setOrgBusinessDate(Optional.ofNullable(originateBusinessDate.toString()).orElse(" "));
            loyaltyTransactionReturnRequestOBJ.setOriginalTransactionId(Optional.ofNullable(originalTransactionId).orElse(" "));
            double amount = saleAmount;
            loyaltyTransactionReturnRequestOBJ.setAmount(amount);
            boolean capReturns = true;
            loyaltyTransactionReturnRequestOBJ.setCapReturns(capReturns);
            if (salesTransactionHDRType.getStoreType().equals("WEB")) {
                if (salesTransactionHDRType.getStoreId() != "") {
                    detail = "Online return " + currency + saleAmount + "Transaction ID" + salesTransactionHDRType.getSequenceNumber();
                    loyaltyTransactionReturnRequestOBJ.setDetail(detail);
                }
            } else if (!salesTransactionHDRType.getStoreType().equals("WEB")) {
                detail = "In store return " + currency + saleAmount + "Transaction ID" + salesTransactionHDRType.getSequenceNumber().concat(salesTransactionHDRType.getStoreId().concat(salesTransactionHDRType.getWorkstationId().concat(salesTransactionHDRType.getBusinessDate().toString())));
                loyaltyTransactionReturnRequestOBJ.setDetail(detail);
            }
            loyaltyTransactionReturnRequestOBJ.setAutoEnroll(autoEnroll);
            loyaltyTransactionReturnRequestOBJ.setPointsForVAT(pointsForVAT);
            if (!saleLineItemTypeList.isEmpty()) {
                for (int i = 0; i < saleLineItemTypeList.size(); i++) {
                    if (pointsForVAT && saleLineItemTypeList.get(i).getSellAmount() != null && saleLineItemTypeList.get(i).getTaxLineItemList().getTaxLineItem().getAmount()!=null) {
                        sellAmount = Double.parseDouble(Optional.ofNullable(saleLineItemTypeList.get(i).getSellAmount() + saleLineItemTypeList.get(i).getTaxLineItemList().getTaxLineItem().getAmount()).orElse("0.0d")) * currencyConversionFactor;
                        loyaltyTransactionReturnRequestOBJ.setSellAmount(sellAmount);
                    } else {

                        sellAmount = saleLineItemTypeList.get(i).getSellAmount() * currencyConversionFactor;
                        loyaltyTransactionReturnRequestOBJ.setSellAmount(sellAmount);
                    }
                    if(loyaltyTransactionRequestOBJ.getTransaction() !=null && loyaltyTransactionRequestOBJ.getTransaction().getSale() !=null) {
                        Sale sale = new Sale();
                        product.setItem(saleLineItemTypeList.get(i).getItemId());
                        product.setOmniCode(Optional.ofNullable(Integer.valueOf(saleLineItemTypeList.get(i).getOmniCode())).orElse(0));
                        sale.setProduct(product);
                        Transaction transaction = new Transaction();
                        transaction.setSale(sale);
                        loyaltyTransactionReturnRequestOBJ.setTransaction(transaction);
                    }
                    if (pointsForVAT) {
                        totalReturnAmount = Double.valueOf(saleLineItemTypeList.get(i).getSellAmount() + saleLineItemTypeList.get(i).getTaxLineItemList().getTaxLineItem().getAmount());
                        loyaltyTransactionReturnRequestOBJ.setTotalReturnAmount(totalReturnAmount);
                    } else {
                        totalReturnAmount = saleLineItemTypeList.get(i).getSellAmount();
                        loyaltyTransactionReturnRequestOBJ.setTotalReturnAmount(totalReturnAmount);
                    }
                }
            }
            for (int i = 0; i < tenderList.size(); i++) {
                tenderTypeId = tenderList.get(i).getTenderTypeId();
                if (tenderTypeId == "MERD") {
                    tenderType.setTenderType("merch_credit");
                    tenderType.setTenderAmount(totalReturnAmount);
                    merchCreditAmount = totalReturnAmount * currencyConversionFactor;
                    loyaltyTransactionReturnRequestOBJ.setMerchCreditAmount(merchCreditAmount);
                } else {
                    tenderType.setTenderType(tenderTypeId);
                    merchCreditAmount = 0.0d;
                    loyaltyTransactionReturnRequestOBJ.setMerchCreditAmount(merchCreditAmount);
                }
            }
            if (salesTransactionHDRType.getStoreType().equals("WEB")) {
                loyaltyTransactionReturnRequestOBJ.setChannel("web");
            } else {
                loyaltyTransactionReturnRequestOBJ.setChannel("pos");
            }
            if (salesTransactionHDRType.getOriginateEntryType().matches("STORE.*")) {
                loyaltyTransactionReturnRequestOBJ.setSubChannel(salesTransactionHDRType.getOriginateStoreId());
            } else {
                loyaltyTransactionReturnRequestOBJ.setSubChannel(salesTransactionHDRType.getStoreId());
            }

            downstreamSystemList.add(salesTransactionHDRType.getDownstreamSystemList());
            if (downstreamSystemList.contains(".,'LOYALTYPLUS'")) {
                String downStreamSystems = "true";
                subChannelDetail = System.currentTimeMillis();
                loyaltyTransactionReturnRequestOBJ.setSubChannelDetail(subChannelDetail);
            }
            if (salesTransactionHDRType.getStoreType() != "WEB") {
                startTime = salesTransactionHDRType.getStartTime();
                loyaltyTransactionReturnRequestOBJ.setStartTime(startTime);
            } else {
                endTime = salesTransactionHDRType.getEndTime();
                loyaltyTransactionReturnRequestOBJ.setEndTime(endTime);
            }

        } catch (Exception e) {
            logger.log(LogRequest.info(UUID.randomUUID(), "Error in Transformation ---> " + e.getMessage()).defaultLogger());
        }
        logger.log(LogRequest.info(UUID.randomUUID(), "After Transformation ---> " + loyaltyTransactionReturnRequestOBJ.toString()).defaultLogger());
        return loyaltyTransactionReturnRequestOBJ;
    }
}

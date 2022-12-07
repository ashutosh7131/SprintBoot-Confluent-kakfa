package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SaleLineItemTypeTests {
        @Test
        @DisplayName("Should be able to set the values using the setters and retrieve them using the getters.")
        void shouldBeAbleToSetTheValuesUsingTheSettersAndRetrieveThemUsingTheGetters() {
            double lineItemNumber = 1234.00;
            String itemId = "234";
            String origItemId = "7645";
            double quantity = 1.00;
            boolean nonMerch = false;
            double ticketAmount = 534.00;
            double sellAmount = 345.00;
            double discountAmount = 10.00;
            double taxAmount = 10.00;
            double extendedAmount = 23.00;
            boolean voided = false;
            boolean giftReceiptPrinted = false;
            String maskedGiftCardId = "123";
            String origStoreId = "2435";
            String origBusinessDay = "test";
            String origWorkstationId = "1234";
            double origSequenceNumber = 23.00;
            String origLineItemNumber = "123";
            String origReceiptEntryMethod = "testcode";
            String origReceiptType = "test";
            String entryMethod = "test";
            String returnReasonCode = "code";
            boolean priceOverride = true;
            String priceOverrideReasonCode = "reasoncode";
            boolean taxOverride = true;
            String giftCardRequestType = "type";
            String encryptedGiftCardNumber = "1234";
            String shippingIntrastatCode = "testcode";
            String shippingMass = "mass";
            double shippingCountryOfOrigin = 22.00;
            String shippingFromCountry = "US";
            var discountLineItemList = new DiscountLineItemListType();
            var taxLineItemList = new TaxLineItemListType();
            double priceTypeCode = 20.00;
            double originateStockOutReasonCode = 10.00;
            String fulfillStoreID = "1324";
            String omniCode = "2534";
            var taxGroupId = "1234#";

            var model = new SaleLineItemType();

            model.setLineItemNumber(lineItemNumber);
            model.setItemId(itemId);
            model.setOrigItemId(origItemId);
            model.setQuantity(quantity);
            model.setNonMerch(nonMerch);
            model.setTicketAmount(ticketAmount);
            model.setDiscountAmount(discountAmount);
            model.setSellAmount(sellAmount);
            model.setTaxAmount(taxAmount);
            model.setExtendedAmount(extendedAmount);
            model.setVoided(voided);
            model.setGiftReceiptPrinted(giftReceiptPrinted);
            model.setMaskedGiftCardId(maskedGiftCardId);
            model.setOrigStoreId(origStoreId);
            model.setOrigBusinessDay(origBusinessDay);
            model.setOrigWorkstationId(origWorkstationId);
            model.setOrigSequenceNumber(origSequenceNumber);
            model.setOrigLineItemNumber(origLineItemNumber);

            model.setOrigReceiptEntryMethod(origReceiptEntryMethod);
            model.setOrigReceiptType(origReceiptType);
            model.setEntryMethod(entryMethod);
            model.setReturnReasonCode(returnReasonCode);
            model.setPriceOverride(priceOverride);
            model.setPriceOverrideReasonCode(priceOverrideReasonCode);
            model.setTaxOverride(taxOverride);
            model.setGiftCardRequestType(giftCardRequestType);
            model.setEncryptedGiftCardNumber(encryptedGiftCardNumber);
            model.setShippingIntrastatCode(shippingIntrastatCode);
            model.setShippingMass(shippingMass);
            model.setShippingCountryOfOrigin(shippingCountryOfOrigin);
            model.setShippingFromCountry(shippingFromCountry);
            model.setDiscountLineItemList(discountLineItemList);
            model.setTaxLineItemList(taxLineItemList);
            model.setPriceTypeCode(priceTypeCode);
            model.setOriginateStockOutReasonCode(originateStockOutReasonCode);
            model.setFulfillStoreID(fulfillStoreID);
            model.setOmniCode(omniCode);
            model.setTaxGroupId(taxGroupId);

            assertAll(
                    () -> assertEquals(lineItemNumber, model.getLineItemNumber()),
                    () -> assertEquals(itemId, model.getItemId()),
                    () -> assertEquals(origItemId, model.getOrigItemId()),
                    () -> assertEquals(quantity, model.getQuantity()),
                    () -> assertEquals(nonMerch, model.getNonMerch()),
                    () -> assertEquals(ticketAmount, model.getTicketAmount()),
                    () -> assertEquals(discountAmount, model.getDiscountAmount()),
                    () -> assertEquals(sellAmount, model.getSellAmount()),
                    () -> assertEquals(taxAmount, model.getTaxAmount()),
                    () -> assertEquals(extendedAmount, model.getExtendedAmount()),
                    () -> assertEquals(origReceiptEntryMethod, model.getOrigReceiptEntryMethod()),
                    () -> assertEquals(origReceiptType, model.getOrigReceiptType()),
                    () -> assertEquals(entryMethod, model.getEntryMethod()),
                    () -> assertEquals(returnReasonCode, model.getReturnReasonCode()),
                    () -> assertEquals(priceOverride, model.getPriceOverride()),
                    () -> assertEquals(priceOverrideReasonCode, model.getPriceOverrideReasonCode()),
                    () -> assertEquals(taxOverride, model.getTaxOverride()),
                    () -> assertEquals(giftCardRequestType, model.getGiftCardRequestType()),
                    () -> assertEquals(encryptedGiftCardNumber, model.getEncryptedGiftCardNumber()),
                    () -> assertEquals(shippingIntrastatCode, model.getShippingIntrastatCode()),
                    () -> assertEquals(shippingMass, model.getShippingMass()),
                    () -> assertEquals(shippingCountryOfOrigin, model.getShippingCountryOfOrigin()),
                    () -> assertEquals(shippingFromCountry, model.getShippingFromCountry()),
                    () -> assertEquals(discountLineItemList, model.getDiscountLineItemList()),
                    () -> assertEquals(taxLineItemList, model.getTaxLineItemList()),
                    () -> assertEquals(priceTypeCode, model.getPriceTypeCode()),
                    () -> assertEquals(originateStockOutReasonCode, model.getOriginateStockOutReasonCode()),
                    () -> assertEquals(fulfillStoreID, model.getFulfillStoreID()),
                    () -> assertEquals(origLineItemNumber, model.getOrigLineItemNumber()),
                    () -> assertEquals(origSequenceNumber, model.getOrigSequenceNumber()),
                    () -> assertEquals(origBusinessDay, model.getOrigBusinessDay()),
                    () -> assertEquals(origStoreId, model.getOrigStoreId()),
                    () -> assertEquals(voided, model.getVoided()),
                    () -> assertEquals(giftReceiptPrinted, model.getGiftReceiptPrinted()),
                    () -> assertEquals(maskedGiftCardId, model.getMaskedGiftCardId()),
                    () -> assertEquals(taxGroupId, model.getTaxGroupId()),
                    () -> assertEquals(omniCode, model.getOmniCode())

            );


        }
    }

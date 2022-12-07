package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
    public class SaleTransactionHDRTypeTests {
        @InjectMocks
        SaleTransactionHDRType model;

        @Test
        @DisplayName("Should be able to set the values using the setters and retrieve them using the getters.")
        void shouldBeAbleToSetTheValuesUsingTheSettersAndRetrieveThemUsingTheGetters() {
            var sequenceNumber = "1234";
            var storeId = "1234";
            var rewardsEligiblePurchaseStore = false;
            var rewardsEligibleReturnStore = false;
            var workstationId = "1234";
            var businessDate = new Date();
            var storeType = "store";
            var saleType = "sales";
            var reasonCode = "test";
            var status = "complete";
            var employeeSaleId = "12345";
            var startTime = new Date();
            var endTime = new Date();
            var cashierId = "12356";
            var authorizerId = "7565";
            var taxExemptId = "9856";
            var subtotalAmount = 12.00;
            var discountAmount = 20.00;
            var taxAmount = 10.00;
            var totalAmount = 120.00;
            var grandTotalAmount = 130.00;
            var filingCurrencyConversionFactor = 23.00;
            var filingCurrencyCode = "USD";
            var origCurrencyCode = "USD";
            var storeCurrencyCode = "USD";
            var customerInfo = new CustomerInfoType();
            var tenderList = new TenderListType();
            var originateEntryType = "yrt";
            var originateStoreId = "5346";
            var originateWorkstationId = "uryt23";
            var originateSequenceNumber = 1234;
            var originateBusinessDate = new Date();
            var downstreamSystemList = "test";
            var creditOfflineUpdate = SaleTransactionHDRType.CreditOfflineUpdateCode.Y;
            var pointsForVAT = true;
            var storeCountry = "us";
            var model = new SaleTransactionHDRType();
            model.setAuthorizerId(authorizerId);
            model.setBusinessDate(businessDate);
            model.setCashierId(cashierId);
            model.setSaleType(saleType);
            model.setEmployeeSaleId(employeeSaleId);
            model.setCustomerInfo(customerInfo);
            model.setCreditOfflineUpdate(creditOfflineUpdate);
            model.setDiscountAmount(discountAmount);
            model.setEndTime(endTime);
            model.setDownstreamSystemList(downstreamSystemList);
            model.setFilingCurrencyCode(filingCurrencyCode);
            model.setFilingCurrencyConversionFactor(filingCurrencyConversionFactor);
            model.setGrandTotalAmount(grandTotalAmount);
            model.setOrigCurrencyCode(origCurrencyCode);
            model.setOriginateBusinessDate(originateBusinessDate);
            model.setOriginateEntryType(originateEntryType);
            model.setOriginateSequenceNumber(originateSequenceNumber);
            model.setOriginateStoreId(originateStoreId);
            model.setOriginateWorkstationId(originateWorkstationId);
            model.setReasonCode(reasonCode);
            model.setRewardsEligiblePurchaseStore(rewardsEligiblePurchaseStore);
            model.setRewardsEligibleReturnStore(rewardsEligibleReturnStore);
            model.setSequenceNumber(sequenceNumber);
            model.setStartTime(startTime);
            model.setStatus(status);
            model.setStoreCurrencyCode(storeCurrencyCode);
            model.setStoreId(storeId);
            model.setStoreType(storeType);
            model.setSubtotalAmount(subtotalAmount);
            model.setTaxAmount(taxAmount);
            model.setTaxExemptId(taxExemptId);
            model.setTenderList(tenderList);
            model.setTotalAmount(totalAmount);
            model.setWorkstationId(workstationId);
            model.setPointsForVAT(pointsForVAT);
            model.setStoreCountry(storeCountry);

            assertAll(
                    () -> assertEquals(sequenceNumber, model.getSequenceNumber()),
                    () -> assertEquals(storeId, model.getStoreId()),
                    () -> assertEquals(storeCurrencyCode, model.getStoreCurrencyCode()),
                    () -> assertEquals(storeType, model.getStoreType()),
                    () -> assertEquals(originateSequenceNumber, model.getOriginateSequenceNumber()),
                    () -> assertEquals(origCurrencyCode, model.getOrigCurrencyCode()),
                    () -> assertEquals(originateEntryType, model.getOriginateEntryType()),
                    () -> assertEquals(originateWorkstationId, model.getOriginateWorkstationId()),
                    () -> assertEquals(originateBusinessDate, model.getOriginateBusinessDate()),
                    () -> assertEquals(rewardsEligiblePurchaseStore, model.getRewardsEligiblePurchaseStore()),
                    () -> assertEquals(rewardsEligibleReturnStore, model.getRewardsEligibleReturnStore()),
                    () -> assertEquals(workstationId, model.getWorkstationId()),
                    () -> assertEquals(businessDate, model.getBusinessDate()),
                    () -> assertEquals(saleType, model.getSaleType()),
                    () -> assertEquals(reasonCode, model.getReasonCode()),
                    () -> assertEquals(status, model.getStatus()),
                    () -> assertEquals(employeeSaleId, model.getEmployeeSaleId()),

                    () -> assertEquals(startTime, model.getStartTime()),
                    () -> assertEquals(endTime, model.getEndTime()),
                    () -> assertEquals(cashierId, model.getCashierId()),
                    () -> assertEquals(authorizerId, model.getAuthorizerId()),
                    () -> assertEquals(taxExemptId, model.getTaxExemptId()),
                    () -> assertEquals(subtotalAmount, model.getSubtotalAmount()),
                    () -> assertEquals(discountAmount, model.getDiscountAmount()),
                    () -> assertEquals(grandTotalAmount, model.getGrandTotalAmount()),
                    () -> assertEquals(totalAmount, model.getTotalAmount()),
                    () -> assertEquals(taxAmount, model.getTaxAmount()),
                    () -> assertEquals(filingCurrencyConversionFactor, model.getFilingCurrencyConversionFactor()),
                    () -> assertEquals(filingCurrencyCode, model.getFilingCurrencyCode()),
                    () -> assertEquals(originateStoreId, model.getOriginateStoreId()),
                    () -> assertEquals(downstreamSystemList, model.getDownstreamSystemList()),
                    () -> assertEquals(creditOfflineUpdate, model.getCreditOfflineUpdate()),
                    () -> assertEquals(pointsForVAT, model.isPointsForVAT()),
                    () -> assertEquals(storeCountry, model.getStoreCountry())



            );
        }

        @Test
        @DisplayName("Should give the enum value.")
        public void ShouldReturnEnumValue() {

            var code = SaleTransactionHDRType.CreditOfflineUpdateCode.N;

            String codeValue = code.value();

            String value = "N";
            Assertions.assertThat(codeValue).isEqualTo(value);

        }

    @Test
    @DisplayName("Should Send Exception If constant value Is Null")
    public void shouldSendDiscountTypeCodeExceptionForConstantValue(){

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {

            SaleTransactionHDRType.CreditOfflineUpdateCode.fromValue(null);
        });

        Assertions.assertThatIllegalArgumentException();

    }
    }

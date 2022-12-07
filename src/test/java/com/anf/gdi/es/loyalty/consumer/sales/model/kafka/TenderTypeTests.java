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
class TenderTypeTests {

    @InjectMocks
    TenderType tenderType;

    @Test
    @DisplayName("Should be able to set the values using the setters and retrieve them using the getters.")
    void shouldBeAbleToSetTheValuesUsingTheSettersAndRetrieveThemUsingTheGetters() {
        var lineItemNumber =1234.00;
        var tenderNumber=22.00;
        var tenderAmount=12.00;
        var tenderType="test";
        var tenderTypeId="123";
        var tenderExchangeRate=10.00;
        var foreignTenderCurrencyCode="USD";
        var foreignTenderAmount=12.00;
        var accountName = "test";
        var cardAuthMethod = "Auth";
        var cardAuthReturnCode = "1234";
        var encryptedExpDate=new Date();
        var encryptedCardNumber="1234";
        var hashedCardNumber="4567";
        var maskedCardNumber="4356";
        var encryptedCheckRoutingNumber=7565.00;
        var encryptedCheckAccountNumber=23425.00;
        var model = new TenderType();
        var CardEntryModeCode = TenderType.CardEntryModeCode.ICC;
        var EncryptionTypeCode = TenderType.EncryptionTypeCode.T;
        model.setCardEntryMode(CardEntryModeCode);
        model.setEncryptionType(EncryptionTypeCode);
        model.setLineItemNumber(lineItemNumber);
        model.setTenderType(tenderType);
        model.setTenderAmount(tenderAmount);
        model.setTenderTypeId(tenderTypeId);
        model.setTenderExchangeRate(tenderExchangeRate);
        model.setForeignTenderAmount(foreignTenderAmount);
        model.setForeignTenderCurrencyCode(foreignTenderCurrencyCode);
        model.setTenderNumber(tenderNumber);
        model.setAccountName(accountName);
        model.setCardAuthMethod(cardAuthMethod);
        model.setCardAuthReturnCode(cardAuthReturnCode);
        model.setEncryptedExpDate(encryptedExpDate);
        model.setEncryptedCardNumber(encryptedCardNumber);
        model.setHashedCardNumber(hashedCardNumber);
        model.setMaskedCardNumber(maskedCardNumber);
        model.setEncryptedCheckAccountNumber(encryptedCheckAccountNumber);
        model.setEncryptedCheckRoutingNumber(encryptedCheckRoutingNumber);


        assertAll(
                ()->assertEquals(lineItemNumber, model.getLineItemNumber()),
                ()->assertEquals(tenderType, model.getTenderType()),
                ()->assertEquals(tenderAmount, model.getTenderAmount()),
                ()->assertEquals(tenderTypeId, model.getTenderTypeId()),
                ()->assertEquals(tenderExchangeRate, model.getTenderExchangeRate()),
                ()->assertEquals(foreignTenderAmount, model.getForeignTenderAmount()),
                ()->assertEquals(foreignTenderCurrencyCode, model.getForeignTenderCurrencyCode()),
                ()->assertEquals(tenderNumber, model.getTenderNumber()),
                ()->assertEquals(accountName, model.getAccountName()),
                ()->assertEquals(cardAuthMethod, model.getCardAuthMethod()),
                ()->assertEquals(cardAuthReturnCode, model.getCardAuthReturnCode()),
                ()->assertEquals(encryptedCheckAccountNumber, model.getEncryptedCheckAccountNumber()),
                ()->assertEquals(encryptedCheckRoutingNumber, model.getEncryptedCheckRoutingNumber()),
                ()->assertEquals(encryptedExpDate, model.getEncryptedExpDate()),
                ()->assertEquals(encryptedCardNumber, model.getEncryptedCardNumber()),
                ()->assertEquals(hashedCardNumber, model.getHashedCardNumber()),
                ()->assertEquals(maskedCardNumber, model.getMaskedCardNumber()),
                ()->assertEquals(CardEntryModeCode, model.getCardEntryMode()),
                ()->assertEquals(EncryptionTypeCode, model.getEncryptionType()),
                ()->assertEquals(maskedCardNumber, model.getMaskedCardNumber())
        );
    }

    @Test
    @DisplayName("Should give the enum value.")
    public void ShouldReturnEnumValue(){

        var code =  TenderType.EncryptionTypeCode.C;

        String codeValue = code.value();

        String value = "C";
        Assertions.assertThat(codeValue).isEqualTo(value);

    }

    @Test
    @DisplayName("Should give the String value.")
    public void ShouldReturnStringValue(){

        String codeValue = TenderType.EncryptionTypeCode.T.value();

        String value = "T";

        Assertions.assertThat(value).isEqualTo(codeValue);

    }

    @Test
    @DisplayName("Should give the String value.")
    public void ShouldReturnStringConstantValue(){

        String codeValue = TenderType.CardEntryModeCode.ICC.value();

        String value = "ICC";

        Assertions.assertThat(value).isEqualTo(codeValue);

    }
    @Test
    @DisplayName("Should give the toString value.")
    public void ShouldReturnToStringValue(){

        String codeValue = TenderType.EncryptionTypeCode.T.toString();

        String value = "T";

        Assertions.assertThat(value).isEqualTo(codeValue);

    }

    @Test
    @DisplayName("Should give the toString value.")
    public void ShouldReturnToStringConstantValue(){

        String codeValue = TenderType.CardEntryModeCode.ICC.toString();

        String value = "ICC";

        Assertions.assertThat(value).isEqualTo(codeValue);

    }


    @Test
    @DisplayName("Should Send Exception If constant value Is Null")
    public void shouldSendCardEntryModeCodeExceptionForConstantValue(){

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {

            TenderType.CardEntryModeCode.fromValue(null);
        });

        Assertions.assertThatIllegalArgumentException();

    }

    @Test
    @DisplayName("Should Send Exception If constant value Is Null")
    public void shouldSendEncryptionTypeCodeExceptionForConstantValue(){

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {

            TenderType.EncryptionTypeCode.fromValue(null);
        });

        Assertions.assertThatIllegalArgumentException();

    }

}
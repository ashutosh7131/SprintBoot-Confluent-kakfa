
package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lineItemNumber",
        "tenderNumber",
        "tenderAmount",
        "tenderType",
        "tenderTypeId",
        "tenderExchangeRate",
        "foreignTenderCurrencyCode",
        "foreignTenderAmount",
        "accountName",
        "cardAuthMethod",
        "cardAuthReturnCode",
        "cardEntryMode",
        "encryptedExpDate",
        "encryptedCardNumber",
        "hashedCardNumber",
        "maskedCardNumber",
        "encryptedCheckRoutingNumber",
        "encryptedCheckAccountNumber",
        "encryptionType"
})
@Generated("jsonschema2pojo")
public class TenderType {
    @JsonProperty("lineItemNumber")
    @JsonPropertyDescription("Line Item Number")
    private Double lineItemNumber;

    @JsonProperty("tenderNumber")
    @JsonPropertyDescription("Tender Number")
    private Double tenderNumber;

    @JsonProperty("tenderAmount")
    @JsonPropertyDescription("Tender Amount")
    private Double tenderAmount;
    @JsonProperty("tenderType")
    @JsonPropertyDescription("Tender Type")
    private String tenderType;

    @JsonProperty("tenderTypeId")
    @JsonPropertyDescription("Tender Type Id")
    private String tenderTypeId;

    @JsonProperty("tenderExchangeRate")
    @JsonPropertyDescription("Tender Exchange Rate")
    private Double tenderExchangeRate;
    @JsonProperty("foreignTenderCurrencyCode")
    @JsonPropertyDescription("Foreign Tender Currency Code")
    private String foreignTenderCurrencyCode;
    @JsonProperty("foreignTenderAmount")
    @JsonPropertyDescription("Foreign Tender Amount")
    private Double foreignTenderAmount;

    @JsonProperty("accountName")
    @JsonPropertyDescription("Account Name")
    private String accountName;
    @JsonProperty("cardAuthMethod")
    @JsonPropertyDescription("Card Auth Method")
    private String cardAuthMethod;
    @JsonProperty("cardAuthReturnCode")
    @JsonPropertyDescription("Card Auth Return Code")
    private String cardAuthReturnCode;
    @JsonProperty("cardEntryMode")
    @JsonPropertyDescription("Card Entry Mode Code ENUM")
    private CardEntryModeCode cardEntryMode;
    @JsonProperty("encryptedExpDate")
    @JsonPropertyDescription("Encrypted Exp Date")
    private Date encryptedExpDate;
    @JsonProperty("encryptedCardNumber")
    @JsonPropertyDescription("Encrypted card Number")
    private String encryptedCardNumber;
    @JsonProperty("hashedCardNumber")
    @JsonPropertyDescription("Hashed Card Number")
    private String hashedCardNumber;
    @JsonProperty("maskedCardNumber")
    @JsonPropertyDescription("Masked Card Number")
    private String maskedCardNumber;
    @JsonProperty("encryptedCheckRoutingNumber")
    @JsonPropertyDescription("Encrypted Check Routing Number")
    private Double encryptedCheckRoutingNumber;

    @JsonProperty("encryptedCheckAccountNumber")
    @JsonPropertyDescription("Encrypted Check Account Number")
    private Double encryptedCheckAccountNumber;
    @JsonProperty("encryptionType")
    @JsonPropertyDescription("Encryption Type Code ENUM")
    private EncryptionTypeCode encryptionType;

    @JsonProperty("lineItemNumber")
    public Double getLineItemNumber() {
        return lineItemNumber;
    }

    @JsonProperty("lineItemNumber")
    public void setLineItemNumber(Double lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
    }

    @JsonProperty("tenderNumber")
    public Double getTenderNumber() {
        return tenderNumber;
    }

    @JsonProperty("tenderNumber")
    public void setTenderNumber(Double tenderNumber) {
        this.tenderNumber = tenderNumber;
    }

    @JsonProperty("tenderAmount")
    public Double getTenderAmount() {
        return tenderAmount;
    }

    /**
     * Tender Amount
     */
    @JsonProperty("tenderAmount")
    public void setTenderAmount(Double tenderAmount) {
        this.tenderAmount = tenderAmount;
    }

    @JsonProperty("tenderType")
    public String getTenderType() {
        return tenderType;
    }

    @JsonProperty("tenderType")
    public void setTenderType(String tenderType) {
        this.tenderType = tenderType;
    }

    @JsonProperty("tenderTypeId")
    public String getTenderTypeId() {
        return tenderTypeId;
    }

    @JsonProperty("tenderTypeId")
    public void setTenderTypeId(String tenderTypeId) {
        this.tenderTypeId = tenderTypeId;
    }

    @JsonProperty("tenderExchangeRate")
    public Double getTenderExchangeRate() {
        return tenderExchangeRate;
    }

    @JsonProperty("tenderExchangeRate")
    public void setTenderExchangeRate(Double tenderExchangeRate) {
        this.tenderExchangeRate = tenderExchangeRate;
    }

    @JsonProperty("foreignTenderCurrencyCode")
    public String getForeignTenderCurrencyCode() {
        return foreignTenderCurrencyCode;
    }

    @JsonProperty("foreignTenderCurrencyCode")
    public void setForeignTenderCurrencyCode(String foreignTenderCurrencyCode) {
        this.foreignTenderCurrencyCode = foreignTenderCurrencyCode;
    }

    @JsonProperty("foreignTenderAmount")
    public Double getForeignTenderAmount() {
        return foreignTenderAmount;
    }

    @JsonProperty("foreignTenderAmount")
    public void setForeignTenderAmount(Double foreignTenderAmount) {
        this.foreignTenderAmount = foreignTenderAmount;
    }

    @JsonProperty("accountName")
    public String getAccountName() {
        return accountName;
    }

    @JsonProperty("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @JsonProperty("cardAuthMethod")
    public String getCardAuthMethod() {
        return cardAuthMethod;
    }

    @JsonProperty("cardAuthMethod")
    public void setCardAuthMethod(String cardAuthMethod) {
        this.cardAuthMethod = cardAuthMethod;
    }

    @JsonProperty("cardAuthReturnCode")
    public String getCardAuthReturnCode() {
        return cardAuthReturnCode;
    }

    @JsonProperty("cardAuthReturnCode")
    public void setCardAuthReturnCode(String cardAuthReturnCode) {
        this.cardAuthReturnCode = cardAuthReturnCode;
    }

    @JsonProperty("cardEntryMode")
    public CardEntryModeCode getCardEntryMode() {
        return cardEntryMode;
    }

    @JsonProperty("cardEntryMode")
    public void setCardEntryMode(CardEntryModeCode cardEntryMode) {
        this.cardEntryMode = cardEntryMode;
    }

    @JsonProperty("encryptedExpDate")
    public Date getEncryptedExpDate() {
        return encryptedExpDate;
    }

    @JsonProperty("encryptedExpDate")
    public void setEncryptedExpDate(Date encryptedExpDate) {
        this.encryptedExpDate = encryptedExpDate;
    }

    @JsonProperty("encryptedCardNumber")
    public String getEncryptedCardNumber() {
        return encryptedCardNumber;
    }

    @JsonProperty("encryptedCardNumber")
    public void setEncryptedCardNumber(String encryptedCardNumber) {
        this.encryptedCardNumber = encryptedCardNumber;
    }

    @JsonProperty("hashedCardNumber")
    public String getHashedCardNumber() {
        return hashedCardNumber;
    }

    @JsonProperty("hashedCardNumber")
    public void setHashedCardNumber(String hashedCardNumber) {
        this.hashedCardNumber = hashedCardNumber;
    }


    @JsonProperty("maskedCardNumber")
    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    @JsonProperty("maskedCardNumber")
    public void setMaskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
    }

    @JsonProperty("encryptedCheckRoutingNumber")
    public Double getEncryptedCheckRoutingNumber() {
        return encryptedCheckRoutingNumber;
    }

    @JsonProperty("encryptedCheckRoutingNumber")
    public void setEncryptedCheckRoutingNumber(Double encryptedCheckRoutingNumber) {
        this.encryptedCheckRoutingNumber = encryptedCheckRoutingNumber;
    }

    @JsonProperty("encryptedCheckAccountNumber")
    public Double getEncryptedCheckAccountNumber() {
        return encryptedCheckAccountNumber;
    }

    @JsonProperty("encryptedCheckAccountNumber")
    public void setEncryptedCheckAccountNumber(Double encryptedCheckAccountNumber) {
        this.encryptedCheckAccountNumber = encryptedCheckAccountNumber;
    }

    @JsonProperty("encryptionType")
    public EncryptionTypeCode getEncryptionType() {
        return encryptionType;
    }

    @JsonProperty("encryptionType")
    public void setEncryptionType(EncryptionTypeCode encryptionType) {
        this.encryptionType = encryptionType;
    }

    @Generated("jsonschema2pojo")
    public enum CardEntryModeCode {

        ICC("ICC"),
        MAGSWIPE("MAGSWIPE"),
        STANDALONE("STANDALONE"),
        ICCFALLBACK("ICCFALLBACK"),
        MANUAL("MANUAL"),
        UNKNOWN("UNKNOWN");
        private final String value;
        private final static Map<String, CardEntryModeCode> CONSTANTS = new HashMap<String, CardEntryModeCode>();

        static {
            for (CardEntryModeCode c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CardEntryModeCode(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CardEntryModeCode fromValue(String value) {
            CardEntryModeCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Encryption Type Code ENUM
     */
    @Generated("jsonschema2pojo")
    public enum EncryptionTypeCode {

        __EMPTY__(""),
        C("C"),
        T("T"),
        G("G");
        private final String value;
        private final static Map<String, EncryptionTypeCode> CONSTANTS = new HashMap<String, EncryptionTypeCode>();

        static {
            for (EncryptionTypeCode c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EncryptionTypeCode(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static EncryptionTypeCode fromValue(String value) {
            EncryptionTypeCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

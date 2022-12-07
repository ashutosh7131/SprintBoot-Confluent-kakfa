
package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

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
        "discountSequenceNumber",
        "discounttype",
        "amount",
        "promotionId",
        "uniquePromotionCode",
        "aaaGid"
})
@Generated("jsonschema2pojo")
public class DiscountLineItemType {

    @JsonProperty("discountSequenceNumber")
    @JsonPropertyDescription("Discount Sequence Number")
    private Double discountSequenceNumber;
    @JsonProperty("discounttype")
    @JsonPropertyDescription("Discount Type Type ENUM")
    private DiscountTypeCode discounttype;
    @JsonProperty("amount")
    @JsonPropertyDescription("Amount")
    private Double amount;
    @JsonProperty("promotionId")
    @JsonPropertyDescription("Promotion Id")
    private String promotionId;
    @JsonProperty("uniquePromotionCode")
    @JsonPropertyDescription("Unique Promotion Code")
    private String uniquePromotionCode;
    @JsonProperty("aaaGid")
    @JsonPropertyDescription("aaaGid")
    private Double aaaGid;

    @JsonProperty("discountSequenceNumber")
    public Double getDiscountSequenceNumber() {
        return discountSequenceNumber;
    }

    @JsonProperty("discountSequenceNumber")
    public void setDiscountSequenceNumber(Double discountSequenceNumber) {
        this.discountSequenceNumber = discountSequenceNumber;
    }

    @JsonProperty("discounttype")
    public DiscountTypeCode getDiscounttype() {
        return discounttype;
    }

    @JsonProperty("discounttype")
    public void setDiscounttype(DiscountTypeCode discounttype) {
        this.discounttype = discounttype;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("promotionId")
    public String getPromotionId() {
        return promotionId;
    }

    @JsonProperty("promotionId")
    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    @JsonProperty("uniquePromotionCode")
    public String getUniquePromotionCode() {
        return uniquePromotionCode;
    }

    @JsonProperty("uniquePromotionCode")
    public void setUniquePromotionCode(String uniquePromotionCode) {
        this.uniquePromotionCode = uniquePromotionCode;
    }

    @JsonProperty("aaaGid")
    public Double getAaaGid() {
        return aaaGid;
    }

    @JsonProperty("aaaGid")
    public void setAaaGid(Double aaaGid) {
        this.aaaGid = aaaGid;
    }

    @Generated("jsonschema2pojo")
    public enum DiscountTypeCode {

        ITEM("ITEM"),
        COUPON("COUPON"),
        EMPLOYEE("EMPLOYEE"),
        UNKNOWN("UNKNOWN");
        private final String value;
        private final static Map<String, DiscountTypeCode> CONSTANTS = new HashMap<String, DiscountTypeCode>();

        static {
            for (DiscountTypeCode c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DiscountTypeCode(String value) {
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
        public static DiscountTypeCode fromValue(String value) {
            DiscountTypeCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

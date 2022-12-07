package com.anf.gdi.es.loyalty.consumer.sales.model.kafka;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DiscountLineItemTypeTests {

    @Test
    @DisplayName("Should be able to set the values using the setters and retrieve them using the getters.")
    void shouldBeAbleToSetTheValuesUsingTheSettersAndRetrieveThemUsingTheGetters() {

        double discountSequenceNumber = 98765;
        double amount = 7879;
        String promotionId = "test1promotionId";
        String uniquePromotionCode = "uniquePromotionCode";
        double aaaGid = 98765;
        var model = new DiscountLineItemType();
        var discountTypeCode = DiscountLineItemType.DiscountTypeCode.ITEM;
        model.setDiscountSequenceNumber(discountSequenceNumber);
        model.setAmount(amount);
        model.setPromotionId(promotionId);
        model.setUniquePromotionCode(uniquePromotionCode);
        model.setAaaGid(aaaGid);
        model.setDiscounttype(discountTypeCode);

        assertAll(
                () -> assertEquals(discountSequenceNumber, model.getDiscountSequenceNumber()),
                () -> assertEquals(amount, model.getAmount()),
                () -> assertEquals(promotionId, model.getPromotionId()),
                () -> assertEquals(uniquePromotionCode, model.getUniquePromotionCode()),
                () -> assertEquals(discountTypeCode, model.getDiscounttype()),
                () -> assertEquals(aaaGid, model.getAaaGid()));
    }

    @Test
    @DisplayName("Should give the enum value.")
    public void ShouldReturnEnumValue(){

        var code =  DiscountLineItemType.DiscountTypeCode.COUPON;

        String codeValue = code.value();

        String value = "COUPON";
        Assertions.assertThat(codeValue).isEqualTo(value);

    }

    @Test
    @DisplayName("Should give the String value.")
    public void ShouldReturnStringValue(){

        var code =  DiscountLineItemType.DiscountTypeCode.ITEM.value();

        String value = "ITEM";
        Assertions.assertThat(value).isEqualTo(code);

    }

    @Test
    @DisplayName("Should give the toString value.")
    public void ShouldReturnToStringValue(){

        var code =  DiscountLineItemType.DiscountTypeCode.COUPON.toString();

        String value = "COUPON";
        Assertions.assertThat(value).isEqualTo(code);

    }
    @Test
    @DisplayName("Should Send Exception If constant value Is Null")
    public void shouldSendDiscountTypeCodeExceptionForConstantValue(){

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {

            DiscountLineItemType.DiscountTypeCode.fromValue(null);
        });

        Assertions.assertThatIllegalArgumentException();

    }
}

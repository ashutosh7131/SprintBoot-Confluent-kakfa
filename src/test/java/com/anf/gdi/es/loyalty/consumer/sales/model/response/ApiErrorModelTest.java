package com.anf.gdi.es.loyalty.consumer.sales.model.response;

import com.anf.gdi.es.loyalty.consumer.sales.data.Constants;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ApiErrorModelTest {

    @Test
    @DisplayName("Should be able to create a new instsnce, when no arguments are passed into the constructor.")
    void shouldReturnNewInstanceWhenNoArgumentsArePassed() {
        var model = new ApiErrorModel();
        Assertions.assertThat(model).isInstanceOf(ApiErrorModel.class);
    }

    @Test
    @DisplayName("Should be able to set/get correct values, when using setters and getters.")
    void shouldReturnCorrectValuesWhenAllFieldsAreSet() {
        var faultDescription = "this is the fault desc";
        var details = "this is the fault detail";

        var model = new ApiErrorModel();
        model.setFaultDescription(faultDescription);
        model.setDetail(details);
        model.setFaultCode(Constants.FAULT_CODE);

        Assertions.assertThat(model).returns(Constants.FAULT_CODE, ApiErrorModel::getFaultCode)
                .returns(faultDescription, ApiErrorModel::getFaultDescription)
                .returns(details, ApiErrorModel::getDetail);
    }
}

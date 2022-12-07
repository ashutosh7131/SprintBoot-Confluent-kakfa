package com.anf.gdi.es.loyalty.consumer.sales.model.response;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ApiResponseTest {

    @Test
    @DisplayName("Should be able to set values and retrieve the correct values, when using setters and getters of a ApiErrorModel.")
    void allFieldsShouldHaveCorrectValuesWhenSetWithErrors() {
        var faultDescription = "this is the fault desc";
        var details = "this is the error %s";

        var error1 = new ApiErrorModel();
        error1.setFaultDescription(faultDescription);
        error1.setDetail(String.format(details, 1));

        var error2 = new ApiErrorModel();
        error2.setFaultDescription(faultDescription);
        error2.setDetail(String.format(details, 2));

        var model = new ApiResponse();
        assertNotNull(model.getErrors());
        assertTrue(model.getErrors().isEmpty());

        model.addError(error1);
        model.addError(error2);
        assertEquals(2, model.getErrors().size());
    }

    @Test
    @DisplayName("Should be able to create a new instance, when creating an object of a ApiResponse using the no argument constructor.")
    void shouldReturnNewInstanceWhenNoArgumentsArePassed() {
        var model = new ApiResponse();
        Assertions.assertThat(model).isInstanceOf(ApiResponse.class);
    }

    @Test
    @DisplayName("Should contain the correct values, when adding errors to an ApiErrorModel instance.")
    void shouldReflectAdditionOfNewErrorObjectWhenErrorObjectAddedToApiResponse() {
        var response = new ApiResponse();
        response.addError(new ApiErrorModel());
        Assertions.assertThat(response.getErrors()).hasSize(1);
    }

    @Test
    @DisplayName("Should be able to set data, when using setters of a ApiResponse instance.")
    void shouldBeAbleToAddDataIntoResponseObject() {
        var response = new ApiResponse();
        response.setData(new Object());

        Assertions.assertThat(response.getData()).isNotNull();
    }

    @Test
    @DisplayName("Should be able to create a new instance, when creating a new instance, if an instance of Object is passed in to the constructor.")
    void shouldBeAbleToCreateNewInstanceWhenLoyaltyPlusApiResonsePassedIn() {
        var response = new ApiResponse(new Object());
        Assertions.assertThat(response).isInstanceOf(ApiResponse.class);
    }

    @Test
    @DisplayName("Should be able to add errors, when calling the setters of an instance of ApiResponse.")
    void shouldBeAbleToAddErrorObjectToResponseObject() {
        var response = new ApiResponse();
        response.setErrors(new ArrayList<ApiErrorModel>() {
            {
                add(new ApiErrorModel());
            }
        });
        Assertions.assertThat(response.getErrors()).isNotEmpty();
    }
}

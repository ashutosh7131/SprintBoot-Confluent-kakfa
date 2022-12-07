package com.anf.gdi.es.loyalty.consumer.sales.exception;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiExceptionTest {

    @Test
    @DisplayName("Should have the correct values when instantiating.")
    void shouldHaveTheCorrectValuesWhenInstantiating() {
        var desc = "exception desc";
        var detail = "exception detail";
        var httpStatus = HttpStatus.BAD_REQUEST;
        var throwableException = new IllegalStateException("Something bad happened.");

        var exception = new ApiException(desc, detail, UUID.randomUUID(), httpStatus, throwableException);
        assertEquals(desc, exception.getDescription());
        assertEquals(detail, exception.getDetails());
        assertEquals(httpStatus, exception.getHttpStatus());
        assertEquals(throwableException, exception.getCause());

        exception = new ApiException(desc, detail, UUID.randomUUID(), httpStatus);
        assertEquals(desc, exception.getDescription());
        assertEquals(detail, exception.getDetails());
        assertEquals(httpStatus, exception.getHttpStatus());
    }
}
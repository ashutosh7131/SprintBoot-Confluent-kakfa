package com.anf.gdi.es.loyalty.consumer.sales.exception;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import lombok.Getter;

@Getter
public class ApiException extends RuntimeException {
    private final String description;
    private final String details;
    private final HttpStatus httpStatus;
    private final UUID correlationId;


    public ApiException(String description, String details, UUID correlationId, HttpStatus httpStatus) {
        super(description);
        this.description = description;
        this.details = details;
        this.correlationId = correlationId;
        this.httpStatus = httpStatus;
    }

    public ApiException(String description, String details, UUID correlationId, HttpStatus httpStatus, Throwable cause) {
        super(description, cause);
        this.description = description;
        this.details = details;
        this.correlationId = correlationId;
        this.httpStatus = httpStatus;
    }
}
package com.anf.gdi.es.loyalty.consumer.sales.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiErrorModel {
    private String faultCode = "ANF-500";
    private String faultDescription;
    private String detail;
}
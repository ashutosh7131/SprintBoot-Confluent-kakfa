package com.anf.gdi.es.loyalty.consumer.sales.model.response;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {
    private Object data;

    private List<ApiErrorModel> errors = new ArrayList<>();

    public ApiResponse(Object data) {
        this.data = data;
    }

    public void addError(ApiErrorModel error) {
        this.errors.add(error);
    }

    public void setData(Object data) {
        this.data = data;
    }
}
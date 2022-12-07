package com.anf.gdi.es.loyalty.consumer.sales.util;

import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.LoyaltyTransactionRequestOBJ;
import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.LoyaltyTransactionReturnRequestOBJ;
import com.anf.gdi.es.loyalty.consumer.sales.model.kafka.SalesTopicMessage;
import com.anf.gdi.es.loyalty.consumer.sales.model.response.ApiErrorModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.reactive.function.client.WebClient;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
public class SalesLoyaltyApiUtilTests {

    @InjectMocks
    SalesLoyaltyApiUtil salesLoyaltyApiUtil;

    @Mock
    WebClient webClient;

    @Mock
    LoyaltyTransactionRequestOBJ request;

    @Mock
    LoyaltyTransactionReturnRequestOBJ returnRequestOBJ;

    @Test
    @DisplayName("Should Send Exception If Request Object Is Null")
    public void shouldSendExceptionForRequest(){
        Exception exception = assertThrows(NullPointerException.class, () -> {
            salesLoyaltyApiUtil.callSalesLoyaltyApi(null,null, null);
        });
        assertTrue(exception.getMessage().contains("ApiRequest can not be null"));
    }
    @Test
    @DisplayName("Should Call Sales api ...")
    public void shouldCallSalesApi(){

        salesLoyaltyApiUtil.setWebClient(WebClient.create());
        salesLoyaltyApiUtil.setSalesLoyaltyUrl("postman-echo.com/post");
        assertDoesNotThrow(() -> salesLoyaltyApiUtil.callSalesLoyaltyApi("64086811",request,new ApiErrorModel()));
    }

    @Test
    @DisplayName("Should Call Sales Return api ...")
    public void shouldCallSalesReturnApi(){

        salesLoyaltyApiUtil.setWebClient(WebClient.create());
        salesLoyaltyApiUtil.setSalesLoyaltyUrl("postman-echo.com/post");
        assertDoesNotThrow(() -> salesLoyaltyApiUtil.callSalesLoyaltyReturnApi("64086811",request, returnRequestOBJ,new ApiErrorModel()));
    }

    @Test
    @DisplayName("Should Send Exception If Request Object Is Null ...")
    public void shouldCallSalesReturnApiException(){

        Exception exception = assertThrows(NullPointerException.class, () -> {
            salesLoyaltyApiUtil.callSalesLoyaltyReturnApi("64086811",null, returnRequestOBJ,new ApiErrorModel());
        });
        assertTrue(exception.getMessage().contains("ApiRequest can not be null"));
    }


}

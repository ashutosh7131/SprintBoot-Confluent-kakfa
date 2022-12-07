package com.anf.gdi.es.loyalty.consumer.sales.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HeartbeatControllerTests {

    @InjectMocks
    HeartbeatController controller;

    @Test
    void shouldReturnAResponseWithNoContentHttpStatus() {
        var response = controller.getHeartbeat();
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        assertNull(response.getBody());
    }
}

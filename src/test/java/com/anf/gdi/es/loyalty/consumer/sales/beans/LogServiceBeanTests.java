package com.anf.gdi.es.loyalty.consumer.sales.beans;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class LogServiceBeanTests {
    @InjectMocks
    LogServiceBean logServiceBean;

    @Test
    @DisplayName("Should return a LoggingService object when calling getLoggingService method.")
    void shouldReturnALoggingServiceObjectWhenCallingGetLoggingServiceMethod() {
        var logger = this.logServiceBean.getLoggingService();
        assertNotNull(logger);
    }
}

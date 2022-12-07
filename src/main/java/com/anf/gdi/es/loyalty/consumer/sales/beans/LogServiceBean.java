package com.anf.gdi.es.loyalty.consumer.sales.beans;

import com.anf.gdi.es.loyalty.consumer.sales.Application;
import com.anf.logservice.LoggingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogServiceBean {
    @Bean(name = "kafka-loggingService-bean")
    public LoggingService getLoggingService() {
        return LoggingService.getNew(Application.class);
    }
}

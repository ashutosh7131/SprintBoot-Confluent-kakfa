package com.anf.gdi.es.loyalty.consumer.sales.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@NoArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "application.kafka")
public class AppKafkaConfig {
    private String topic;
    private String group;
}

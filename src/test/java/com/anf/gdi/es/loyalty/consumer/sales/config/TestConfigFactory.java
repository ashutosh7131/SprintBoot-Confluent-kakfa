package com.anf.gdi.es.loyalty.consumer.sales.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Profile("test")
@Configuration
public class TestConfigFactory {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertiesResolver() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name = "test-app-kafka-config")
    @ConfigurationProperties(prefix = "application.kafka")
    public AppKafkaConfig getApiConfig() {
        return new AppKafkaConfig();
    }
}

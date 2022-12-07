package com.anf.gdi.es.loyalty.consumer.sales.config;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfigFactory.class)
@EnableConfigurationProperties(value = AppKafkaConfig.class)
@TestPropertySource("classpath:application-test.properties")
@ExtendWith(MockitoExtension.class)
class AppKafkaConfigTests {

    @Autowired
    @Qualifier("test-app-kafka-config")
    AppKafkaConfig appKafkaConfig;

    @Test
    @DisplayName("Should be able to return the settings read from the application.properties file.")
    void shouldBeAbleToReturnTheSettingsReadFromTheApplicationPropertiesFile() {

        assertAll(
                () -> assertNotNull(this.appKafkaConfig.getTopic()),
                () -> assertNotNull(this.appKafkaConfig.getGroup())

        );

    }
}

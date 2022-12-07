package com.anf.gdi.es.loyalty.consumer.sales.config;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class OpenApiConfigurationTests {

    @InjectMocks
    OpenApiConfiguration openApiConfiguration;

    @Test
    @DisplayName("Should return SpringDocConfiguration when springDocConfiguration method is called.")
    void shouldReturnSpringDocConfigurationWhenSpringDocConfigurationMethodIsCalled() {
        var springConfig = this.openApiConfiguration.springDocConfiguration();
        assertNotNull(springConfig);
    }

    @Test
    @DisplayName("Should return SpringDocConfigProperties when springDocConfigProperties method is called.")
    void shouldReturnSpringDocConfigPropertiesWhenSpringDocConfigPropertiesMethodIsCalled() {
        var springDocConfigProperties = this.openApiConfiguration.springDocConfigProperties();
        assertNotNull(springDocConfigProperties);
    }

}

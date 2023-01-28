package edu.penzgtu.springdemoapp.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Spring Test Application",
                version = "0.0.1",
                description = "Spring Test Application Description"
        )
)
public class SwaggerConfig {
}

package com.example.coffit.global.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Coffit API 명세서",
                description = "Coffit API 문서입니다.",
                version = "v1",
                contact = @Contact(
                        name = "Coffit",
                        url = "http://localhost:3000"
                )
        )
)
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("Swagger API") // API 그룹명
                .pathsToMatch("/api/**", "/swagger-ui/**", "/v3/api-docs/**") // 해당 경로만 문서화
                .build();
    }
}

package com.udacity.vehicles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(true);
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Vehicle Management API",
                "This API is an interface to manage fleets of vehicles",
                "1.0",
                "http://localhost:8080",
                new Contact(
                        "Ikemefuna Nwodo",
                        "https://www.linkedin.com/in/ikemefuna/",
                        "Nwodofrank@@gmail.com"
                ),
                "MIT Licence", "http://localhost:8080/#", Collections.emptyList()
        );
    }

}

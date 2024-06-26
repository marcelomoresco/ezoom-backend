package com.todolistezoom.ezoom.adapters.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Collections;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public Docket getSwagger() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.todolist.ezoom"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(infoApi());
    }

    private ApiInfo infoApi() {
        return new ApiInfo("Api Tasks - Ezoom",
                "Disponibilizando auth e crud de tarefas",
                "V1", "",
                new Contact("Marcelo Moresco", "https://www.linkedin.com/in/marcelo-adriel-moresco/", "marcelomoresco0@gmail.com"),
                null, null, Collections.emptyList());
    }
}

package com.skywalker.tinybusgo.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Skywalker
 * Date: 2023/9/6
 * File: SwaggerConfig
 * Description: Swagger的配置文件
 */

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("My API")
                        .version("1.0")
                        .description("This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3."));
    }
}

    /**
     * Create an API application
     */

//    @Bean
//    public Docket restApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("Standard API")
//                .apiInfo(apiInfo("Test Title", "0.0"))
//                .useDefaultResponseMessages(true)
//                .forCodeGeneration(false)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.skywalker.testspring.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    /**
//     * API的基本信息，可以通过访问ip:port/swagger-ui.html看到
//     * @param title
//     * @param version
//     * @return
//     */
//    private ApiInfo apiInfo(String title, String version) {
//        return new ApiInfoBuilder()
//                .title(title)
//                .description("A Test API from Skywalker")
//                .termsOfServiceUrl("None")
//                .contact(new Contact("Null", "NULL", "NULL"))
//                .version(version)
//                .build();
//    }


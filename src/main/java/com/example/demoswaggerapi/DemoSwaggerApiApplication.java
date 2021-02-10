package com.example.demoswaggerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class DemoSwaggerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSwaggerApiApplication.class, args);
    }

}

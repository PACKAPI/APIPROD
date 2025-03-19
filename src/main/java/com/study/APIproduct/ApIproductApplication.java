package com.study.APIproduct;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class ApIproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApIproductApplication.class, args);
	}

}

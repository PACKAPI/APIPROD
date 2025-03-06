package com.study.APIproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class ApIproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApIproductApplication.class, args);
	}

}

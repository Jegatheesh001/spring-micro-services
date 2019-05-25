package com.myworld.microservices.itemstockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ItemStockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemStockServiceApplication.class, args);
	}

}

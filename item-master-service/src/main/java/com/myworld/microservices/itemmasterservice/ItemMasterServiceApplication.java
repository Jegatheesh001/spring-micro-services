package com.myworld.microservices.itemmasterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ItemMasterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemMasterServiceApplication.class, args);
	}

}

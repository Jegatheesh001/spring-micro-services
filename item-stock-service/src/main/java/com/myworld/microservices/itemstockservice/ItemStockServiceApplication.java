package com.myworld.microservices.itemstockservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2
public class ItemStockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemStockServiceApplication.class, args);
	}
	
	
	/**
	 * Restricting swagger to look into mentioned paths
	 * 
	 * @return Docket
	 */
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				// service path
				// .paths(PathSelectors.ant("/stock/*"))
				// service package
				.apis(RequestHandlerSelectors.basePackage("com.myworld.microservices.itemstockservice"))
				// building docket
				.build()
				// Setting API Information
				.apiInfo(getAPIInfo());
	}


	private ApiInfo getAPIInfo() {
		return new ApiInfo("Item Stock API", "Provide information about item stock details", "1.0", "Free Service",
				new Contact("Jegatheesh", "Not available", "Not available"), "API Licence", "Not available",
				Collections.EMPTY_LIST);
	}

}

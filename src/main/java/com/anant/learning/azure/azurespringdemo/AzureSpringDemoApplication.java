package com.anant.learning.azure.azurespringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class AzureSpringDemoApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "deploy your application on Azure:"
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringDemoApplication.class, args);
	}

}

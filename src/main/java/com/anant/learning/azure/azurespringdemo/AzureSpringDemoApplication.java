package com.anant.learning.azure.azurespringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class AzureSpringDemoApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "please! deploy your application on Azure: awaiting"
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringDemoApplication.class, args);
	}

}

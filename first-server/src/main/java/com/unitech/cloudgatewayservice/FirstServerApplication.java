package com.unitech.cloudgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FirstServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstServerApplication.class, args);
	}

}

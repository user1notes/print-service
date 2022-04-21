package com.rakuten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PrintServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrintServiceApplication.class, args);
	}

}

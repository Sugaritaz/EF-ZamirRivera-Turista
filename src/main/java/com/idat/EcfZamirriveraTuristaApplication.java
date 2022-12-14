package com.idat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class EcfZamirriveraTuristaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcfZamirriveraTuristaApplication.class, args);
	}

}

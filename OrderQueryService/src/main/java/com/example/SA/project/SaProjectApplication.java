package com.example.SA.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@EnableFeignClients
@EnableEurekaClient
public class SaProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("waiting fot order to receive");

	}
}

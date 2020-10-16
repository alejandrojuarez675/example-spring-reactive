package com.alejua.example.springasyncstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableR2dbcRepositories(basePackages = "com.alejua.example.springasyncstarter.repository")
public class SpringAsyncStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAsyncStarterApplication.class, args);
	}

}

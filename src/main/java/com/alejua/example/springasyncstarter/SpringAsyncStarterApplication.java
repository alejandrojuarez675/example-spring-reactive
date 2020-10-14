package com.alejua.example.springasyncstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories(basePackages = "com.alejua.example.springasyncstarter")
@ComponentScan("com.alejua.example.springasyncstarter")
public class SpringAsyncStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAsyncStarterApplication.class, args);
	}

}

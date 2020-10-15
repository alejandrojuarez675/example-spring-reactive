package com.alejua.example.springasyncstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({
		"com.alejua.example.springasyncstarter.repository",
		"com.alejua.example.springasyncstarter.controller",
		"com.alejua.example.springasyncstarter.service",
		"com.alejua.example",
})
@EnableR2dbcRepositories
//@EnableJpaRepositories(basePackages = {"com.alejua.example.springasyncstarter.repository"})
public class SpringAsyncStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAsyncStarterApplication.class, args);
	}

}

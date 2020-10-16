package com.alejua.example.springasyncstarter.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Users {
	@Id
	private Long id;
	private String nombre;
}

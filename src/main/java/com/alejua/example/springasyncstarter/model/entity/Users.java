package com.alejua.example.springasyncstarter.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@Table("users")
public class Users {
	@Id
	private Long id;
	private String nombre;
}

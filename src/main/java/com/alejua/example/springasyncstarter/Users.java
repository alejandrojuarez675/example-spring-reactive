package com.alejua.example.springasyncstarter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Table;

//@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	@Id
	private Long id;
	private String nombre;
}

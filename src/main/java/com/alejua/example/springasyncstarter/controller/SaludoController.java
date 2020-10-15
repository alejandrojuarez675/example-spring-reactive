package com.alejua.example.springasyncstarter.controller;

import com.alejua.example.springasyncstarter.model.dto.SaludoDTO;
import com.alejua.example.springasyncstarter.service.SaludoService;
import com.alejua.example.springasyncstarter.model.dto.UserDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@Log4j2
public class SaludoController {

	@Autowired
	SaludoService saludoService;
	
	@GetMapping("/saludo")
	public SaludoDTO getSaludo() {
		log.info("GET /saludo");
		return saludoService.getSaludo(null);
	}

	@GetMapping("/saludo/{name}")
	public SaludoDTO getCustomSaludo(@PathVariable String name) {
		log.info("GET /saludo/{name}");
		return saludoService.getSaludo(name);
	}

	@GetMapping("/objetos")
	public String getObjetos() {
		log.info("GET /objetos");
		return saludoService.getObjetos();
	}
	
	@GetMapping("/users-async")
	public Flux<UserDTO> getUsersRx() {
		log.info("GET /users-async");
		return saludoService.getUsersRx();
	}

	@GetMapping("/users")
	public List<UserDTO> getUsers() {
		log.info("GET /users");
		return saludoService.getUsers();
	}
}

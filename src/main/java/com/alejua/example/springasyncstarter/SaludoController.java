package com.alejua.example.springasyncstarter;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/example")
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
	
	@GetMapping("/users")
	public Flux<UserDTO> getUsers() {
		log.info("GET /users");
		return saludoService.getUsersRx();
	}
}

package com.alejua.example.springasyncstarter.service;

import com.alejua.example.springasyncstarter.model.dto.SaludoDTO;
import com.alejua.example.springasyncstarter.model.dto.UserDTO;
import com.alejua.example.springasyncstarter.repository.UserRepositoryRx;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@Log4j2
public class SaludoService {

    @Autowired
    LettuceConnectionFactory lettuceConnectionFactory;

    @Autowired
    UserRepositoryRx userRepositoryRx;

    public SaludoDTO getSaludo(String name) {
        log.info("SaludoService::getSaludo");
        if (name == null) name = "";
        return new SaludoDTO("Hola " + name.toUpperCase());
    }

    public String getObjetos() {
        log.info("SaludoService::getObjetos");
        RedisConnection redisConnection = lettuceConnectionFactory.getConnection();
        byte[] response = redisConnection.stringCommands().get("objetos".getBytes());
        return new String(response != null ? response : new byte[0]);
    }

    public Flux<UserDTO> getUsersRx() {
        log.info("SaludoService::getUsersRx");
        if (userRepositoryRx == null)
            return Flux.just(new UserDTO("nombre por default xq no se conecta al repo"));

        return userRepositoryRx.findAll()
                .map(user -> new UserDTO(user.getNombre()));
    }

}

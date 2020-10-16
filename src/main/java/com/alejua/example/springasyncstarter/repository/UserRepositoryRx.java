package com.alejua.example.springasyncstarter.repository;

import com.alejua.example.springasyncstarter.model.entity.Users;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepositoryRx extends ReactiveCrudRepository<Users, Long> {
}

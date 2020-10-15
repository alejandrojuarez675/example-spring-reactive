package com.alejua.example.springasyncstarter.repository;

import com.alejua.example.springasyncstarter.model.entity.Users;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryRx extends ReactiveCrudRepository<Users, Long> {
}

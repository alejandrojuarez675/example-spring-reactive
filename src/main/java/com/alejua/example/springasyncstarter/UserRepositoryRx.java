package com.alejua.example.springasyncstarter;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepositoryRx extends ReactiveCrudRepository<Users, Long> {
}

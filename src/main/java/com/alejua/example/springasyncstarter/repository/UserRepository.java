package com.alejua.example.springasyncstarter.repository;

import com.alejua.example.springasyncstarter.model.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
}

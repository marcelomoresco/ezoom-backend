package com.todolistezoom.ezoom.adapters.db.repositories;

import com.todolistezoom.ezoom.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByUsername(String username);
}

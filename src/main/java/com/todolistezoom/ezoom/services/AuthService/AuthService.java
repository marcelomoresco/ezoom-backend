package com.todolistezoom.ezoom.services.AuthService;

import com.todolistezoom.ezoom.adapters.config.security.JwtService;
import com.todolistezoom.ezoom.adapters.db.repositories.UserRepository;
import com.todolistezoom.ezoom.domain.User;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final JwtService jwtService;
    private final UserRepository userRepository;

    public AuthService(JwtService jwtService, UserRepository userRepository) {
        this.jwtService = jwtService;
        this.userRepository = userRepository;
    }

    public String authenticate(Authentication authentication){
        return jwtService.generateToken(authentication);
    }

    public void createUser(User user){
        userRepository.save(user);
    }
}

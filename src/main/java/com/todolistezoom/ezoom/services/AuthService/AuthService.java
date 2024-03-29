package com.todolistezoom.ezoom.services.AuthService;

import com.todolistezoom.ezoom.adapters.config.security.JwtService;
import com.todolistezoom.ezoom.adapters.db.repositories.UserRepository;
import com.todolistezoom.ezoom.domain.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final JwtService jwtService;
    private final UserRepository userRepository;
    private PasswordEncoder passwordEncoder;


    public AuthService(JwtService jwtService, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.jwtService = jwtService;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public String authenticate(Authentication authentication){
        return jwtService.generateToken(authentication);
    }

    public void createUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
}

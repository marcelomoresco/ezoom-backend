package com.todolistezoom.ezoom.adapters.controllers.auth;

import com.todolistezoom.ezoom.adapters.dto.request.UserRequestDTO;
import com.todolistezoom.ezoom.adapters.mappers.UserMapperDomainAndDTO;
import com.todolistezoom.ezoom.domain.User;
import com.todolistezoom.ezoom.services.AuthService.AuthService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private final AuthService authService;
    private final UserMapperDomainAndDTO userMapperDomainAndDTO;

    public AuthController(AuthService authService,UserMapperDomainAndDTO userMapperDomainAndDTO) {
        this.authService = authService;
        this.userMapperDomainAndDTO = userMapperDomainAndDTO;
    }

    @PostMapping("/login")
    public String authenticate(Authentication authentication){
        return authService.authenticate(authentication);
    }

    public void createUser(UserRequestDTO userRequestDTO){
        authService.createUser(userMapperDomainAndDTO.convertRequestToDomain(userRequestDTO));
    }
}

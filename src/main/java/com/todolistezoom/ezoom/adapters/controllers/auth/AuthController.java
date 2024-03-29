package com.todolistezoom.ezoom.adapters.controllers.auth;

import com.todolistezoom.ezoom.adapters.config.security.UserAuthenticated;
import com.todolistezoom.ezoom.adapters.dto.request.UserRequestDTO;
import com.todolistezoom.ezoom.adapters.mappers.UserMapperDomainAndDTO;
import com.todolistezoom.ezoom.domain.User;
import com.todolistezoom.ezoom.services.AuthService.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<String> authenticate(Authentication user){
        String token = authService.authenticate(user);
        if(token!=null){
            return ResponseEntity.ok(token);
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Failed to authenticate");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<Void> createUser(@RequestBody UserRequestDTO userRequestDTO){
        authService.createUser(userMapperDomainAndDTO.convertRequestToDomain(userRequestDTO));
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}

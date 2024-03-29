package com.todolistezoom.ezoom.adapters.mappers;

import com.todolistezoom.ezoom.adapters.dto.request.TaskRequestDTO;
import com.todolistezoom.ezoom.adapters.dto.request.UserRequestDTO;
import com.todolistezoom.ezoom.domain.Task;
import com.todolistezoom.ezoom.domain.User;

import java.util.UUID;

public class UserMapperDomainAndDTO {
    public User convertRequestToDomain(UserRequestDTO request){
        User userDTO = new User();
        userDTO.setUsername(request.getUsername());
        userDTO.setEmail(request.getEmail());
        userDTO.setPassword(request.getPassword());
        return userDTO;
    }

}

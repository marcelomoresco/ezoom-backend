package com.todolistezoom.ezoom.adapters.dto.request;

import lombok.Data;

@Data
public class UserRequestDTO {
    final String email;
    final String password;
    final String username;
}

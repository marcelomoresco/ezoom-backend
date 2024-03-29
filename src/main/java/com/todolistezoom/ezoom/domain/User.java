package com.todolistezoom.ezoom.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "USERS")
@Entity
public class User {
    @Id
    private String username;
    private String password;
    private String email;
}

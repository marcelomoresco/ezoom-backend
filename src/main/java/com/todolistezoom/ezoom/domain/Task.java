package com.todolistezoom.ezoom.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name="TASKS")
@Data
public class Task {

    @Id
    @Column(name = "ID")
    private UUID id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DONE")
    private Boolean isDone;
}

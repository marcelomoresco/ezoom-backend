package com.todolistezoom.ezoom.adapters.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class TaskResponseDTO {
    private  UUID id;
    private String title;
    private String description;
    private Boolean isDone;

}

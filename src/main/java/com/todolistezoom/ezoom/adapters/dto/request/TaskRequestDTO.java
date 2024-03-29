package com.todolistezoom.ezoom.adapters.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class TaskRequestDTO {
    final String title;
    final String description;
    final Boolean isDone;
}

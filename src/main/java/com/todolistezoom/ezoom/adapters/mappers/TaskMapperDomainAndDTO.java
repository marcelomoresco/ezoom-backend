package com.todolistezoom.ezoom.adapters.mappers;

import com.todolistezoom.ezoom.adapters.dto.request.TaskRequestDTO;
import com.todolistezoom.ezoom.adapters.dto.response.TaskResponseDTO;
import com.todolistezoom.ezoom.domain.Task;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TaskMapperDomainAndDTO {
    public Task convertRequestToDomain(TaskRequestDTO request){
        Task taskMapped = new Task();
        taskMapped.setId(UUID.randomUUID());
        taskMapped.setDescription(request.getDescription());
        taskMapped.setTitle(request.getTitle());
        taskMapped.setIsDone(request.getIsDone());
        return taskMapped;
    }

    public TaskResponseDTO convertDomainToRequest(Task task){
        TaskResponseDTO dto = new TaskResponseDTO();
        dto.setId(task.getId());
        dto.setDescription(task.getDescription());
        dto.setIsDone(task.getIsDone());
        return dto;
    }
}
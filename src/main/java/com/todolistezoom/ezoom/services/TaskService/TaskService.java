package com.todolistezoom.ezoom.services.TaskService;

import com.todolistezoom.ezoom.adapters.dto.request.TaskRequestDTO;
import com.todolistezoom.ezoom.domain.Task;
import com.todolistezoom.ezoom.adapters.db.repositories.TaskRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Iterable<Task> findAll(){
        return taskRepository.findAll();
    }

    public Task findById(UUID uuid){
        return taskRepository.findById(uuid).orElseThrow(() -> new EntityNotFoundException("Task not found with ID: " + uuid));
    }

    public void createTask(Task task){
        taskRepository.save(task);
    }

    public void updateTask(Task task) {
        Optional<Task> optionalTask = taskRepository.findById(task.getId());
        if(!optionalTask.isPresent()) throw new EntityNotFoundException("Task not found with ID: " + task.getId());
        Task existingTask = optionalTask.get();
        existingTask.setTitle(task.getTitle());
        existingTask.setDescription(task.getDescription());
        existingTask.setIsDone(task.getIsDone());
        taskRepository.save(existingTask);
    }

}

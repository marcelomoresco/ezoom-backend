package com.todolistezoom.ezoom.adapters.controllers.task;

import com.todolistezoom.ezoom.adapters.dto.request.TaskRequestDTO;
import com.todolistezoom.ezoom.adapters.mappers.TaskMapperDomainAndDTO;
import com.todolistezoom.ezoom.domain.Task;
import com.todolistezoom.ezoom.services.TaskService.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;
    private final TaskMapperDomainAndDTO taskMapperDomainAndDTO;
    public TaskController(TaskService taskService, TaskMapperDomainAndDTO taskMapperDomainAndDTO) {
        this.taskService = taskService;
        this.taskMapperDomainAndDTO = taskMapperDomainAndDTO;
    }
    @GetMapping
    public ResponseEntity<Iterable<Task>> findAllTasks(){
        return new ResponseEntity(taskService.findAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Task> findById(@PathVariable UUID id){
        return new ResponseEntity(taskService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createTask(@RequestBody TaskRequestDTO taskRequestDTO){
        Task task = taskMapperDomainAndDTO.convertRequestToDomain(taskRequestDTO);
        taskService.createTask(task);
        return new ResponseEntity(task, HttpStatus.NO_CONTENT);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateTask(@PathVariable UUID id, @RequestBody TaskRequestDTO taskRequestDTO){
        Task task = taskMapperDomainAndDTO.convertRequestToDomain(taskRequestDTO);
        task.setId(id);
        taskService.updateTask(task);
        return new ResponseEntity(task, HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable UUID id){
        taskService.deleteTask(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

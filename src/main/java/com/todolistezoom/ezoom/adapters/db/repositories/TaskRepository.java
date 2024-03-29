package com.todolistezoom.ezoom.adapters.db.repositories;

import com.todolistezoom.ezoom.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TaskRepository extends CrudRepository<Task, UUID> {
}

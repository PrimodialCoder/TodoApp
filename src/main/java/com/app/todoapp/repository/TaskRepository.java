package com.app.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.todoapp.models.Task;
public interface TaskRepository extends JpaRepository<Task, Long> {
    // this is an interface that extends JpaRepository interface from Spring Data JPA library created to handle the database operations like create, read, update, delete (CRUD) operations. it extends using Entity name, and primary key type
}

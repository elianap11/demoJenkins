package com.example.demoJenkins.repository;

import com.example.demoJenkins.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
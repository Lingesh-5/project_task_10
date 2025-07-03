package com.example.project_task.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.project_task.models.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{
    
}

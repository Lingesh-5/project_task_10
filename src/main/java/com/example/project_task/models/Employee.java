package com.example.project_task.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="employee")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    private String id;
    private String name;
    private String email;
    private String location;

    
}

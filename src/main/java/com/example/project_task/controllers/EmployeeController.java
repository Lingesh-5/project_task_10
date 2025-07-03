package com.example.project_task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project_task.pojos.EmployeePayload;
import com.example.project_task.services.EmployeeService;


@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping()
    public String createEmployeeMethod(@RequestBody EmployeePayload employeePayload) {
        employeeService.saveEmployee(employeePayload);      
        return "Saved successfully";
    }

    @GetMapping("/displayAll")
    public ResponseEntity<?> getEmployeesMethod() {
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @GetMapping("/display/{id}")
    public ResponseEntity<?> getEmployeeMethod(@PathVariable String id) {
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }
    
    
    
    
}

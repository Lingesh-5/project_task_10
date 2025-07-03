package com.example.project_task.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.project_task.models.Employee;
import com.example.project_task.pojos.EmployeePayload;
import com.example.project_task.repositories.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEmployee(EmployeePayload employeePayload) {
        Employee new_employee = new Employee();
        new_employee.setId(employeePayload.getId());
        new_employee.setName(employeePayload.getName());
        new_employee.setEmail(employeePayload.getEmail());
        new_employee.setLocation(employeePayload.getLocation());
        employeeRepository.save(new_employee);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public ResponseEntity<?> getEmployee(String id) {
        return ResponseEntity.ok(employeeRepository.findById(id));
    }


    
    
}


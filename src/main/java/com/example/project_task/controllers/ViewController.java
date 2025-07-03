package com.example.project_task.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ViewController {

    @GetMapping()
    public String viewMethod() {
        return "index.html";
    }
    
    
}

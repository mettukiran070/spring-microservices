package com.example.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/userFallback")
    public String userFallback() {
        return "User service is taking longer than expected. Please try again later.";
    }

    @GetMapping("/departmentFallback")
    public String departmentFallback() {
        return "Department service is taking longer than expected. Please try again later.";
    }

}

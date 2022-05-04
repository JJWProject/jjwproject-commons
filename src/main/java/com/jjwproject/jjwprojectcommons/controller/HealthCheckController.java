package com.jjwproject.jjwprojectcommons.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class HealthCheckController {

    @GetMapping("health")
    public ResponseEntity<Void> serviceHealthCheck() {
        return ResponseEntity.ok().body(null);
    }
}

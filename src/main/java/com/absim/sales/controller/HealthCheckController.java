package com.absim.sales.controller;

import com.absim.sales.dto.HealthCheckDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health-check")
public class HealthCheckController {

    @GetMapping
    public ResponseEntity<HealthCheckDto> healthCheck(){
        return ResponseEntity.ok(new HealthCheckDto());
    }
}

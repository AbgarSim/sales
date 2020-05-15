package com.absim.sales.controller;

import java.util.List;

import com.absim.sales.dto.EmployeeDto;
import com.absim.sales.service.EmployeeService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employee")
    public ResponseEntity<List<EmployeeDto>> getAllEmployeesByPosition(@RequestParam(name = "position") final String position) {
        return ResponseEntity.ok(employeeService.getAllEmployeesByPosition(position));
    }
}

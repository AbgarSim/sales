package com.absim.sales.service;

import java.util.List;
import java.util.stream.Collectors;

import com.absim.sales.converter.EmployeeConverter;
import com.absim.sales.dto.EmployeeDto;
import com.absim.sales.entity.EmployeePosition;
import com.absim.sales.repository.EmployeePositionRepository;
import com.absim.sales.repository.EmployeeRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeConverter employeeConverter;

    private final EmployeeRepository employeeRepository;

    private final EmployeePositionRepository employeePositionRepository;

    public List<EmployeeDto> getAllEmployeesByPosition(final String position) {
        EmployeePosition byName = employeePositionRepository.findByName(position).orElseThrow(IllegalArgumentException::new);
        return employeeRepository.findAllByEmployeePosition(byName.getName()).stream()
                .map(employeeConverter::toDto)
                .collect(Collectors.toList());
    }
}

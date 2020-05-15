package com.absim.sales.converter;

import com.absim.sales.dto.CustomerDto;
import com.absim.sales.dto.EmployeeDto;
import com.absim.sales.entity.Customer;
import com.absim.sales.entity.Employee;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EmployeeConverter {

    private final LocationConverter locationConverter;

    public Employee toEntity(final EmployeeDto dto) {
        return Employee.builder()
                .id(dto.getId())
                .name(dto.getName())
                .city(dto.getCity())
                .build();
    }

    public EmployeeDto toDto(final Employee entity) {
        return EmployeeDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .location(locationConverter.toDto(entity.getLocation()))
                .build();
    }
}

package com.absim.sales.converter;

import java.util.stream.Collectors;

import com.absim.sales.dto.CustomerDto;
import com.absim.sales.dto.EmployeePositionDto;
import com.absim.sales.entity.Customer;
import com.absim.sales.entity.EmployeePosition;

import org.springframework.stereotype.Component;

@Component
public class EmployeePositionConverter {

    public EmployeePosition toEntity(final EmployeePositionDto dto) {
        return EmployeePosition.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }

    public EmployeePositionDto toDto(final EmployeePosition entity) {
        return EmployeePositionDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}

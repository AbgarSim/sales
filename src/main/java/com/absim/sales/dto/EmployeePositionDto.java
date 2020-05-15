package com.absim.sales.dto;

import com.absim.sales.entity.Employee;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmployeePositionDto {

    private Long id;

    private String name;

    private EmployeeDto employee;
}

package com.absim.sales.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ReportDto {

    private Long id;

    private String reportText;

    private Boolean isPositive;

    private CustomerDto customer;

    private EmployeeDto employee;
}

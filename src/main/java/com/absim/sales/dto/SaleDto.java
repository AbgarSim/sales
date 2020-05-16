package com.absim.sales.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaleDto {

    private Long id;

    private Double profit;

    private CustomerDto customer;

    private EmployeeDto employee;
}

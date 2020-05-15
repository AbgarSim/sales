package com.absim.sales.dto;

import java.util.List;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LocationDto {

    private Long id;

    private String countryName;

    private String cityName;

    private List<EmployeeDto> employees;

    private List<CustomerDto> customers;

    private List<CVDto> cvs;
}

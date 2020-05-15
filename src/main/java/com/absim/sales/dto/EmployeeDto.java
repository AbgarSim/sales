package com.absim.sales.dto;

import java.util.List;

import com.absim.sales.entity.EmployeePosition;
import com.absim.sales.entity.Location;
import com.absim.sales.entity.Report;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmployeeDto {

    private Long id;

    private String name;

    private LocationDto location;

    private String city;

    private EmployeePositionDto position;

    private List<ReportDto> reports;
}

package com.absim.sales.converter;

import com.absim.sales.dto.OfficeLocationDto;
import com.absim.sales.dto.ReportDto;
import com.absim.sales.entity.OfficeLocation;
import com.absim.sales.entity.Report;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ReportConverter {

    private final CustomerConverter customerConverter;

    private final EmployeeConverter employeeConverter;

    public Report toEntity(final ReportDto dto) {
        return Report.builder()
                .id(dto.getId())
                .isPositive(dto.getIsPositive())
                .reportText(dto.getReportText())
                .customer(customerConverter.toEntity(dto.getCustomer()))
                .employee(employeeConverter.toEntity(dto.getEmployee()))
                .build();
    }

    public ReportDto toDto(final Report entity) {
        return ReportDto.builder()
                .id(entity.getId())
                .isPositive(entity.getIsPositive())
                .reportText(entity.getReportText())
                .customer(customerConverter.toDto(entity.getCustomer()))
                .employee(employeeConverter.toDto(entity.getEmployee()))
                .build();
    }
}

package com.absim.sales.converter;

import java.util.stream.Collectors;

import com.absim.sales.dto.CustomerDto;
import com.absim.sales.entity.Customer;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CustomerConverter {

    private final LocationConverter locationConverter;

    private final ReportConverter reportConverter;

    public Customer toEntity(final CustomerDto dto) {
        return Customer.builder()
                .id(dto.getId())
                .name(dto.getName())
                .location(locationConverter.toEntity(dto.getLocation()))
                .reports(dto.getReports().stream().map(reportConverter::toEntity).collect(Collectors.toList()))
                .build();
    }

    public CustomerDto toDto(final Customer entity) {
        return CustomerDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .location(locationConverter.toDto(entity.getLocation()))
                .reports(entity.getReports().stream().map(reportConverter::toDto).collect(Collectors.toList()))
                .firstContact(entity.getCreatedAt())
                .build();
    }
}

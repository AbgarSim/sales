package com.absim.sales.converter;

import com.absim.sales.dto.CustomerDto;
import com.absim.sales.entity.Customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerConverter {

    public Customer toEntity(final CustomerDto dto) {
        return Customer.builder()
                .id(dto.getId())
                .name(dto.getName())
                .location(dto.getLocation())
                .reports(dto.getReports())
                .build();
    }

    public CustomerDto toDto(final Customer entity) {
        return CustomerDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .location(entity.getLocation())
                .reports(entity.getReports())
                .firstContact(entity.getCreatedAt())
                .build();
    }
}

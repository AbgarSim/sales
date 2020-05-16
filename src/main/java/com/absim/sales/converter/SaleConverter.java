package com.absim.sales.converter;

import com.absim.sales.dto.ReportDto;
import com.absim.sales.dto.SaleDto;
import com.absim.sales.entity.Report;
import com.absim.sales.entity.Sale;

import org.springframework.stereotype.Component;

@Component
public class SaleConverter {

    public Sale toEntity(final SaleDto dto) {
        return Sale.builder()
                .id(dto.getId())
                .profit(dto.getProfit())
                .build();
    }

    public SaleDto toDto(final Sale entity) {
        return SaleDto.builder()
                .id(entity.getId())
                .profit(entity.getProfit())
                .build();
    }
}

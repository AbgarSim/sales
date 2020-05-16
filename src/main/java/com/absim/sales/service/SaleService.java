package com.absim.sales.service;

import java.util.List;
import java.util.stream.Collectors;

import com.absim.sales.converter.SaleConverter;
import com.absim.sales.dto.SaleDto;
import com.absim.sales.repository.SaleRepository;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaleService {

    private final SaleConverter saleConverter;

    private final SaleRepository saleRepository;

    public List<SaleDto> getSaleReports() {
        return saleRepository.findAll(Sort.by("createdAt").ascending())
                .stream()
                .map(saleConverter::toDto)
                .collect(Collectors.toList());
    }
}

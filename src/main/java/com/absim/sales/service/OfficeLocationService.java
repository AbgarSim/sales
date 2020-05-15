package com.absim.sales.service;

import java.util.List;
import java.util.stream.Collectors;

import com.absim.sales.converter.OfficeLocationConverter;
import com.absim.sales.dto.OfficeLocationDto;
import com.absim.sales.repository.OfficeLocationRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OfficeLocationService {

    private final OfficeLocationConverter officeLocationConverter;

    private final OfficeLocationRepository officeLocationRepository;

    public List<OfficeLocationDto> getAllOfficeLocations() {
        return officeLocationRepository.findAll()
                .stream()
                .map(officeLocationConverter::toDto)
                .collect(Collectors.toList());
    }
}

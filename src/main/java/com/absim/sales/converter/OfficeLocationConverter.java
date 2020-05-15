package com.absim.sales.converter;

import com.absim.sales.dto.OfficeLocationDto;
import com.absim.sales.entity.OfficeLocation;

import org.springframework.stereotype.Component;

@Component
public class OfficeLocationConverter {

    public OfficeLocation toEntity(final OfficeLocationDto dto) {
        return OfficeLocation.builder()
                .id(dto.getId())
                .latitude(dto.getLatitude())
                .longitude(dto.getLongitude())
                .locationName(dto.getLocationName())
                .build();
    }

    public OfficeLocationDto toDto(final OfficeLocation entity) {
        return OfficeLocationDto.builder()
                .id(entity.getId())
                .latitude(entity.getLatitude())
                .longitude(entity.getLongitude())
                .locationName(entity.getLocationName())
                .build();
    }
}

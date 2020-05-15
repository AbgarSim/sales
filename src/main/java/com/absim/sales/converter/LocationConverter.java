package com.absim.sales.converter;

import com.absim.sales.dto.GeneralInfoDto;
import com.absim.sales.dto.LocationDto;
import com.absim.sales.entity.GeneralInfo;
import com.absim.sales.entity.Location;

import org.springframework.stereotype.Component;

@Component
public class LocationConverter {

    public Location toEntity(final LocationDto dto){
        return Location.builder()
                .id(dto.getId())
                .cityName(dto.getCityName())
                .countryName(dto.getCountryName())
                .build();
    }

    public LocationDto toDto(final Location entity){
        return LocationDto.builder()
                .id(entity.getId())
                .cityName(entity.getCityName())
                .countryName(entity.getCountryName())
                .build();
    }
}

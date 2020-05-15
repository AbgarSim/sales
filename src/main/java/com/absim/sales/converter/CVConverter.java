package com.absim.sales.converter;

import com.absim.sales.dto.BlogPostDto;
import com.absim.sales.dto.CVDto;
import com.absim.sales.entity.BlogPost;
import com.absim.sales.entity.CV;
import com.absim.sales.entity.Location;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CVConverter {

    private final LocationConverter locationConverter;

    public CV toEntity(final CVDto dto) {
        return CV.builder()
                .id(dto.getId())
                .emailAddress(dto.getEmailAddress())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .address(dto.getAddress())
                .generalInfo(dto.getGeneralInfo())
                .postalCode(dto.getPostalCode())
                .location(locationConverter.toEntity(dto.getLocation()))
                .build();
    }

    public CVDto toDto(final CV entity) {
        return CVDto.builder()
                .id(entity.getId())
                .emailAddress(entity.getEmailAddress())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .address(entity.getAddress())
                .generalInfo(entity.getGeneralInfo())
                .postalCode(entity.getPostalCode())
                .build();
    }
}

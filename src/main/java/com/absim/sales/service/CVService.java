package com.absim.sales.service;

import com.absim.sales.converter.CVConverter;
import com.absim.sales.dto.CVDto;
import com.absim.sales.entity.CV;
import com.absim.sales.repository.CVRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CVService {

    private final CVConverter cvConverter;

    private final CVRepository cvRepository;

    public CV saveCV(CVDto cvDto) {
        return cvRepository.save(cvConverter.toEntity(cvDto));
    }
}

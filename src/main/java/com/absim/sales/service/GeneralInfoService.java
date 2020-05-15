package com.absim.sales.service;

import com.absim.sales.converter.GeneralInfoConverter;
import com.absim.sales.dto.GeneralInfoDto;
import com.absim.sales.repository.GeneralInfoRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GeneralInfoService {

    private final GeneralInfoConverter generalInfoConverter;

    private final GeneralInfoRepository generalInfoRepository;

    public GeneralInfoDto getGeneralInfo() {
        return generalInfoConverter.toDto(generalInfoRepository.getOne(1L));
    }
}

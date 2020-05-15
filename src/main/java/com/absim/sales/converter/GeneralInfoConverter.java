package com.absim.sales.converter;

import com.absim.sales.dto.GeneralInfoDto;
import com.absim.sales.entity.GeneralInfo;

import org.springframework.stereotype.Component;

@Component
public class GeneralInfoConverter {

    public GeneralInfo toEntity(final GeneralInfoDto dto){
        return GeneralInfo.builder()
                .id(dto.getId())
                .companyName(dto.getCompanyName())
                .mainLink(dto.getMainLink())
                .mottoBody(dto.getMottoBody())
                .mottoTitle(dto.getMottoTitle())
                .build();
    }

    public GeneralInfoDto toDto(final GeneralInfo entity){
        return GeneralInfoDto.builder()
                .id(entity.getId())
                .companyName(entity.getCompanyName())
                .mainLink(entity.getMainLink())
                .mottoBody(entity.getMottoBody())
                .mottoTitle(entity.getMottoTitle())
                .build();
    }
}

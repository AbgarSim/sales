package com.absim.sales.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GeneralInfoDto {
    private Long id;

    private String companyName;

    private String mainLink;

    private String mottoTitle;

    private String mottoBody;
}

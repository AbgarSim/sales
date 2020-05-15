package com.absim.sales.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OfficeLocationDto {

    private Long id;

    private String locationName;

    private Double longitude;

    private Double latitude;
}

package com.absim.sales.dto;

import com.absim.sales.entity.Location;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CVDto {

    private Long id;

    private String companyName;

    private String emailAddress;

    private String firstName;

    private String lastName;

    private String address;

    private LocationDto location;

    private String postalCode;

    private String generalInfo;
}

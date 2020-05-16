package com.absim.sales.dto;

import java.util.Date;
import java.util.List;

import com.absim.sales.entity.Location;
import com.absim.sales.entity.Report;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomerDto {

    private Long id;

    private String name;

    private LocationDto location;

    private List<ReportDto> reports;

    private Date firstContact;
}

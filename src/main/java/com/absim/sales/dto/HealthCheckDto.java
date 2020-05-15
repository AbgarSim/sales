package com.absim.sales.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HealthCheckDto {

    private final String status;

    public HealthCheckDto() {
        this.status = "alive and well";
    }
}

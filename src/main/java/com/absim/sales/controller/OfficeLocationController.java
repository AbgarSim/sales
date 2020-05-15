package com.absim.sales.controller;

import java.util.List;

import com.absim.sales.dto.OfficeLocationDto;
import com.absim.sales.service.OfficeLocationService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class OfficeLocationController {

    private final OfficeLocationService officeLocationService;

    @GetMapping("/offices")
    public ResponseEntity<List<OfficeLocationDto>> getAllOfficeLocations(){
        return ResponseEntity.ok(officeLocationService.getAllOfficeLocations());
    }
}

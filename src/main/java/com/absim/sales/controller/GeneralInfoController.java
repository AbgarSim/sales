package com.absim.sales.controller;

import com.absim.sales.dto.GeneralInfoDto;
import com.absim.sales.entity.GeneralInfo;
import com.absim.sales.service.GeneralInfoService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/gen-info")
@RequiredArgsConstructor
public class GeneralInfoController {

    private final GeneralInfoService generalInfoService;

    @GetMapping
    public ResponseEntity<GeneralInfoDto> getGeneralInfo(){
        return ResponseEntity.ok(generalInfoService.getGeneralInfo());
    }
}

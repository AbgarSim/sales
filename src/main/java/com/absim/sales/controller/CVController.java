package com.absim.sales.controller;

import com.absim.sales.dto.CVDto;
import com.absim.sales.entity.CV;
import com.absim.sales.service.CVService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/cv")
public class CVController {

    private final CVService cvService;

    @PostMapping
    public ResponseEntity<CV> save(@RequestBody final CVDto cvDto) {
        return ResponseEntity.ok(cvService.saveCV(cvDto));
    }
}

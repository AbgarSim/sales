package com.absim.sales.controller;

import com.absim.sales.service.ReportService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ReportController {

    private final ReportService reportService;

    @GetMapping("/reports/negative")
    public ResponseEntity<Long> getNegativeReportsCount(){
        return ResponseEntity.ok(reportService.getNegativeReportCount());
    }

}

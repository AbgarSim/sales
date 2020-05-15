package com.absim.sales.service;

import com.absim.sales.converter.ReportConverter;
import com.absim.sales.repository.ReportRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReportService {

    private final ReportRepository reportRepository;

    public Long getNegativeReportCount(){
        return reportRepository.countByIsPositive(Boolean.FALSE);
    }
}

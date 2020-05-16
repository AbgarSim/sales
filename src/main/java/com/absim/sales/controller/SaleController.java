package com.absim.sales.controller;

import java.util.List;

import com.absim.sales.dto.SaleDto;
import com.absim.sales.service.SaleService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class SaleController {

    private final SaleService saleService;

    @GetMapping("/sales")
    public ResponseEntity<List<SaleDto>> getSales() {
        return ResponseEntity.ok(saleService.getSaleReports());
    }
}

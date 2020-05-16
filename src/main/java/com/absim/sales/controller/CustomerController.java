package com.absim.sales.controller;

import java.util.List;

import com.absim.sales.converter.CountDto;
import com.absim.sales.dto.CustomerDto;
import com.absim.sales.service.CustomerService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customers/top-sales")
    public ResponseEntity<List<CustomerDto>> getTopCustomersBySales() {
        return ResponseEntity.ok(customerService.getTopCustomers());
    }

    @GetMapping("/customers/count")
    public ResponseEntity<CountDto> getCustomersCount(){
        return ResponseEntity.ok(customerService.getCustomersCount());
    }
}

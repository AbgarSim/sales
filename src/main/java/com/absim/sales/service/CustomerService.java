package com.absim.sales.service;

import java.util.List;
import java.util.stream.Collectors;

import com.absim.sales.converter.CountDto;
import com.absim.sales.converter.CustomerConverter;
import com.absim.sales.dto.CustomerDto;
import com.absim.sales.entity.Customer;
import com.absim.sales.repository.CustomerRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerConverter customerConverter;

    private final CustomerRepository customerRepository;

    public List<CustomerDto> getTopCustomers() {
        List<Customer> allTopCustomersBySales = customerRepository.findAll();
        return allTopCustomersBySales.stream()
                .map(customerConverter::toDto)
                .limit(5)
                .collect(Collectors.toList());
    }

    public CountDto getCustomersCount() {
        return CountDto.builder().count(customerRepository.count()).build();
    }
}

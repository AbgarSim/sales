package com.absim.sales.repository;

import java.util.List;

import com.absim.sales.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //@Query("select c from Customer join c.sales s ")
    List<Customer> findAll();

}

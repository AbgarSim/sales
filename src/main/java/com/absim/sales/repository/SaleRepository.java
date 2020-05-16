package com.absim.sales.repository;

import java.util.List;

import com.absim.sales.entity.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

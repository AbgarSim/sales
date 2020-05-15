package com.absim.sales.repository;

import java.util.Optional;

import com.absim.sales.entity.Customer;
import com.absim.sales.entity.EmployeePosition;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePositionRepository extends JpaRepository<Customer, Long>{

    Optional<EmployeePosition> findByName(final String name);
}

package com.absim.sales.repository;

import com.absim.sales.entity.OfficeLocation;
import com.absim.sales.entity.Report;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {

    Long countByIsPositive(Boolean isPositive);
}

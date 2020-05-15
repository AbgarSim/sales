package com.absim.sales.repository;

import java.util.List;

import com.absim.sales.entity.BlogPost;
import com.absim.sales.entity.Employee;
import com.absim.sales.entity.EmployeePosition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    @Query("select e from Employee e join e.position p where p.name = :employeePosition")
    List<Employee> findAllByEmployeePosition(@Param("employeePosition") final EmployeePosition employeePosition);
}

package com.absim.sales.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

    private String city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_position_id")
    private EmployeePosition position;

    @OneToMany(mappedBy = "employee")
    private List<Report> reports;

    @OneToMany(mappedBy = "employee")
    private List<Sale> sales;
}

package com.absim.sales.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String countryName;

    private String cityName;

    @OneToMany(mappedBy = "location")
    private List<Employee> employees;

    @OneToMany(mappedBy = "location")
    private List<Customer> customers;

    @OneToMany(mappedBy = "location")
    private List<CV> cvs;
}

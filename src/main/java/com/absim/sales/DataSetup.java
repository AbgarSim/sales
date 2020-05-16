package com.absim.sales;

import com.absim.sales.entity.BlogPost;
import com.absim.sales.entity.Customer;
import com.absim.sales.entity.Employee;
import com.absim.sales.entity.EmployeePosition;
import com.absim.sales.entity.GeneralInfo;
import com.absim.sales.entity.Location;
import com.absim.sales.entity.OfficeLocation;
import com.absim.sales.entity.Report;
import com.absim.sales.entity.Sale;
import com.absim.sales.repository.BlogPostRepository;
import com.absim.sales.repository.CustomerRepository;
import com.absim.sales.repository.EmployeePositionRepository;
import com.absim.sales.repository.EmployeeRepository;
import com.absim.sales.repository.GeneralInfoRepository;
import com.absim.sales.repository.LocationRepository;
import com.absim.sales.repository.OfficeLocationRepository;
import com.absim.sales.repository.ReportRepository;
import com.absim.sales.repository.SaleRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSetup {

    private final static String COMPANY_NAME = "Company Inc.";
    private final static String MOTTO_TITLE = "We sell stuff!";
    private final static String MOTTO_BODY = "Don't be scared of selling things, because proffic is deffinetly something we like! Imagine your favourite superhero, now imagine he has a lot of money! Well you can almost be like him if you sell stuff!";

    private final static String BLOG_TITLE = "Blog-post title example!";
    private final static String BLOG_BODY = "I will be the leader of a company that ends up being worth billions of dollars, because I got the answers. I understand culture. I am the nucleus. I think that’s a responsibility that I have, to push possibilities, to show people, this is the level that things could be at.";

    @Bean
    public CommandLineRunner setupData(
            final GeneralInfoRepository generalInfoRepository,
            final BlogPostRepository blogPostRepository,
            final EmployeeRepository employeeRepository,
            final EmployeePositionRepository employeePositionRepository,
            final LocationRepository locationRepository,
            final CustomerRepository customerRepository,
            final OfficeLocationRepository officeLocationRepository,
            final ReportRepository reportRepository,
            final SaleRepository saleRepository
            ) {
        return args -> {
            generalInfoRepository.save(GeneralInfo.builder().companyName(COMPANY_NAME).mottoTitle(MOTTO_TITLE).mottoBody(MOTTO_BODY).build());

            blogPostRepository.save(BlogPost.builder().isMainPage(Boolean.TRUE).title(BLOG_TITLE).body(BLOG_BODY).build());
            blogPostRepository.save(BlogPost.builder().isMainPage(Boolean.FALSE).title(BLOG_TITLE).body(BLOG_BODY).build());
            blogPostRepository.save(BlogPost.builder().isMainPage(Boolean.FALSE).title(BLOG_TITLE).body(BLOG_BODY).build());

            EmployeePosition ceo = employeePositionRepository.save(EmployeePosition.builder().name("CEO").build());
            EmployeePosition manager = employeePositionRepository.save(EmployeePosition.builder().name("Manager").build());
            EmployeePosition operator = employeePositionRepository.save(EmployeePosition.builder().name("Operator").build());

            Location lSave1 = locationRepository.save(Location.builder().countryName("Moldova").cityName("Chisinau").build());
            Location lSave2 = locationRepository.save(Location.builder().countryName("Moldova").cityName("Orhei").build());
            Location lSave3 = locationRepository.save(Location.builder().countryName("Moldova").cityName("Balti").build());
            Location lSave4 = locationRepository.save(Location.builder().countryName("Niger").cityName("Oud-Turnhout").build());
            Location lSave5 = locationRepository.save(Location.builder().countryName("Curaçao").cityName("Sinaai-Waas").build());
            Location lSave6 = locationRepository.save(Location.builder().countryName("Netherlands").cityName("Baileux").build());
            Location lSave7 = locationRepository.save(Location.builder().countryName("Korea, South").cityName("Overland Park").build());
            Location lSave8 = locationRepository.save(Location.builder().countryName("Malawi").cityName("Feldkirchen in Kärnten").build());
            Location lSave9 = locationRepository.save(Location.builder().countryName("Chile").cityName("Gloucester").build());

            Employee dakotaRice = employeeRepository.save(Employee.builder().name("Dakota Rice").email("dakota@gmail.com").location(lSave1).position(ceo).build());
            Employee minervaHooper = employeeRepository.save(Employee.builder().name("Minerva Hooper").email("hoop@gmail.com").location(lSave1).position(manager).build());
            Employee sageRodriguez = employeeRepository.save(Employee.builder().name("Sage Rodriguez").email("sage@gmail.com").location(lSave3).position(manager).build());
            Employee philipChaney = employeeRepository.save(Employee.builder().name("Philip Chaney").email("chan@gmail.com").location(lSave1).position(manager).build());
            Employee dorisGreene = employeeRepository.save(Employee.builder().name("Doris Greene").email("doris@gmail.com").location(lSave5).position(manager).build());
            Employee kevinBernard = employeeRepository.save(Employee.builder().name("Kevin Bernard").email("kevin@gmail.com").location(lSave2).position(manager).build());
            Employee jimHalpert = employeeRepository.save(Employee.builder().name("Jim Halpert").email("jim@gmail.com").location(lSave3).position(manager).build());
            Employee dwightShrute = employeeRepository.save(Employee.builder().name("Dwight K. Shrute").email("dwight@gmail.com").location(lSave4).position(operator).build());
            Employee angelaHopers = employeeRepository.save(Employee.builder().name("Angela Hopers").email("angela@gmail.com").location(lSave4).position(operator).build());

            Customer dhl = customerRepository.save(Customer.builder().name("DHL").location(lSave6).build());
            Customer huuskes = customerRepository.save(Customer.builder().name("Huuskes").location(lSave7).build());
            Customer dunderMiflan = customerRepository.save(Customer.builder().name("Dunder Miflan").location(lSave8).build());
            Customer endava = customerRepository.save(Customer.builder().name("Endava").location(lSave9).build());
            Customer amandaris = customerRepository.save(Customer.builder().name("Amandaris").location(lSave5).build());
            Customer bostonRobotics = customerRepository.save(Customer.builder().name("Boston Robotics").location(lSave5).build());
            Customer tesla = customerRepository.save(Customer.builder().name("Tesla").location(lSave1).build());
            Customer michaelScott = customerRepository.save(Customer.builder().name("Michael Scott Paper Com.").location(lSave9).build());
            Customer usm = customerRepository.save(Customer.builder().name("USM").location(lSave6).build());

            officeLocationRepository.save(OfficeLocation.builder().locationName("Main Office").longitude(47.0189428).latitude(28.8222972).build());
            officeLocationRepository.save(OfficeLocation.builder().locationName("Office Tower").longitude(47.0304577).latitude(28.8359442).build());
            officeLocationRepository.save(OfficeLocation.builder().locationName("NBC").longitude(47.0233645).latitude(28.8357767).build());

            reportRepository.save(Report.builder().employee(dwightShrute).customer(michaelScott).isPositive(Boolean.FALSE).build());
            reportRepository.save(Report.builder().employee(dwightShrute).customer(michaelScott).isPositive(Boolean.FALSE).build());
            reportRepository.save(Report.builder().employee(dwightShrute).customer(michaelScott).isPositive(Boolean.FALSE).build());
            reportRepository.save(Report.builder().employee(dwightShrute).customer(michaelScott).isPositive(Boolean.FALSE).build());

            saleRepository.save(Sale.builder().customer(dhl).employee(dakotaRice).profit(1000.90).build());
            saleRepository.save(Sale.builder().customer(bostonRobotics).employee(dwightShrute).profit(332.90).build());
            saleRepository.save(Sale.builder().customer(bostonRobotics).employee(dorisGreene).profit(843.50).build());
            saleRepository.save(Sale.builder().customer(tesla).employee(dakotaRice).profit(2233.50).build());
            saleRepository.save(Sale.builder().customer(usm).employee(sageRodriguez).profit(99.90).build());
            saleRepository.save(Sale.builder().customer(usm).employee(angelaHopers).profit(450.32).build());
            saleRepository.save(Sale.builder().customer(huuskes).employee(philipChaney).profit(2334.90).build());
            saleRepository.save(Sale.builder().customer(huuskes).employee(jimHalpert).profit(500.90).build());
            saleRepository.save(Sale.builder().customer(endava).employee(jimHalpert).profit(11.90).build());
            saleRepository.save(Sale.builder().customer(bostonRobotics).employee(sageRodriguez).profit(3424.90).build());
            saleRepository.save(Sale.builder().customer(michaelScott).employee(dwightShrute).profit(333.90).build());
            saleRepository.save(Sale.builder().customer(tesla).employee(dorisGreene).profit(3532.90).build());
        };
    }
}

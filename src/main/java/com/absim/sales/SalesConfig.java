package com.absim.sales;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing
@ComponentScan("com.absim.sales")
@EnableJpaRepositories("com.absim.sales.repository")
public class SalesConfig {

}

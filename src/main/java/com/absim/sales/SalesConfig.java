package com.absim.sales;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableJpaAuditing
@ComponentScan("com.absim.sales")
@EnableJpaRepositories("com.absim.sales.repository")
public class SalesConfig implements WebMvcConfigurer {

    //
    // @Override
    // public void addInterceptors(final InterceptorRegistry registry) {
    //     registry.addInterceptor(new LoggerInterceptor());
    // }

    @Override
    public void addCorsMappings(final CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("HEAD", "OPTIONS", "GET", "POST", "PUT", "PATCH", "DELETE")
                .maxAge(3600);
    }
}

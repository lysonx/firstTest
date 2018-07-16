package com.lyson.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages ={ "com.lyson.web.service","com.lyson.web.controller","com.lyson.web.serviceImpl"})
@EntityScan(basePackages = {"com.lyson.web.model"})
@EnableJpaRepositories(basePackages = {"com.lyson.web.repository"})
public class FirstTestAdminApplication extends SpringBootServletInitializer{
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // TODO Auto-generated method stub
        return builder.sources(FirstTestAdminApplication.class);
    }

    public static void main(String[] args)
    {
        SpringApplication.run(FirstTestAdminApplication.class, args);
    }
}

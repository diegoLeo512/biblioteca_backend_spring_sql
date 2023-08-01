package com.diegoinc.biblioteca;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.diegoinc.biblioteca")
@EnableJpaRepositories(basePackages = "com.diegoinc.biblioteca.repository")
public class ConfigApplication {
    
}

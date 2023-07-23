package com.libraryem.lib;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.libraryem.lib")
@EnableJpaRepositories(basePackages = "com.libraryem.lib.repository")
@EntityScan("com.libraryem.lib.model")
public class LibConfig {
    // Configuración adicional si es necesaria
}
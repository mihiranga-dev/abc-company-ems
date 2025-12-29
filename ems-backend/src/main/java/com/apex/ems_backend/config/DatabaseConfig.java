package com.apex.ems_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.apex.ems_backend.repository.oracle")
@EnableMongoRepositories(basePackages = "com.apex.ems_backend.repository.mongo")
public class DatabaseConfig {

}

package com.digitalstore.imperium.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.digitalstore.imperium.customer", "com.digitalstore.imperium.library"})
@EnableJpaRepositories(value = "com.digitalstore.imperium.library.repository")
@EntityScan(value = "com.digitalstore.imperium.library.model")
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

}

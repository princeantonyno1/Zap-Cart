package com.digitalstore.imperium.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.digitalstore.imperium.library.*", "com.digitalstore.imperium.admin.*"})
@EnableJpaRepositories(value = "com.digitalstore.imperium.library.repository")
@EntityScan(value = "com.digitalstore.imperium.library.model")
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}

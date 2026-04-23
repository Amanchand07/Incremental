package com.edutech.progressive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.edutech.progressive.entity")
@EnableJpaRepositories(basePackages = "com.edutech.progressive.repository")
public class BankSafeApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BankSafeApplication.class)
                .web(WebApplicationType.NONE)  
                .run(args);

        
        System.out.println("Welcome to BankSafe Project!");
        SpringApplication.run(BankSafeApplication.class, args);
    }
}

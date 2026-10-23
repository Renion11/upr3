package com.example.upr3_1;

import com.example.upr3_1.model.Product;
import com.example.upr3_1.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Upr31Application {

    public static void main(String[] args) {
        SpringApplication.run(Upr31Application.class, args);
    }

    @Bean
    public CommandLineRunner initData(ProductRepository productRepository) {
        return args -> {
            productRepository.save(new Product("Laptop", 1500.00, 10));
            productRepository.save(new Product("Mishka", 25.50, 50));
            productRepository.save(new Product("Klaviatura", 80.00, 20));
            productRepository.save(new Product("Turbina", 700.00, 2));
        };
    }
}
package com.canalogies.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.canalogies.shop.repository.CustomerRepository;

@SpringBootApplication
public class ShopBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopBootApplication.class, args);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
@EnableJpaRepositories("com.example.*")
@EntityScan("com.example.*")
public class SpringDataSetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataSetApplication.class, args);
	}

}

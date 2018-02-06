package com.lzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lzx")
public class SpringBootJpaOrJdbcTempalteApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootJpaOrJdbcTempalteApplication.class, args);
	}
}

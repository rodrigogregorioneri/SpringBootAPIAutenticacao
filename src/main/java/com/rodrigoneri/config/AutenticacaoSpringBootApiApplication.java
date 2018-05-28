package com.rodrigoneri.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.rodrigoneri")
@SpringBootApplication
public class AutenticacaoSpringBootApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutenticacaoSpringBootApiApplication.class, args);
	}
}

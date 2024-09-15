package com.jdc.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jdc.commons")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

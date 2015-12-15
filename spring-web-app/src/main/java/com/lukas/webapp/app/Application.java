package com.lukas.webapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.lukas.webapp.rest")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

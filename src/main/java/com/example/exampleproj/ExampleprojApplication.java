package com.example.exampleproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ExampleprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleprojApplication.class, args);
	}

}

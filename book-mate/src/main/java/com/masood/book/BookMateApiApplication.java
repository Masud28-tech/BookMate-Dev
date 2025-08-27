package com.masood.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BookMateApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMateApiApplication.class, args);
	}

}

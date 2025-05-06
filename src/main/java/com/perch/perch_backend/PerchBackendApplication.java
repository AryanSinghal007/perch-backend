package com.perch.perch_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.perch")
@EnableJpaRepositories("com.perch")
public class PerchBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerchBackendApplication.class, args);
	}

}

package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class MXMApplication {

	public static void main(String[] args) {
		SpringApplication.run(MXMApplication.class, args);
	}
}

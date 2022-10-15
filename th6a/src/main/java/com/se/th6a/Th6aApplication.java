package com.se.th6a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class Th6aApplication {

	public static void main(String[] args) {
		SpringApplication.run(Th6aApplication.class, args);
	}

}

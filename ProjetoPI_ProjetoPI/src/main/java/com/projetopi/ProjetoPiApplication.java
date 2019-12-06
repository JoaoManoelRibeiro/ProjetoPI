package com.projetopi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ProjetoPiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPiApplication.class, args);
		System.out.print(new BCryptPasswordEncoder().encode("123"));
	}

}

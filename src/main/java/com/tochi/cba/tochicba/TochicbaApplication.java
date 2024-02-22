package com.tochi.cba.tochicba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.tochi.cba.tochicba")
public class TochicbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TochicbaApplication.class, args);
	}

}

package com.snapdeal.flyway.components;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("applicationContext.xml")
public class MigrationMain {

	public static void main(String[] args) {
		SpringApplication.run(MigrationMain.class, args);
	}

}

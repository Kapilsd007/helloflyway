package com.snapdeal.flyway.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.FlywayException;

@RestController
public class MigrationController {
	@Autowired
	Flyway flyway;
	
	@RequestMapping("/migrate")
	public void migrateF() {
		try {
			System.out.println("Migrating - flyway...");
			flyway.migrate();
		} catch (FlywayException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	@RequestMapping("/repair")
	public void repairF() {
		try {
			System.out.println("Repairing - flyway...");
			flyway.repair();
		} catch (FlywayException ex) {
			System.out.println(ex.getMessage());
		}
	}	
}

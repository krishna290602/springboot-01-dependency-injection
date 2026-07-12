package com.springboot.sb_01_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb01DependencyInjectionApplication implements CommandLineRunner {

	// @Autowired - Used for FIELD INJECTION

	// Constructor Dependency Injection
	// In case if C-DI, we can make the below bean FINAL -> Cant change it once initialized in the constructor below
	final private NotificationService notificationService;

	// Spring automatically injects the bean in the Parameter below
	public Sb01DependencyInjectionApplication(NotificationService notificationService) {
		// initializing the variable with the bean
		this.notificationService = notificationService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Sb01DependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		notificationService.send("Hello World!");

		// Cannot assign a value to final variable 'notificationService'
		// this.notificationService = null;

		// Most preferred way because variables are now immutable - Cant be modified - for safety
	}

}

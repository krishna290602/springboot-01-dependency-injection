package com.springboot.sb_01_dependency_injection;

import com.springboot.sb_01_dependency_injection.Implementations.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb01DependencyInjectionApplication implements CommandLineRunner {

	@Autowired
	private NotificationService notificationService;

	public static void main(String[] args) {
		SpringApplication.run(Sb01DependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		notificationService.send("Hello World!");
	}

}

package com.celticintl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerMain implements CommandLineRunner {

	@Override
	public void run(String... args) {
	}

	public static void main(String[] args) throws Exception {
		SpringApplication application = new SpringApplication(ConfigServerMain.class);
		application.setApplicationContextClass(AnnotationConfigApplicationContext.class);
		SpringApplication.run(ConfigServerMain.class, args);
	}
}

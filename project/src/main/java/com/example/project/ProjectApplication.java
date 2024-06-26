package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.project.student")

public class ProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjectApplication.class, args);
	}


}

package com.web.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Using the parameter scanBasePackages, we can indicate the package where the app found class with annotacions.
@SpringBootApplication(scanBasePackages={"com.web"})
public class TestWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestWebAppApplication.class, args);
	}

}

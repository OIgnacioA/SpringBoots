package com.sehent.DI.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableAutoConfiguration
@Import(AppConfig.class)
@ComponentScan(basePackages = {"com.sehent.DI.app", "com.sehent.DI.app.models.domain"})
public class SpringBootWeb1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWeb1Application.class, args);
	}

}

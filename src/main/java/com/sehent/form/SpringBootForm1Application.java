package com.sehent.form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sehent.form")
public class SpringBootForm1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootForm1Application.class, args);
	}

}

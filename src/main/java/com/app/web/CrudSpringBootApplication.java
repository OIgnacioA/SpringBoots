package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.estudianteRepositorio;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}
	@Autowired
	private estudianteRepositorio repositorio; 
		
	
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Estudiante estudiante1 = new Estudiante ("Adabastio", "rolonololgo", "lavidaesuanvrga@gmail.com");
		repositorio.save(estudiante1); 
		
		Estudiante estudiante2 = new Estudiante ("Colonio", "rologolozo", "auxilio@gmail.com");
		repositorio.save(estudiante2);*/
	}

}

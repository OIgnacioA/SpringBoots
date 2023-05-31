package com.sehent.DI.app.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cliente {

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		apellido = apellido;
	}
   @Value("${cliente.apellido}")
	private String apellido;
   @Value("${cliente.nombre}")
	private String nombre;
}

package com.sehent.form.models.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



public class Usuario {

	private String Identificador ; 
	
	@NotEmpty
	@Size(min = 3, max = 8)
	private String username;
	
	@NotEmpty
	private String password;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	private String Nombre;
	@NotEmpty
	private String Apellido;
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdentificador() {
		return Identificador;
	}
	public void setIdentificador(String identificador) {
		Identificador = identificador;
	}

}

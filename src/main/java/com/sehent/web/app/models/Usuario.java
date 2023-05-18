package com.sehent.web.app.models;

public class Usuario {

	private String Apellido;
	private String tombre;
	private String email;

	public Usuario(String apellido, String tombre, String email) {
		super();
		Apellido = apellido;
		this.tombre = tombre;
		this.email = email;
	}

	public Usuario() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTombre() {
		return tombre;
	}

	public void setTombre(String tombre) {
		this.tombre = tombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

}

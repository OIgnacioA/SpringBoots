package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Estudiante;

public interface estudianteServicio{

	public List<Estudiante> listarTodosLosEstudiantes();
	
	public Estudiante guardarEstudiante(Estudiante estudiante);
}

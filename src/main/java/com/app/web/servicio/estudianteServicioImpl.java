package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.estudianteRepositorio;

@Service
public class estudianteServicioImpl implements estudianteServicio{

	@Autowired
	private estudianteRepositorio repositorio;
	
	
	@Override
	public List<Estudiante> listarTodosLosEstudiantes() {
		
		return repositorio.findAll();
	}


	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		return repositorio.save(estudiante);
	}

}

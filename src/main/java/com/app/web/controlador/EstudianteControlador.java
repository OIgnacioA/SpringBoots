package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Estudiante;

import com.app.web.servicio.estudianteServicio;

import org.springframework.ui.Model;
@Controller
public class EstudianteControlador {

	
	@Autowired
	private estudianteServicio servicio; 
	
	@GetMapping({"/estudiantes", "/"})
     public String listarEstudiantes(Model modelo) {
		modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
		return "estudiantes";
		
		
	}
	
	
	@GetMapping("/estudiantes/nuevo")
		
		public  String  MostrarFormulariodeRegistrarEstudiante(Model modelo) {
			
		Estudiante estudiante = new Estudiante();
		modelo.addAttribute("estudiante",estudiante);
		return "crear_estudiantes"; 
		}
		
		
	@PostMapping("/estudiantes")
	
	public  String  guardarEstudiante(@ModelAttribute("estudiante")Estudiante estudiante) {
		
	servicio.guardarEstudiante(estudiante);
	return "redirect:/estudiantes";
	}
	
	
	
	
	
}

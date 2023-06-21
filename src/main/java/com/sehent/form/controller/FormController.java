package com.sehent.form.controller;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.sehent.form.models.domain.Usuario;

@Controller
public class FormController {

	@GetMapping("/form")
	public String form(Model model) {
		 
		Usuario usuario = new Usuario();
		usuario.setNombre("john");
		usuario.setApellido("Connor");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "formulario Usuarios");
		return "form";
	}
	
	
	
	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario,BindingResult result, Model model
			) {	

				if(result.hasErrors()) {
					
				
					
					return "form";
				}
		
		
		model.addAttribute("titulo", "Resultado del form");
		model.addAttribute("usuario", usuario);
		
		
		
		
		return "resultado";
	}
	
	
	
	
	
}

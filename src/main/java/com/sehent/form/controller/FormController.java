package com.sehent.form.controller;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import com.sehent.form.models.domain.Usuario;

@Validated
@Controller
@SessionAttributes("usuario")
public class FormController {

	@GetMapping("/form")
	public String form(Model model) {
		 
		Usuario usuario = new Usuario();
		usuario.setNombre("john");
		usuario.setApellido("Connor");
		usuario.setIdentificador("123.456.789-k");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "formulario Usuarios");
		return "form";
	}
	
	
	
	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario,BindingResult result, Model model, SessionStatus status
			) {	
		model.addAttribute("titulo", "Resultado del form");
				if(result.hasErrors()) {
					
				
					
					return "form";
				}
		
		
	
		model.addAttribute("usuario", usuario);
		
		
		status.setComplete(); 
		
		return "resultado";
	}
	
	
	
	
	
}

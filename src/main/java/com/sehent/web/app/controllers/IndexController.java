package com.sehent.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.sehent.web.app.models.*;
//import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/app")
public class IndexController {

	
	
	@RequestMapping({"/index","/","home"})
	public String Index(Model model) {
		
		model.addAttribute("titulo", "hola a todes"); 
		
		return "index"; 
	}
	
	@RequestMapping("/perfil")
	public String perfil (Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setTombre("Adrian");
		usuario.setApellido("Paenza ");
		usuario.setEmail("sosoroso@aliacolli.com");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "perfil de usuario". concat(usuario.getTombre()));
		
		return "perfil";

	}
	
	
	@RequestMapping("/listar")
	public String Lista (Model model) {
		
		List <Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(new Usuario("Andres", "jack","Leoncio@topologico.com"));
		usuarios.add(new Usuario("Iñaky", "Urlezaga","perezcoll@topologico.com"));
		usuarios.add(new Usuario("Theodor", "MEnenedez","Leoncio@topologico.com"));
		usuarios.add(new Usuario("Slaves", "para_guay","help@topologico.com"));
		model.addAttribute("titulo","Lista de Usuarios");
		model.addAttribute("usuarios", usuarios);
		
		return "Lista";

	}
	
}

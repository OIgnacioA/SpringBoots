package com.sehent.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sehent.controller.services.IMaterials;


@Controller
public class Controlador {
	@Autowired
	private IMaterials Materiales; 
	
	@GetMapping({"/", "", "/index"})
	public String index (Model model) {
		  List<String> lista = Materiales.Proceso();
	        model.addAttribute("objeto", lista);
		return "vista";
	}
	
	
	@PostMapping("/procesar-dato")
	public String procesarDato(@RequestParam("dato") char dato, Model model) {
	    List<String> lista = Materiales.Proceso();
	    int size = lista.size();
	    int i = 0;
	    List<String> resultados = new ArrayList<>();

	    while (i < size) {
	        String elemento = lista.get(i);
	        int primer = elemento.length() - 8;
	     	
	        char Primer = elemento.charAt(primer);
	     
	        if (Primer == dato) {
	        
	            resultados.add(elemento);
	        }

	       i++;
	    }

	    model.addAttribute("resultados", resultados);

	    return "vista-devolucion";
	}


}

package com.sehent.DI.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sehent.DI.app.models.services.IServicio;
import org.springframework.ui.Model;
//import ch.qos.logback.core.model.Model; 


@Controller
public class IndexController {
	
	@Autowired
	@Qualifier("miServicioComplejo")
	private IServicio servicio;
	
	



	@GetMapping({"", "/", "/index"})
	public String index (Model model) {
		model.addAttribute("objeto", servicio.Operacion());
		return "index";
	}
	

}

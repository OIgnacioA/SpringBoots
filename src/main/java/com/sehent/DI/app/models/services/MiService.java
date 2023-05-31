package com.sehent.DI.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioSimple")
//@Primary
public class MiService implements IServicio {

	@Override
	public String Operacion() {
		// TODO Auto-generated method stub
		return "operacion realizandose de manera esitosa simple ..."; 
	}


	
}

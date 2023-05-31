package com.sehent.DI.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.sehent.DI.app.models.services.IServicio;
import com.sehent.DI.app.models.services.MiService;
import com.sehent.DI.app.models.services.MiServiceComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	@Primary
	public IServicio registrarMiServicio() {		
		return new MiService();
	}
	
	
	@Bean("miServicioComplejo")
	
	public IServicio registrarMiServicioComplejo() {		
		return new MiServiceComplejo();
	}

	
}

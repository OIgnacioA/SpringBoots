package com.sehent.DI.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.sehent.DI.app.models.domain.ItemFactura;
import com.sehent.DI.app.models.services.IServicio;
import com.sehent.DI.app.models.services.MiService;
import com.sehent.DI.app.models.services.MiServiceComplejo;
import com.sehent.DI.app.models.domain.Producto;

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
	

	
	@Bean("yerba")

	public List <ItemFactura> reghistrarItems() {
	Producto producto1 = new Producto("yerba mate", 100);

	
	ItemFactura linea1 = new ItemFactura(producto1, 2);

	
	
	return Arrays.asList(linea1);
	
}




	
	
}

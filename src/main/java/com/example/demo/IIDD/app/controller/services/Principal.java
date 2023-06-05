package com.example.demo.IIDD.app.controller.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Component("Principal")
public class Principal implements IMaterials {

	 BufferedWriter br = null; 
     Writer swResultados = null;
	 BufferedReader reader = null;
	 public String Path = "C:\\Users\\oscar.avendano\\Desktop\\experimento\\documento1.txt"; 
	 public String Path2 = "C:\\Users\\oscar.avendano\\Desktop\\experimento\\documento2.txt"; 
	 public  String line;
	 public String Linea; 
	
	 
	 String nombre = "";
     String apellido = "";
     String dni = "";
	 String resultado= "" ; 

	 
	 
	@Override
	public List<String> Proceso() {
	
		Linea = Letura();
		List<String> lista = new ArrayList<>();
		
		while(Linea != null){
		
		
		Substrings(Linea);
		

		resultado = "El señor " + apellido + " " + nombre + "tiene el dni numero: " + dni; 
			
		 System.out.println("----------->"+resultado);
		 Escritura(resultado);
		lista.add(resultado);
		
		
			
		apellido = "";
		nombre = "";
		dni = "";
		
		
		 try {
			 Linea = reader.readLine();
          } catch (IOException e) {
                  
           System.out.println("Error al cerrar el BufferedReader: " + e.getMessage());
            
          }
		
		
	}
	      
		 return lista; 	 
}

	
	
	
	
	@Override
	public String Letura() {
		
	

	        try {
		           reader = new BufferedReader(new FileReader(Path));
		           line = reader.readLine();

	            } catch (IOException e) {
	                    
	             System.out.println("Error al cerrar el BufferedReader: " + e.getMessage());
	             return ""; 
	             
	            }

	        return line;
    }

	
	
	@Override
	public void Substrings(String Linea) {
	
		    nombre = Linea.substring(0, 12);
	        apellido = Linea.substring(12, 24);
	        dni = Linea.substring(24, 32);


	}
	
	

	@Override
	public void Escritura(String resultado) {
		
		
		
	
		
		try {
		    swResultados = new FileWriter(Path2, true);
		    br = new BufferedWriter(swResultados);
		    br.newLine(); 
		    br.write(resultado);
		} catch (Exception e) {
		    // Manejar el error
		} finally {
		    try {
		        if (br != null) {
		            br.close();
		        }
		        if (swResultados != null) {
		            swResultados.close();
		        }
		    } catch (IOException e) {
		        // Manejar el error al cerrar los recursos
		    }
		
		}
	}

}

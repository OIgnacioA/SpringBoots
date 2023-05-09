package ar.emisiones.servlet;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistroDato
 */
@WebServlet("/RegistroDato")
public class RegistroDato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroDato() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    String line = "" ;
	BufferedReader file = null; 
    FileWriter SW = null;	
    String archivoDestino = "C:\\Users\\sehent\\eclipse-workspace\\PruebaServlet\\src\\main\\java\\ar\\emisiones\\servlet\\Datos\\resultado.txt";
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		

		PrintWriter salida = response.getWriter();
	     line = request.getParameter("datto");
		
		System.out.println("------>" + line);
		
		salida.println("<!DOCTYPE html>");
		salida.println("<html>");
		salida.println("<body>");
		salida.println("Dato Introducido " + request.getParameter("datto"));
		salida.println("<br>");
		salida.println("<br>");
		salida.println("</body>");
		salida.println("</html>");
		
		Escritura();
		
		 try {
				SW.append(line + "\r\n");
		   } catch (IOException e1) {e1.printStackTrace();}
		    
		 
		 
		 try{
		       SW.flush();
		       SW.close();
		   } catch (Exception e){} 
		 
	}


	public void Escritura() {
		
		try{
			  SW = new FileWriter(archivoDestino,true); 

		} catch (Exception e){System.out.println("Error de Escritura del fichero");}

	}
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

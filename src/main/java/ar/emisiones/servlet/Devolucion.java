package ar.emisiones.servlet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Devolucion
 */
@WebServlet("/Devolucion")
public class Devolucion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Devolucion() {
        super();
        // TODO Auto-generated constructor stub
    }

    String archivoOrigen = "C:\\Users\\sehent\\eclipse-workspace\\PruebaServlet\\src\\main\\java\\ar\\emisiones\\servlet\\Datos\\resultado.txt";
    BufferedReader file = null; 
    String line = "" ;
    String datto = ""; 
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 response.setContentType(archivoOrigen);


		 Lectura();
		 
		 
		    PrintWriter out = response.getWriter();
		    out.println("<!DOCTYPE html>");
		    out.println("<html>");
		    out.println("<head>");
		    out.println("<title>Lista de datos</title>");
		    out.println("</head>");
		    out.println("<body>");
		    
		    
		    out.println("<center>");
		    out.println("<table>");
	        out.println("<tr>");
	        out.println("<th>Datos Guardados</th>");
	        out.println("</tr>");
		    
		 
		 while (line != null) {

				    LeerLinea(line);
				    //printAll(); 

			
				    
				    
				    out.println("<tr>");
		            out.println("<td>" +  datto + "</td>");
		      
		            out.println("</tr>");
				    

			       try {
				    	line = file.readLine();
				   } catch (IOException e) {e.printStackTrace();}
			     
		}
		 out.println("</table>");
		 out.println("</center>");
		 out.println("</body>");
		 out.println("</html>");
	}
			 
 private void LeerLinea(String Line) {
					

		 datto = line.substring(0,3).replaceAll(" ","") ;
	}
			 
			 
 public String Lectura() {
				
			   try{          
			   	    file = new BufferedReader (new FileReader(archivoOrigen));
			   	      return  line = file.readLine();
			   	    }catch(Exception e1) {System.out.println("Error de lectura del fichero");}
			       

			return "Fail!";
			
		}		 
			 
			 
			 
			 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

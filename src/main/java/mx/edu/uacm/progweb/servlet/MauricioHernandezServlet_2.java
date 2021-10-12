package mx.edu.uacm.progweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MauricioHernandezServlet_2 extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String nombre = req.getParameter("nombre");
		System.out.println("el nombre es :" + nombre);
		
		
		String apellido = req.getParameter("apellido");
		System.out.println("el apellido  es :" + apellido);
		
		PrintWriter salida =resp.getWriter();
		salida.println("Hola mi nombre es "+ nombre + " y mi apellido es " + apellido );
		
	}


}

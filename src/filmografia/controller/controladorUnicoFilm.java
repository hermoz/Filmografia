package filmografia.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import accion.Facade;


public class controladorUnicoFilm {
	private static final long serialVersionUID = 1L;

    public controladorUnicoFilm() {
        
    }
    /**
     * Metodo doGet
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }
    /**
	 * Metodo doPost
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		/**
		 * Creamos objeto de la interfaz Facade que hemos implementado como interfaz unica
		 */
		Facade ac = null;
		String pagSiguiente = null;
		
		String action = request.getParameter("action");
		try {
			switch (action) {
			/**
			 * Hacemos una llamada a cada una de las clases creadas que implementan la Facade
			 * y obtienen los parametros
			 */
				case "Muestra empleados":
					ac = new MuestraEmpleados();
					pagSiguiente = ac.ejecutar(getServletContext(), request, response);
					break;
				case "Mostrar sueldo":
					ac = new MuestraSueldo();
					pagSiguiente = ac.ejecutar(getServletContext(), request, response);
					break;
				case "Recuperar empleados":
					ac = new RecuperarEmpleados();
					pagSiguiente = ac.ejecutar(getServletContext(), request, response);
					break;
				case "Modificar empleados":
					ac = new ModificarEmpleados();
					pagSiguiente = ac.ejecutar(getServletContext(), request, response);
	    	 			pagSiguiente = "Exito.html";
					break;
				default:
					pagSiguiente = "Error.html";
					break;
			}
		} catch (Exception e) {
			pagSiguiente = "Error.html";
		}
		rd = request.getRequestDispatcher(pagSiguiente);
		rd.forward(request, response);
	}

}

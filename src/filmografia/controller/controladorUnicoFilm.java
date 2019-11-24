package filmografia.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import filmografia.accion.Facade;
import filmografia.accion.MostrarListadoPelDirector;


public class controladorUnicoFilm  extends HttpServlet {
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
		Facade facAction = null;
		String resultadoListado = null;
		
		String action = request.getParameter("action");
		try {
			switch (action) {
			/**
			 * Hacemos una llamada a cada una de las clases creadas que implementan la Facade y obtienen los parametros
			 */

				case "Mostrar listado director":
					facAction = new MostrarListadoPelDirector();
					resultadoListado = facAction.ejecutar(getServletContext(), request, response);
					break;

				default:
					resultadoListado = "errorControl.html";
					break;
			}
		
		} catch (Exception e) {
			
			e.printStackTrace();
			resultadoListado = "errorControl.html";
		}
		rd = request.getRequestDispatcher(resultadoListado);
		rd.forward(request, response);
	}

}

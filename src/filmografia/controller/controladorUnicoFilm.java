package filmografia.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import filmografia.accion.Facade;
import filmografia.accion.MostrarListadoPelDirector;


@WebServlet("/controladorUnicoFilm")
public class controladorUnicoFilm  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaramos una lista tipo String donde guardaremos las películas resultantes de la búsqueda
	 */
	private List<String> listaPeliculas;

	

    public controladorUnicoFilm() {
    	
    	listaPeliculas = new ArrayList<String>();
        
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
				/**
				 * Opción Mostrar Listado de peliculas del director donde incluimos el parámetro de nombre del director en nuestro consultarDirector.jsp
				 * name="action" value="Mostrar listado director"
				 */
				case "Mostrar listado director":

					//Accedemos a nuestro paquete action correspondiente y llamamos al método correspondiente

					facAction = new MostrarListadoPelDirector();
					resultadoListado = facAction.ejecutar(getServletContext(), request, response);
					
					/**
					 * Si intentamos contemplar la opción de parameter=null obtenemos un error de código.
					 * De modo que si el parámetro es distinto de nulo hace búsqueda en base de datos, 
					 * para resto de opciones el director no existe
					 */
					if (request.getParameter("director") != null) {
						listaPeliculas.add(request.getParameter("director"));
					} else {
						resultadoListado="errorDirectorNoExiste.html";
					}
					/*
					 * Anadimos a la lista creada las películas cuyo parámetro director es el obtenido
					 * listaPeliculas.add(request.getParameter("director"));
					 */
					
					
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

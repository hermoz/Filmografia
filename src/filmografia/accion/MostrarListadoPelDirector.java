package filmografia.accion;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import filmografia.cineCatalogo.Pelicula;
import filmografia.dao.PeliculaDAO;

public class MostrarListadoPelDirector implements Facade {

	PeliculaDAO peliculaDAO;
	
	public MostrarListadoPelDirector() {
		peliculaDAO =  new PeliculaDAO ();
	}

	@Override
	public String ejecutar(ServletContext sc, HttpServletRequest request, HttpServletResponse response) {
		
		//obtenemos parámetro del formulario con name"director"
		String director =  request.getParameter("director");
		
		//Creamos una lista para guardar las peliculas obtenidas
		List<Pelicula> listadoPeliculasDirector;
		String resultadoListado;
		
		try {
			
			//para guardar el listado llamamos al método creado de DAO
			listadoPeliculasDirector=peliculaDAO.mostarListadoPeliculas(director);
			
			request.setAttribute("director",director);
			
			//Establecemos nombre de la variable para recorrer en .jsp mi lista con for:each
			request.setAttribute("listadoPeliculasDirector",listadoPeliculasDirector);
			
			//indicamos .jsp donde recogeremos parámetros y mostraremos la información del resultado obtenido
			resultadoListado="listadoPeliculasDir.jsp";
			
		} catch (Exception e) {
			e.printStackTrace();
			resultadoListado = "errorControl.html";
			
		}
			
		return resultadoListado;
	}
}

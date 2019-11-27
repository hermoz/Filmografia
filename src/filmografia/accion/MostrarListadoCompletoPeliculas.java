package filmografia.accion;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import filmografia.cineCatalogo.Pelicula;
import filmografia.dao.PeliculaDAO;

public class MostrarListadoCompletoPeliculas implements Facade {

	PeliculaDAO peliculaDAO;

	public MostrarListadoCompletoPeliculas() {
		peliculaDAO = new PeliculaDAO();
	}

	@Override
	public String ejecutar(ServletContext sc, HttpServletRequest request, HttpServletResponse response) {

		// Creamos una lista para guardar las peliculas obtenidas
		List<Pelicula> listadoPeliculasCompleto;
		String resultadoListado = null;

		try {

			// para guardar el listado llamamos al método creado de DAO
			listadoPeliculasCompleto = peliculaDAO.mostarListadoCompletoPeliculas();
			if (listadoPeliculasCompleto==null || listadoPeliculasCompleto.size()==0) {
				
				resultadoListado="errorControlDatosBBDD.html";
			} else {
		
				// Establecemos nombre de la variable para recorrer en .jsp mi lista con
				// for:each
				request.setAttribute("listadoPeliculasCompleto", listadoPeliculasCompleto);

				// indicamos .jsp donde recogeremos parámetros y mostraremos la información del
				// resultado obtenido
				resultadoListado = "listadoPeliculasCompleto.jsp";
			}


		} catch (Exception e) {
			e.printStackTrace();
			resultadoListado = "errorControl.html";

		}

		return resultadoListado;
	}
}

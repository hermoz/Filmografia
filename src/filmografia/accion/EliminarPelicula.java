package filmografia.accion;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import filmografia.cineCatalogo.Pelicula;
import filmografia.dao.PeliculaDAO;

public class EliminarPelicula implements Facade {

	PeliculaDAO peliculaDAO;

	public EliminarPelicula() {
		peliculaDAO = new PeliculaDAO();
	}

	@Override
	public String ejecutar(ServletContext sc, HttpServletRequest request, HttpServletResponse response) {

		// obtenemos parámetro del formulario con name"director"
		int id = Integer.parseInt(request.getParameter("id"));
		// Creamos una lista para guardar las peliculas obtenidas
		String resultadoListado = null;

		try {
			if (peliculaDAO.eliminarPelicula(id) == false) {
				request.setAttribute("id", id);
				resultadoListado = "exitoModificaciónBBDD.html";
			} else {
				resultadoListado="errorControlDatosBBDD.html";
			}


		} catch (Exception e) {
			e.printStackTrace();
			resultadoListado = "errorControl.html";

		}

		return resultadoListado;
	}
}

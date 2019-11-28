package filmografia.accion;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import filmografia.cineCatalogo.Pelicula;
import filmografia.dao.PeliculaDAO;

public class ModificarPelicula implements Facade {

	PeliculaDAO peliculaDAO;

	public ModificarPelicula() {
		peliculaDAO = new PeliculaDAO();
	}

	@Override
	public String ejecutar(ServletContext sc, HttpServletRequest request, HttpServletResponse response) {
		// obtenemos parámetros del formulario
		int id = Integer.parseInt(request.getParameter("id"));
		
		String director = request.getParameter("director");
		String titulo = request.getParameter("titulo");
		Pelicula pelicula = null;
		String resultadoListado = null;

		try {
			
			peliculaDAO.modificarPelicula(pelicula);
			if (true) {
				request.setAttribute("id", id);
				request.setAttribute("director", director);
				request.setAttribute("titulo", titulo);
				resultadoListado = "exitoModificaciónBBDD.html";
			} else {
				resultadoListado = "errorControlDatosBBDD.html";
			}
			

		} catch (Exception e) {
			e.printStackTrace();
			resultadoListado = "errorControl.html";

		}
		return resultadoListado;
	
	}
}

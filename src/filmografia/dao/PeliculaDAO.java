package filmografia.dao;

import java.sql.SQLException;
import java.util.List;

import filmografia.cineCatalogo.Pelicula;

public class PeliculaDAO implements DAO {
	/**
	 * Creamos el objeto eliculaConexionServicio que realiza la conexion con la bbdd y sobreescribimos los métodos de la clase
	 * Esta clase implementa la interfaz DAO definida con todos los métodos a los que hace referencia
	 */

	PeliculaConexionServicio peliConexion;
	
	public PeliculaDAO () {
		try {
			peliConexion = new PeliculaConexionServicio ();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Sobreescribimos el método correspondiente de la clase PeliculaConexionServicio
	 * para la obtención del listado de películas 
	 */
	
	@Override
	public List<Pelicula> mostarListadoPeliculas(String director) throws Exception {
		List<Pelicula> peliculas;
		peliculas=peliConexion.mostarListadoPeliculas(director);
		return peliculas;
	}
	
	@Override
	public boolean validar (String usuario, String clave) throws Exception {
		Boolean validation;
		validation = peliConexion.validar(usuario, clave);
		return validation;
	}
	

}

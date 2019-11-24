package filmografia.dao;

import java.sql.SQLException;
import java.util.List;

import filmografia.cineCatalogo.Pelicula;

public class PeliculaDAO implements DAO {
	/**
	 * Creamos el objeto eliculaConexionServicio que realiza la conexion con la bbdd y sobreescribimos los m�todos de la clase
	 * Esta clase implementa la interfaz DAO definida con todos los m�todos a los que hace referencia
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
	 * Sobreescribimos el m�todo correspondiente de la clase PeliculaConexionServicio
	 * para la obtenci�n del listado de pel�culas 
	 */
	
	@Override
	public List<Pelicula> mostarListadoPeliculas(String director) throws Exception {
		List<Pelicula> peliculas;
		peliculas=peliConexion.mostarListadoPeliculas(director);
		return peliculas;
	}
	
}

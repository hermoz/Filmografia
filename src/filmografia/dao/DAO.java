package filmografia.dao;

import java.util.List;

import filmografia.cineCatalogo.Pelicula;

/**
 * Definimos la capa de acceso a datos
 * @author Herminia
 *
 */

public interface DAO {
	/**
	 * 
	 * @param director
	 * @return
	 * @throws Exception
	 */

	public List<Pelicula> mostarListadoPeliculas(String director) throws Exception;
	
}

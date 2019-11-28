package filmografia.dao;

import java.util.List;

import filmografia.cineCatalogo.Pelicula;

/**
 * Definimos la capa de acceso a datos
 * @author Herminia
 *
 */

public interface DAO {

	public List<Pelicula> mostarListadoPeliculas(String director) throws Exception;
	
	public boolean validar (String usuario, String clave) throws Exception;
	
	public List<Pelicula> mostarListadoCompletoPeliculas ()  throws Exception;

	public boolean modificarPelicula(Pelicula pelicula) throws Exception;
	
	public boolean altaPelicula(int id, String director, String titulo) throws Exception;
	
	public boolean eliminarPelicula(int id) throws Exception;

	
}

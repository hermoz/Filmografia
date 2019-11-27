package filmografia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import filmografia.cineCatalogo.LogIn;
import filmografia.cineCatalogo.Pelicula;


public class PeliculaConexionServicio {

	/**
	 * Establecemos conexión con la base de datos creada "cine" y definimos
	 * métodos correspondientes para las acciones
	 * Declaramos los atributos y establecemos la conexión
	 */
	
	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;
	private String query;
	
	public PeliculaConexionServicio () throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cine", "root", "");
	}
	
	/**
	 * Importación de la lista de películas de la base de datos filtrada según director indicado por el usuario
	 * @return 
	 */

	public List<Pelicula> mostarListadoPeliculas(String director) throws Exception {
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		query="select * from pelicula where director = ?";
		pstm = con.prepareStatement(query);
		pstm.setString(1, director);
		rs=pstm.executeQuery();
		while (rs.next()) {
			peliculas.add(new Pelicula (rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4)));
		}
		return peliculas;
	}
	
	public boolean validar (String usuario, String clave) throws Exception {
		boolean status = false;
		try {
			query="select * from login where usuario = ? and clave = ?";
			pstm = con.prepareStatement(query);
			pstm.setString(1, usuario);
			pstm.setString(2, clave);
			rs=pstm.executeQuery();
		} catch (SQLException e){
			e.printStackTrace();
			status = true;
		}
		return status;
	}

	/**
	 * Importamos la lista completa de peliculas de la base de datos para mostrarlas al usuario 
	 * @return
	 * @throws Exception
	 */
	public List<Pelicula> mostarListadoCompletoPeliculas ()  throws Exception {
		ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
		query="select * from pelicula";
		pstm = con.prepareStatement(query);
		rs=pstm.executeQuery();
		while (rs.next()) {
			listaPeliculas.add(new Pelicula (rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4)));
		}
		return listaPeliculas;
	}
	
	
		
	
}
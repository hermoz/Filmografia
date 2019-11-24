package filmografia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import filmografia.cineCatalogo.Pelicula;


public class PeliculaConexionServicio {

	/**
	 * Establecemos conexi�n con la base de datos creada "cine" y definimos
	 * m�todos correspondientes para las acciones
	 * Declaramos los atributos y establecemos la conexi�n
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
	 * Importaci�n de la lista de pel�culas de la base de datos filtrada seg�n director indicado por el usuario
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
		
	
}
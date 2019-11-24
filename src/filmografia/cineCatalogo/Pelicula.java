package filmografia.cineCatalogo;

public class Pelicula {
	/**
	 * Declaramos los atributos correspondientes con los campos
	 * definidos en la base de datos "cine"
	 */
	int id;
	String director;
	String titulo;
	String fechaEstreno;
	
	
	public Pelicula(int id, String director, String titulo, String fechaEstreno) {
		super();
		this.id = id;
		this.director = director;
		this.titulo = titulo;
		this.fechaEstreno = fechaEstreno;
	}
	

	/**
	 * Definimos métodos getter y setters para posteriores accesos a parámetros
	 */
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getFechaEstreno() {
		return fechaEstreno;
	}


	public void setFechaEstreno(String fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	

	
}

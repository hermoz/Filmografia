package filmografia.cineCatalogo;

public class LogIn {
	
	private String usuario;
	private String clave;

	public LogIn(String usuario, String clave) {
		super();
		this.usuario = usuario;
		this.clave = clave;
	}
	
	public String getusuario() {
		return usuario;
	}

	public void setusuario(String usuario) {
		this.usuario = usuario;
	}

	public String getclave() {
		return clave;
	}

	public void setclave(String clave) {
		this.clave = clave;
	}

}

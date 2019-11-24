package filmografia.accion;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import filmografia.dao.PeliculaDAO;

public class ValidacionUsuario implements Facade {

	PeliculaDAO peliculaDAO;

	public ValidacionUsuario() {
		peliculaDAO = new PeliculaDAO();
	}

	@Override
	public String ejecutar(ServletContext sc, HttpServletRequest request, HttpServletResponse response) {
		// obtenemos parámetro del formulario con name"director"
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		
		boolean existeUsuario;
		String resultadoLog = null;
		try {
			 if(existeUsuario=true) {
				 request.setAttribute("usuario", usuario);
				 request.setAttribute("clave", clave);
				 resultadoLog="pantallaUsuarioLog.jsp";
			 } else {
				 resultadoLog="errorUsuarioNoExiste.html";
			 }
		} catch (Exception e){
			e.printStackTrace();
			resultadoLog = "errorControl.html";
		}
		
		return resultadoLog;
	}
}

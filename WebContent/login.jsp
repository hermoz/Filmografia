<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn Usuario</title>
</head>
<body>
<p>Insertar datos</p>
	<!-- Establezco los parámetros para acceder a mi controlador único
		action=controladorUnicoFilm
		value="Comprobar logIn usuario"
	-->
	<div>
		<h4>Formulario Log In usuario</h4>
		<form method="post" action="controladorUnicoFilm">
			<table style="with: 100%">
				<tr>
					<td>Usuario</td>
					<td><input type="text" name="usuario" /></td>
				</tr>
				<tr>
					<td>Clave</td>
					<td><input type="password" name="clave" /></td>
				</tr>

			</table>
			<br> <input value="Comprobar logIn usuario" name="action" style="visibility: hidden;">
			<button type="submit">Log In</button>
		</form>
	</div>
</body>
</html>
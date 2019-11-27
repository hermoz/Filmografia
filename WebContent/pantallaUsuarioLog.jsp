<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn Usuario - Pantalla Principal Usuario</title>
</head>
<body>

	<div
		style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px;">
		<h4>Usuario Correcto - Bienvenido</h4>
		<form method="post" action="controladorUnicoFilm">
			<table style="with: 100%">
				<tr>
					<td>Usuario:${usuario}</td>
				</tr>
				<tr>
					<td>Clave:${clave}</td>
				</tr>
			</table>

		</form>
		<br>

		<form method="post" action="controladorUnicoFilm">
			<input value="Mostrar listado peliculas" name="action"
				style="visibility: hidden;">
			<button type="submit">Mantenimiento de películas</button>
		</form>
		<br> <br>


		<!-- Volver al inicio -->
		<a href="index.html"><input type="button" value="Volver"></input></a><br>
	</div>
</body>
</html>
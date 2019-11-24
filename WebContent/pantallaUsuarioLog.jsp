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
		<h4>Usuario Correcto - Pantalla principal</h4>
		<form method="post" action="controladorUnicoFilm">
			<table style="with: 100%">
				<tr>
					<td>Usuario:${usuario}</td>
				</tr>
				<tr>
					<td>Clave:${clave}</td>
				</tr>
			</table>
			<br>
			<!-- Volver al inicio -->
			<a href="index.html"><input type="button" value="Volver"></input></a><br>
			
		</form>
	</div>
</body>
</html>
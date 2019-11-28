<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>>Consultar director</title>
</head>
<body>
<!-- Llamamos al controlador unico -->
<form method ="post" action="controladorUnicoFilm">
	<p>Datos nuevo a introducir en base de datos:</p>	
	<p>Director: <input type="text" name="director" required placeholder="Introduzca nuevo director"></p>
	<br>
	<br>
	<p>Título: <input type="text" name="titulo" required placeholder="Introduzca nuevo título"></p>	
	<br>
	<br>
	<input value="Modificar Pelicula" name="action" style="visibility: hidden;">    
    <button type="submit">Modificar</button>
</form>
<!-- Volver al inicio -->
<a href="index.html"><input type="button" value="Volver"></input></a><br>
</body>
</html>
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
	<input type="text" name="director" required placeholder="Introduzca nombre director cine">
	<input value="Mostrar listado director" name="action" style="visibility: hidden;">    
    <button type="submit">Consultar</button>
</form>
<!-- Volver al inicio -->
<a href="index.html"><input type="button" value="Volver"></input></a><br>
</body>
</html>
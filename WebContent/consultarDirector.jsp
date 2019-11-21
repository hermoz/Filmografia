<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Indique el DNI del empleado a buscar</title>
</head>
<body>
<!-- Llamamos al controlador unico -->
<form method ="post" action="controladorUnicoFilm">
	<input type="text" name=" " required placeholder="Introduzca nombre director cine">
	<input value="consultar" name="action" style="visibility: hidden;">    
    <button type="submit">Consultar</button>
</form>
<a href="index.html"><input type="button" value="Volver"></input></a><br>
</body>
</html>
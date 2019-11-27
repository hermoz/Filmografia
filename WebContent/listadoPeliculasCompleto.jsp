<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado peliculas</title>
</head>
<body>

	<div>
	
	<!-- Mostramos listado de películas completo de la base de datos -->
		<h5>Listado de películas:</h5>
		<ul>
			<c:forEach items="${listadoPeliculasCompleto}" var="pelicula">
				<li>#${pelicula.id}
				 _ ${pelicula.titulo} 
				 _ ${pelicula.director}		 
				 </li>
			</c:forEach>
		</ul>
	</div>
	<br>
	<!-- Mostramos menu con resto de opciones-->	
	<div>
	<p>Posibles opciones a realizar:<p>

	<br>
	<br>
	<!-- Volver al inicio -->
		<a href="index.html"><button>Inicio</button> </a>
	</div>

</body>
</html>
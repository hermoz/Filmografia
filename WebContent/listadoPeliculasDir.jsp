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
	<style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">
	<!-- Mostramos listado de películas de director solicitado -->
		<h5>Director: ${director}</h5>
		<p>Lista de Películas:</p>
		<ul>
			<c:forEach items="${listadoPeliculasDirector}" var="peliculaD">
				<li>#${peliculaD.id}
				 _ ${peliculaD.titulo} 
				 _ ${peliculaD.director}		 
				 </li>
			</c:forEach>
		</ul>
	</div>
	<br>
	<!-- Mostramos menu con resto de opciones-->	
	<div>
	<p>Otras acciones:<p>
	<!-- Realizar otra consulta -->
	<a href="consultarDirector.jsp"><button>Realizar otra
			consulta</button></a>
	<br>
	<br>
	<!-- Volver al inicio -->
		<a href="index.html"><button>Inicio</button> </a>
	</div>

</body>
</html>
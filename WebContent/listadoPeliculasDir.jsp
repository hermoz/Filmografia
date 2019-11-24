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
	<!-- Mostramos listado de películas de director solicitado -->
		<h5>Director: ${director}</h5>
		<p>Lista de Peliculas:</p>
		<ul>
			<c:forEach items="${listadoPeliculasDirector}" var="peliculaD">
				<li>${peliculaD. id}// ${peliculaD.titulo} //
					${peliculaD.fecha}</li>
			</c:forEach>
		</ul>
	</div>
	<br>
	<!-- Mostramos menu con resto de opciones-->	
	<div>
	<p>Otras acciones<p>
	<!-- Realizar otra consulta -->
	<p>Pulse aquí si desea realizar otra consulta</p>
	<a href="consultarDirector.jsp"><button>Realizar otra
			consulta</button></a>
	<br>
	<!-- Volver al inicio -->
		<a href="index.html"><button>Inicio</button> </a>
	</div>

</body>
</html>
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
				<li>#${pelicula.id} _ ${pelicula.titulo} _ ${pelicula.director}
				</li>
			</c:forEach>
		</ul>
	</div>
	<br>
	<!-- Mostramos menu con resto de opciones-->
	<div>
		<p>Posibles opciones a realizar:
		<p>
			<!-- Dar de alta una película -->
		<form method="post" action="controladorUnicoFilm">
			<input value="Alta Pelicula" name="action"
				style="visibility: hidden;">
			<button type="submit">Dar de alta nueva película</button>
		</form>
		<br>

		<!-- Acción que nos lleva al jsp para la introduccion de datos y obtencion de parametros  -->
		<form method="post" action="modificarPelicula.jsp" >
			<input type="text" name="id" required placeholder="Introduzca id de película a modificar">
			<input type="submit" value="Modificar película"></input>
		</form>
		<br>

		<!-- Eliminar película existente -->
		<form method="post" action="controladorUnicoFilm">
		<input type="text" name="id" required placeholder="Introduzca id de película a eliminar">
			<input value="Eliminar Pelicula" name="action"
				style="visibility: hidden;">
			<button type="submit">Eliminar película</button>
		</form>
		<br>


		<!-- Volver al inicio -->
		<a href="index.html"><button>Inicio</button> </a>
	</div>

</body>
</html>
<!DOCTYPE html>
<%@page import="java.net.URLEncoder"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Creacion de la cookie</title>
	</head>
	<body>
		<%
			//Leo el valor del parametro enviado en la peticion.
			String destinoIngresado = request.getParameter("destino");
			//Genero la cookie
			Cookie cookie = new Cookie("destino.turistico", URLEncoder.encode(destinoIngresado, "UTF-8"));
			//Tiempo de vida de la cookie
			cookie.setMaxAge(365*24*60*60);
			//Enviar cookie generada al cliente
			response.addCookie(cookie);
		%>
		
		<h3>Gracias por compartir su destino con nosotros!</h3>
		<br>
		<a href="leerCookie.jsp">Ver resultados</a>
		<a href="eliminarCookie.jsp">Eliminar cookie</a>
	</body>
</html>
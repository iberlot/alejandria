<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Eliminando cookie</title>
	
	<%
	
		Cookie [] cookies = request.getCookies();
	
		if(cookies !=null)
		{
			//Recorremos cookies/luego eliminar la deseada
			for(Cookie cookie : cookies) {					
				//Mostrar todas las cookies
				out.println("Nombre de la cookie: " + cookie.getName() + "<br/>");
				out.println("Valor de la cookie: " + cookie.getValue() + "<br/>");	
				
				//Buscamos la clave requerida y luego eliminamos
				if(cookie.getName().equals("destino.turistico")){
					out.println("Elimimando cookie: " + cookie.getName() + "<br/>");	
					cookie.setMaxAge(0); //Setea la eliminación de la cookie
					response.addCookie(cookie); //Recordar enviar la respuesta al browser...
				}								
			}
		}
		else
		{			
			out.println("<h3>No se han encontrado cookies!</h3>");				
		}	
	%>	
	
</head>
<body>
	<a href="inicioCookie.html">Volver al inicio</a>
</body>
</html>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Lectura de la cookie</title>
		<%
			String destinoLeido = "";
			//Leemos las cookies del header del request
			Cookie[] cookies = request.getCookies();
			//Buscamos la cookie que necesitamos
			if(cookies != null) {
				for(Cookie cookie : cookies) {
					if(cookie.getName().equals("destino.turistico")){
						destinoLeido = cookie.getValue();
						break;
					}
				}
			}
		%>
	</head>
	<body>
		<h1 style="text-align: center;">Lectura de la cookie</h1>
		<div style="border: solid;">
			<h4>Vuelos para <%= destinoLeido %></h4>
			<ul>
				<%
					for(int i = 0; i < 5; i++) {
						out.println("<li> Vuelo numero " + (i+1) + "</li>");
					}
				%>
			</ul>
		</div>
	</body>
</html>
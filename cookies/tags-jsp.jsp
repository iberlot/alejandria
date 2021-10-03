<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
	String[] nombres = { "Gaston", "Matias", "Ruben" };
	pageContext.setAttribute("arrNombres", nombres);
%>
<title>Usando JSTL</title>
<c:set var="precio" scope="page" value="${7000 * 2}" />
</head>
<body>		
	<c:if test="${precio > 15000}">
		<h2>Tag IF de Core JSTL - IF False</h2>
		<div style="border-style: double;">			
			<%
				for (String str : nombres) {
					out.println(str);
			}
			%>			
		</div>
	</c:if>

	<c:if test="${precio < 20000}">
		<h2>Tag IF de Core JSTL - IF True</h2>	
		
		<table border="1">	
			<tr>
				<th>NOMBRE</th>
			</tr>
			<c:forEach var="item" items="${arrNombres}">	
				<tr>
					<td>${item}</td>
				</tr>
		    </c:forEach>	
	    </table>		
	</c:if>	
</body>
</html>
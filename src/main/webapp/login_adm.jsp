<jsp:include page="/WEB-INF/common/header.jsp"></jsp:include>

<div class="container">
	<form method="post" action="servletLogin">
		<%
		if (request.getSession().getAttribute("Error") != null) {
		%>
		<div class="alert alert-danger" role="alert">
			<label name="lblError"><%=request.getSession().getAttribute("Error")%></label>
		</div>
		<%
		} 
		%>
		<label>Documento: <input id="documento" name="documento" type="number" placeholder="Documento" required></label> <label>Password: <input id="password" name="password" type="password" placeholder="Password" required></label>
		<input id="admin" name="admin" type="hidden" value="true">
		<button type="submit" class="btn btn-primary">Aceptar</button>
	</form>
</div>

<jsp:include page="/WEB-INF/common/footer.html"></jsp:include>
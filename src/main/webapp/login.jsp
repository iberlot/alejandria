<jsp:include page="/WEB-INF/common/header.jsp"></jsp:include>

<div class="container">
	<form method="post" action="servletLogin">
		<label name="lblError"><%=request.getSession().getAttribute("Error")!=null?request.getSession().getAttribute("Error"):""%></label>
	
		<label>Documento: <input id="documento" type="text" placeholder="Documento" required></label> 
		<label>Password: <input id="password" type="password" placeholder="Password" required></label>
		
		<button type="submit" class="btn btn-primary">Aceptar</button>
	</form>
</div>

<jsp:include page="/WEB-INF/common/footer.html"></jsp:include>
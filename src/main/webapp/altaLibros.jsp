<%@page import="java.util.ArrayList"%>
<%@page import="negocio.dao.iDAO"%>
<%@page import="negocio.dao.factory.AutoresFactory"%>
<%@page import="negocio.dao.factory.LibrosFactory"%>
<%@page import="negocio.dominio.Autores"%>
<%@page import="negocio.dominio.Libros"%>

<%
iDAO<Autores> autoDAO = AutoresFactory.getImplementation("BD");
ArrayList<Autores> autores = autoDAO.getLista();


iDAO<Libros> librosDAO = LibrosFactory.getImplementation("BD");
// ArrayList<String> generos = librosDAO.getListaGeneros();
%>

<jsp:include page="/WEB-INF/common/header.jsp"></jsp:include>


<form method="post" action="LibrosController">
	<div class="form-group">
		<label for="exampleFormControlInput1">ISBN <input type="text" class="form-control" name="isbn" placeholder="ISBN" required></label>
	</div>
	<div class="form-group">
		<label for="exampleFormControlInput1">Titulo <input type="text" class="form-control" name="titulo" placeholder="Titulo del libro" required></label>
	</div>
	<div class="form-group">
		<label for="exampleFormControlInput1">Paginas <input type="number" class="form-control" name="paginas" required></label>
	</div>
	<div class="form-group">
		<label for="exampleFormControlInput1">Autor <Br />
		 <select class="custom-select" name="autor" required>
				<option value="">Seleccione un autor</option>
				<%
				for (Autores autor : autores) {
				%>
				<option value="<%=autor.getId()%>"><%=autor.getApellido() + ", " + autor.getNombre()%></option>
				<%
				}
				%>
		</select> 
	</label>
	</div>
	
	<input id="accion" name="accion" type="hidden" value="alta">

	<div class="form-group">
		<button class="btn btn-primary" type="submit">Crear usuario</button>
	</div>


</form>
<jsp:include page="/WEB-INF/common/footer.html"></jsp:include>
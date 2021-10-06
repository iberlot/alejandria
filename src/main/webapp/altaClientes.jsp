<jsp:include page="/WEB-INF/common/header.jsp"></jsp:include>

<form method="post" action="UsuariosController">
	<div class="form-group">
		<label for="exampleFormControlInput1">DNI <input type="number" class="form-control" name="dni" placeholder="DNI" required></label>
	</div>
	<div class="form-group">
		<label for="exampleFormControlInput1">Nombre <input type="text" class="form-control" name="nombre" placeholder="Nombre" required></label>
	</div>
	<div class="form-group">
		<label for="exampleFormControlInput1">Apellido <input type="text" class="form-control" name="apellido" placeholder="apellido" required></label>
	</div>
	<div class="form-group">
		<label for="exampleFormControlInput1">eMAil <input type="email" class="form-control" name="email" placeholder="email" required></label>
	</div>
	<div class="form-group">
		<label for="exampleFormControlInput1">Telefono <input type="number" class="form-control" name="telefono" placeholder="" required></label>
	</div>
	<div class="form-group">
		<label for="exampleFormControlInput1">Password <input type="password" class="form-control" name="password" placeholder="password" required></label>
	</div>
	
	<input id="accion" name="accion" type="hidden" value="alta">
		
	<div class="form-group">
		<button class="btn btn-primary" type="submit">Crear usuario</button>
	</div>


</form>
<jsp:include page="/WEB-INF/common/footer.html"></jsp:include>
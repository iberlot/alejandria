package negocio.dao.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import core.Conexion;
import negocio.dao.iDAO;
import negocio.dominio.Editoriales;
import negocio.dominio.Libros;

public class LibrosImpl implements iDAO<Libros> {

	/*
	 * public Usuario buscarUsuarioID(int id) { Connection con = null;
	 * PreparedStatement prep = null; Usuario us = null; try { con =
	 * Conexion.getConnection(); prep =
	 * con.prepareStatement("SELECT * from Usuarios where idUsuario=" + id);
	 * ResultSet rs = prep.executeQuery(); if(rs.next()) { int idUsuario =
	 * rs.getInt(1); String clave = rs.getString(2); String nombreUsuario =
	 * rs.getString(3); String perfil = rs.getString(4); us = new Usuario(idUsuario,
	 * clave, nombreUsuario, perfil); } prep.close(); return us; } catch(Exception
	 * e) { e.printStackTrace(); return null; } }
	 * 
	 * /* public Usuario buscarUsuarioID(int id) { Connection con = null;
	 * CallableStatement call = null; Usuario us = null; try { con =
	 * Conexion.getConnection(); call =
	 * con.prepareCall("{call buscarUsuarioID(?) }"); call.setInt(1, id);
	 * 
	 * ResultSet rs = call.executeQuery(); if(rs.next()) { int idUsuario =
	 * rs.getInt(1); String clave = rs.getString(2); String nombreUsuario =
	 * rs.getString(3); String perfil = rs.getString(4); us = new Usuario(idUsuario,
	 * clave, nombreUsuario, perfil); }
	 * 
	 * return us; } catch(Exception e) { return null; } }
	 */
	public int obtenerUltId() {
		Connection con = null;
		PreparedStatement prep = null;
		try {
			con = Conexion.getConnection();
			prep = con.prepareStatement("SELECT TOP (1) * from Usuarios order by idUsuario desc");
			ResultSet rs = prep.executeQuery();
			int ultId = 0;
			if (rs.next()) {
				ultId = rs.getInt(1);
			}
			prep.close();
			return ultId;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public ArrayList<String> getListaGeneros() {

		ArrayList<String> generos = new ArrayList<>();

		Connection con = null;
		PreparedStatement prep = null;

		try {
			con = Conexion.getConnection();
			prep = con.prepareStatement("SELECT * FROM generos");

			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				generos.add(rs.getString("genero"));
			}
			prep.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return generos;
	}

	@Override
	public boolean add(Libros elemento) {

		String sql = "INSERT INTO libros(isbn, titulo, paginas, genero, edicion, autor) VALUES (?,?,?,(SELECT id FROM generos WHERE genero = ?),?,?)";

		String sql2 = "INSERT INTO libros_editorial(isbn, editorial, stock) VALUES (?,?,0)";

		try {
			Connection con = Conexion.getConnection();

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, elemento.getIsbn());
			ps.setString(2, elemento.getTitulo());
			ps.setInt(3, elemento.getPaginas());
			ps.setString(4, elemento.getGenero());
			ps.setString(5, elemento.getEdicion());
			ps.setInt(6, elemento.getAutor().getId());

			ps.execute();

			for (Editoriales editorial : elemento.getEditoriales()) {
				PreparedStatement ps2 = con.prepareStatement(sql2);

				ps2.setString(1, elemento.getIsbn());
				ps2.setInt(2, editorial.getId());

				ps2.execute();

				ps2.close();
			}

			ps.close();

			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Object get(Object elemento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Libros> getLista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libros findId(long id) {

		Connection con = null;
		PreparedStatement prep = null;

		try {
			String sql = "SELECT * FROM personas INNER JOIN clientes ON clientes.dni = personas.dni WHERE personas.dni="
					+ id;

			con = Conexion.getConnection();
			prep = con.prepareStatement(sql);

			ResultSet rs = prep.executeQuery();

			Libros libro = new Libros();

			if (rs.next()) {

//				cliente.setDni(rs.getLong("dni"));
//				cliente.setApellido(rs.getString("apellido"));
//				cliente.setNombre(rs.getString("nombre"));
//				cliente.setEmail(rs.getString("email"));
//				cliente.setTelefono(rs.getLong("telefono"));
//				cliente.setPassword(rs.getString("password"));

			}
			return libro;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

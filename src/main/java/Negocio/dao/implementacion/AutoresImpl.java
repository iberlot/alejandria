package negocio.dao.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import core.Conexion;
import negocio.dao.iDAO;
import negocio.dominio.Autores;

public class AutoresImpl implements iDAO<Autores> {

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

	/*
	 * public int obtenerUltId() { Connection con = null; CallableStatement call =
	 * null; try { con = Conexion.getConnection(); call =
	 * con.prepareCall("{call buscarId() }");
	 * 
	 * call.registerOutParameter(1, java.sql.Types.INTEGER); call.execute();
	 * 
	 * int ultID = call.getInt(1); call.close(); return ultID; } catch(Exception e)
	 * { return 0; } }
	 *
	 * public void updateUsuario(Usuario u) { Connection con = null;
	 * PreparedStatement ps = null; try { IOGeneral io = new IOGeneral(); con =
	 * Conexion.getConnection(); ps = con.
	 * prepareStatement("UPDATE Usuarios SET clave=?, nombreUsuario=? WHERE idUsuario=?"
	 * ); ps.setString(1, u.getClave()); ps.setString(2, u.getNombreUsuario());
	 * ps.setInt(3, u.getIdUsuario()); ps.executeUpdate(); ps.close(); }
	 * catch(Exception e) { e.printStackTrace(); return; } }
	 * 
	 * public Usuario buscarUsuario(String nombreUsuario, String clave) { Connection
	 * con = null; Statement stm = null; try { Usuario us = null; con =
	 * Conexion.getConnection(); stm = con.createStatement(); ResultSet rs =
	 * stm.executeQuery("SELECT * FROM Usuarios WHERE nombreUsuario = '"+
	 * nombreUsuario + "' AND clave ='" + clave + "'"); if(rs.next() == true) { int
	 * idUsuario = rs.getInt(1); String perfil = rs.getString(4); us = new
	 * Usuario(idUsuario, clave, nombreUsuario, perfil); stm.close(); //Recordar
	 * cerrar la query una vez finalizada la consulta } return us; } catch(Exception
	 * e) { e.printStackTrace(); return null; } }
	 * 
	 * public void agregarUsuario(String nombreUsuario, String clave, int id) {
	 * Connection con = null; PreparedStatement ps = null; try { IOGeneral io = new
	 * IOGeneral(); con = Conexion.getConnection(); ps =
	 * con.prepareStatement("insert into Usuarios values(?,?,?,?)"); ps.setInt(1,
	 * id); ps.setString(2, clave); ps.setString(3, nombreUsuario); ps.setString(4,
	 * "Chofer"); ps.execute();
	 * 
	 * ps.close(); } catch(Exception e) { e.printStackTrace(); return; } }
	 * 
	 * @Override public void eliminarUsuario(int id) throws Exception { Connection
	 * con = null; PreparedStatement ps = null; con = Conexion.getConnection(); ps =
	 * con.prepareStatement("DELETE FROM Usuarios WHERE idUsuario = " + id);
	 * ps.execute(); ps.close(); }
	 */
	@Override
	public boolean add(Autores elemento) {

		String sql = "INSERT INTO libros(isbn, titulo, paginas, genero, edicion, autor) VALUES (?,?,?,?,?,?)";

		String sql2 = "INSERT INTO libros_editorial(isbn, editorial, stock) VALUES (?,?,0)";

		try {
			Connection con = Conexion.getConnection();

			PreparedStatement ps = con.prepareStatement(sql);
//
//			ps.setString(1, elemento.getIsbn());
//			ps.setString(2, elemento.getTitulo());
//			ps.setInt(3, elemento.getPaginas());
//			ps.setString(4, elemento.getGenero());
//			ps.setString(5, elemento.getEdicion());
//			ps.setInt(6, elemento.getAutor().getId());
//
//			ps.execute();
//
//			for (Editoriales editorial : elemento.getEditoriales()) {
//				PreparedStatement ps2 = con.prepareStatement(sql2);
//
//				ps2.setString(1, elemento.getIsbn());
//				ps2.setInt(2, editorial.getId());
//
//				ps2.execute();
//
//				ps2.close();
//			}

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
	public ArrayList<Autores> getLista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autores findId(long id) {

		Connection con = null;
		PreparedStatement prep = null;

		try {
			String sql = "SELECT * FROM autores WHERE id=?";

			con = Conexion.getConnection();
			prep = con.prepareStatement(sql);

			prep.setInt(1, (int) id);

			ResultSet rs = prep.executeQuery();

			Autores autor = new Autores();

			if (rs.next()) {

				autor.setId(rs.getInt("id"));
				autor.setApellido(rs.getString("apellido"));
				autor.setNombre(rs.getString("nombre"));
				autor.setNacionalidad(rs.getString("nacional"));

			}
			return autor;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

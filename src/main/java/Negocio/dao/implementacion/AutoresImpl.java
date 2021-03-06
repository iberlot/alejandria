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

	public int obtenerUltId() {
		Connection con = null;
		PreparedStatement prep = null;
		try {
			con = Conexion.getConnection();
			prep = con.prepareStatement("SELECT MAX(id) FROM autores");
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

	@Override
	public boolean add(Autores elemento) {

		String sql = "INSERT INTO autores(nombre, apellido, nacional) VALUES (?,?,(SELECT id_gentilicio FROM gentilicio WHERE gentilicio = ?))";

		try {
			Connection con = Conexion.getConnection();

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, elemento.getNombre());
			ps.setString(2, elemento.getApellido());
			ps.setString(3, elemento.getNacionalidad());

			ps.execute();

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

		ArrayList<Autores> autores = new ArrayList<>();

		Connection con = null;
		PreparedStatement prep = null;

		try {
			con = Conexion.getConnection();
			prep = con.prepareStatement(
					"SELECT autores.id AS id, autores.nombre AS nombre, autores.apellido AS apellido, gentilicio.gentilicio AS nacionalidad FROM autores INNER JOIN gentilicio ON gentilicio.id_gentilicio = autores.nacional");

			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Autores autor = new Autores();

				autor.setApellido(rs.getString("apellido"));
				autor.setNacionalidad(rs.getString("nacionalidad"));
				autor.setId(rs.getInt("id"));
				autor.setNombre(rs.getString("nombre"));

				autores.add(autor);
			}
			prep.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return autores;
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

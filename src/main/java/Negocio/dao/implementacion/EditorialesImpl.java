package negocio.dao.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import core.Conexion;
import negocio.dao.iDAO;
import negocio.dominio.Editoriales;

public class EditorialesImpl implements iDAO<Editoriales> {

	public int obtenerUltId() {
		Connection con = null;
		PreparedStatement prep = null;
		try {
			con = Conexion.getConnection();
			prep = con.prepareStatement("SELECT MAX(id) FROM editoriales");
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
	public boolean add(Editoriales elemento) {

		String sql = "INSERT INTO editoriales(id, nombre, direccion, web, email, telefono) VALUES (?,?,?,?,?,?)";

		try {
			Connection con = Conexion.getConnection();

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, elemento.getId());
			ps.setString(2, elemento.getNombre());
			ps.setString(3, elemento.getDireccion());
			ps.setString(4, elemento.getWeb());
			ps.setString(5, elemento.getEmail());
			ps.setLong(6, elemento.getTelefono());

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
	public ArrayList<Editoriales> getLista() {

		ArrayList<Editoriales> editoriales = new ArrayList<>();

		Connection con = null;
		PreparedStatement prep = null;

		try {
			con = Conexion.getConnection();
			prep = con.prepareStatement("SELECT * FROM editoriales");

			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Editoriales editorial = new Editoriales();

				editorial.setDireccion(rs.getString("direccion"));
				editorial.setEmail(rs.getString("email"));
				editorial.setId(rs.getInt("id"));
				editorial.setNombre(rs.getString("nombre"));
				editorial.setTelefono(rs.getLong("telefono"));
				editorial.setWeb(rs.getString("web"));

				editoriales.add(editorial);
			}
			prep.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return editoriales;
	}

	@Override
	public Editoriales findId(long id) {

		Connection con = null;
		PreparedStatement prep = null;

		try {
			String sql = "SELECT * FROM editoriales WHERE id = ?";

			con = Conexion.getConnection();
			prep = con.prepareStatement(sql);
			prep.setInt(1, (int) id);

			ResultSet rs = prep.executeQuery();

			Editoriales editorial = new Editoriales();

			if (rs.next()) {

				editorial.setId(rs.getInt("id"));
				editorial.setDireccion(rs.getString("direccion"));
				editorial.setEmail(rs.getString("email"));
				editorial.setNombre(rs.getString("nombre"));
				editorial.setTelefono(rs.getLong("telefono"));
				editorial.setWeb(rs.getString("web"));
			}

			return editorial;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

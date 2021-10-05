package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import util.PropertiesUtil;

public class Conexion {

	public static Connection getConnection() {

		Connection connection = null;

		try {
			Class.forName(PropertiesUtil.getPropertyDriver());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(PropertiesUtil.getPropertyUrl(),PropertiesUtil.getPropertyUsername(), PropertiesUtil.getPropertyPassword() );
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return connection;
	}
}

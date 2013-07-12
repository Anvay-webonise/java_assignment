package com.webonise.entrapp.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionHelper {

	public ConnectionHelper() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public Connection getConnection() {
		Connection connection = null;
		try {
			connection = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test_java", "webonise", "");
		} catch (SQLException e) {

		}
		return connection;
	}
}
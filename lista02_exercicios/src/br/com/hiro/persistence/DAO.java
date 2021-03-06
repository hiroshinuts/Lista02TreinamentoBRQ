package br.com.hiro.persistence;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAO {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/lista02";
	private static final String USER = "root";
	private static final String PASSWORD = "rhtrht";

	protected Connection con;
	protected PreparedStatement stmt;
	protected CallableStatement call;
	protected ResultSet rs;

	protected void openConnection() throws Exception {

		Class.forName(DRIVER);
		con = DriverManager.getConnection(URL, USER, PASSWORD);

	}

	protected void closeConnectio() throws Exception {

		if (con != null) {
			con.close();
		}
	}

}

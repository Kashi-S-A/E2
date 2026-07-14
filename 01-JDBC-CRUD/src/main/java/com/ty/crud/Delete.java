package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/demodb";
		String user = "postgres";
		String pwd = "root";
		String driver = "org.postgresql.Driver";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, user, pwd);

			Statement stm = con.createStatement();

			String q = "DELETE FROM student WHERE sid=102";

			stm.execute(q);

			con.close();

			System.out.println("data deleted and connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/demodb";
		String username = "postgres";
		String password = "root";

		try {
			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection(url, username, password);

			Statement stm = con.createStatement();

			String query = "update student set phone=1234567890 where sid=102";

			stm.execute(query);

			con.close();

			System.out.println("record updated and connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

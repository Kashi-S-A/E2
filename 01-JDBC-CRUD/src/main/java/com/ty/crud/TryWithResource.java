package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResource {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/dem";
		String username = "postgres";
		String password = "root";

		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection con = DriverManager.getConnection(url, username, password);) {
			System.out.println("connection is created");

			Statement stm = con.createStatement();
			System.out.println("statement created");

			String query = "update set name='Pengi' where phone=1234567890";

			int res = stm.executeUpdate(query);
			System.out.println("record updated and ");

			System.out.println("rows affected : " + res);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

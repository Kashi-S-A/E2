package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Save {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/demodb";
		String username = "postgres";
		String password = "root";

		try {
			// step 1 : Load the driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded ");

			// step 2 : Establish the connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is created");

			// step 3 : Create a Statement
			Statement stm = con.createStatement();
			System.out.println("statement is created");

			String query = "insert into student values(104,'Pengi','pengi@gmail.com',45678765)";

			// step 4 : Execute the query
			stm.execute(query);
			System.out.println("Record saved");

			// step 5 : Close the connection
			con.close();
			System.out.println("Connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}

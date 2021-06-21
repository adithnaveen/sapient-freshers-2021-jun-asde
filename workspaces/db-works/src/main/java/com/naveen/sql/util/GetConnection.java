package com.naveen.sql.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 

public class GetConnection {

	public static  Connection connection = null; 
	public PreparedStatement ps, ps1, ps2; 
	public ResultSet rs, rs1, rs2; 
	
	public static Connection getPostGressConn() {
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "kanchan");
			return connection; 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; 
	}
 
}

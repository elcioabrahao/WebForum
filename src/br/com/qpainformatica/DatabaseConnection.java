package br.com.qpainformatica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static Connection conn;
	
	public static Connection getConnection(){
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	 
		try {
			// local
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webforum","forum", "forum123");
			// Integrator
			//conn = DriverManager.getConnection("jdbc:mysql://localhost/webforum","forum", "forum123");
	 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return conn;
	}
	

}

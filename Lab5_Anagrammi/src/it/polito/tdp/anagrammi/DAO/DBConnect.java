package it.polito.tdp.anagrammi.DAO;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;


public class DBConnect {

		public static Connection getConnection() {
		Connection conn;
		try{	
			String jdbcURL= "jdbc:mysql://127.0.0.1:3306/dizionario?user=root&password=root&autoReconnect=true&useSSL=false";
			
			 conn =DriverManager.getConnection(jdbcURL);
		}catch (SQLException e) {e.printStackTrace();return null;};

		return conn;
		}
	}

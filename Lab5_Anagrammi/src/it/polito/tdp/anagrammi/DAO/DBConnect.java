package it.polito.tdp.anagrammi.DAO;


	import java.sql.Connection;
	
	import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;


public class DBConnect {
	
	

private static HikariDataSource ds = null;

		public static Connection getConnection() {
			
		
		Connection conn;
			
			String jdbcURL= "jdbc:mysql://127.0.0.1:3306/dizionario";
			try {
	 if (ds==null) {
		ds= new HikariDataSource();
		ds.setJdbcUrl(jdbcURL);
		ds.setUsername("root");
		ds.setPassword("root");
		 }
	conn= ds.getConnection();
	 return conn;
	 
			}
			catch(SQLException se) {return null;}
		
		}
}



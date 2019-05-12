package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AnagrammaDAO {

	public boolean isCorrect(String anagramma){

		String sql = 
				"SELECT nome " +
				"FROM parola " +
				"WHERE nome=?" ;
		
		String jdbcURL = "jdbc:mysql://localhost/dizionario?user=root&password=root" ;
		boolean result;
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL) ;
			
			PreparedStatement st = conn.prepareStatement(sql) ;
			
			st.setString(1, anagramma);
			
			ResultSet res = st.executeQuery() ;
			
			if(res.next()) {
				result = true;
				
			} else {
				result = false;
			}
			
			conn.close();
			return result ;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false ;
		}
	}
}

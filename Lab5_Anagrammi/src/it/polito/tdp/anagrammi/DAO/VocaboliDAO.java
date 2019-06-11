package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class VocaboliDAO {
	public boolean parolaPresente(String parola) {
boolean ritorno=false;
		try {
	
	Connection conn= DBConnect.getConnection();
	String sql="SELECT COUNT(*) FROM parola WHERE nome=?";
	PreparedStatement st= conn.prepareStatement(sql);
	st.setString(1, parola);
	ResultSet rs = st.executeQuery();
	rs.next();
	if (rs.getInt(1)==0) {ritorno=false;}
	else {ritorno=true;}
	conn.close();
	
	
	}catch (SQLException se) {}
	return ritorno;
	
}
}

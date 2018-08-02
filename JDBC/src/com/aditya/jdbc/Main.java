package com.aditya.jdbc;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		String driver = "org.apache.derby.jdbc.ClientDriver";
		String url = "jdbc:derby://localhost:1527/sample";
		String user = "user";
		String pass = "user";
		
		try(Connection con = ConnectionUtil.getConnection(driver, url, user, pass)){
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select count(*) from city");
			if(rs.next()){
				System.out.println("Found records = "+rs.getInt(1));
			
			}
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		
		
	}

}

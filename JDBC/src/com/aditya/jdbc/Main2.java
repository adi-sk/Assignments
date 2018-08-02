package com.aditya.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {

	public static void main(String[] args) {
		
		String driver = "org.apache.derby.jdbc.ClientDriver";
		
		String url = "jdbc:derby://localhost:1527/sample";
		String user = "user";
		String pass = "user";
		
		try(Connection con = ConnectionUtil.getConnection(driver, url, user, pass)){
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from city");
			while(rs.next()){
				City city = convertResultSet(rs);
				System.out.println("name:"+ city.getName()+"    ||   Population="+city.getPopulation());
			
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		

	}
	
	public static City convertResultSet(ResultSet rs) throws SQLException{
		long id = rs.getLong("id");
		String name = rs.getString("name");
		String countryCode = rs.getString("countryCode");
		String district = rs.getString("district");
		long population = rs.getLong("population");
		
		return new City(id, name, countryCode, district, population);
		
	}
	
	

}

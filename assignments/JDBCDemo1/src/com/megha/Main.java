package com.megha;

import java.sql.*;
import java.sql.Statement;

public class Main {
	private static final String SQL_SELECT="Select id,name,countryCode,district,population from city";

	public static void main(String[] args) {
		String driver="org.apache.derby.jdbc.ClientDriver";
		String url="jdbc:derby://localhost:1527/sample;create=true";
		String user="user";
		String pass="pass";
		try(Connection con=ConnectionUtil.getConnection(driver, url, user, pass))
				{
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(SQL_SELECT);
					while(rs.next()){
						City city=convertResults(rs);
						System.out.println("Name:"+city.getName()+"population "+city.getPopulation());
					}
				}catch(Exception ex){
					ex.printStackTrace();
				}

	}
	private static  City convertResults(ResultSet rs)throws SQLException{
		long id=rs.getLong("id");
        String name=rs.getString("name");
        String countryCode=rs.getString("countryCode");
        String district=rs.getString("district");
        long population=rs.getLong("population");
        City city=new City(id,name,countryCode,district,population);		
		return city;
		
	}

}

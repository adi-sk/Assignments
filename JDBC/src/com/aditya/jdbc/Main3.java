package com.aditya.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {

	public static void main(String[] args) {
		
		String driver = "org.apache.derby.jdbc.ClientDriver";
		String url = "jdbc:derby://localhost:1527/sample";
		String user = "user";
		String pass = "user";
		
		try(Connection con = ConnectionUtil.getConnection(driver, url, user, pass)){
			con.setAutoCommit(false);
			
			Statement st = con.createStatement();
			
			
			/*st.execute("CREATE TABLE emp2(empid int primary key,ename varchar(20),desg varchar(20))");
			st.close();
			*/
			//PRepared statements with positional parameters(max 9)
			PreparedStatement ps = con.prepareStatement("INSERT into emp2 VALUES(?,?,?)");
			
			ps.setInt(1, 101);
			ps.setString(2, "Aditya");
			ps.setString(3, "Development");
			
			
			int rows = ps.executeUpdate();
			System.out.println("Record added : "+ rows);
			
			ps.close();

			readEmp(st);
			
			deleteEmp(st);
				
			//con.commit();
			
			readEmp(st);
			
			
			
			
			/*if(rs.next()){
				System.out.println("Found records = "+rs.getInt(1));
			
			}*/
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}

	}
	
	
	private static void readEmp(Statement st)throws SQLException{
		ResultSet rs = st.executeQuery("select * from emp2");
		while(rs.next()){
			System.out.println("Record Found");
			System.out.println(rs.getString("ename"));
		}
	}
	
	private static void deleteEmp(Statement st)throws SQLException{
		int rows = st.executeUpdate("delete from emp2");
		System.out.println("Record Deleted :" + rows);
	}
	

}

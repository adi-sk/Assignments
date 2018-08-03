package com.megha;

import java.sql.*;

public class Main3 {

	public static void main(String[] args) {
		String driver = "org.apache.derby.jdbc.ClientDriver";
		String url = "jdbc:derby://localhost:1527/sample";
		String user = "user";
		String pass ="pass";
		try(Connection con = ConnectionUtil.getConnection(driver, url, user, pass)){
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			System.out.println("before delete: ");
			readEmp(st);
			deleteEmp(st);
			System.out.println("after delete: ");
			readEmp(st);
			con.rollback();
			System.out.println("after rollback: ");
			readEmp(st);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	
		
	

	}

	private static void deleteEmp(Statement st)throws SQLException {
		int rows=st.executeUpdate("delete from emp2");
		System.out.println("rows deleted:"+rows);
		
	}

	private static void readEmp(Statement st)throws SQLException{
		ResultSet rs=st.executeQuery("select * from emp2");
		while(rs.next()){
			System.out.println("Record found: ");
			System.out.println("ename "+rs.getString("ename"));
		}
	}
}

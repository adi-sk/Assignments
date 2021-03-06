package com.zycusBank.aditya;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;



public class CustomerDAO implements CommonDAO<Customer> {
	
	private static final String SQL_SELECT="select firstName,lastName,title,age,dob from customerBank";
	private static final String SQL_INSERT="insert into customerBank(firstName,lastName,title,age,dob) values(?,?,?,?,?)";

	@Override
	public void create(Customer customer) {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_INSERT);
			ps.setString(1, customer.getFirstName());
			ps.setString(2, customer.getLastName());
			ps.setString(3, customer.getTitle());
			ps.setInt(4, customer.getAge());
			ps.setDate(5, customer.getDob());
			ps.executeUpdate();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new LinkedList<>();
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_SELECT);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Customer customer = new Customer();
				
				customer.setFirstName(rs.getString(1));
				customer.setLastName(rs.getString(2));
				customer.setTitle(rs.getString(3));
				customer.setAge(rs.getInt(4));
				customer.setDob(rs.getDate(5));
				
				customers.add(customer);
			}
			
			return customers;
			
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public Customer findByName(String name) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement("select firstName,lastName,title,age,dob from customerBank where firstName = ? ");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			Customer customer = new Customer();
			if(rs.next()) {
				customer.setFirstName(rs.getString(1));
				customer.setLastName(rs.getString(2));
				customer.setTitle(rs.getString(3));
				customer.setAge(rs.getInt(4));
				customer.setDob(rs.getDate(5));
			}
			return customer;
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

}

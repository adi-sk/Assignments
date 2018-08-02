package com.aditya.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.aditya.jdbc.ConnectionUtil;

public class CustomerDAO implements CommonDAO<Customer> {
	
	private static final String SQL_SELECT_ID="select id,firstName,lastName,email from customer";
	private static final String SQL_INSERT="insert into customer(id, firstName,lastName,email) values(?,?,?,?)";

	@Override
	public void create(Customer customer) {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_INSERT);
			ps.setInt(1, customer.getId());
			ps.setString(2, customer.getFirstName());
			ps.setString(3, customer.getLastName());
			ps.setString(4, customer.getEmail());
			ps.executeUpdate();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new LinkedList<>();
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_ID);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Customer customer = new Customer();
				
				customer.setId(rs.getInt(1));
				customer.setFirstName(rs.getString(2));
				customer.setLastName(rs.getString(3));
				customer.setEmail(rs.getString(4));
				
				customers.add(customer);
			}
			
			return customers;
			
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public Customer findById(int id) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement("select id,firstName,lastName,email from customer where id = ? ");
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			Customer customer = new Customer();
			if(rs.next()) {
				customer.setId(rs.getInt(1));
				customer.setFirstName(rs.getString(2));
				customer.setLastName(rs.getString(3));
				customer.setEmail(rs.getString(4));
			}
			return customer;
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

}

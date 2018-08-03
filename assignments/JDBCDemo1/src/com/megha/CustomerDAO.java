package com.megha;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements CommonDAO<Customer> {
	private List<Customer> customerList=new ArrayList<>();
	private static final String SQL_SELECT_ID="select id, firstname,lastname,email from customer where id=? ";
	private static final String SQL_SELECT_ALL="select * from customer  ";
	private static final String SQL_INSERT="insert into customer(id,firstname,lastname,email)values(?,?,?,?)";

	

	@Override
	public Customer  findById(int id) {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_ID);
			ps.setInt(1, id);
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
	
	

	@Override
	public List<Customer> findAll() {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_ALL);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Customer newCustomer= new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				customerList.add(newCustomer);
			}
			return customerList;
		}catch(SQLException ex) {
			System.out.println("SQLEXception occured.Cannot connect to database");
			ex.printStackTrace();
			return null;
		}
		
	}

	@Override
	public void insertRecord(Customer customer) {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_INSERT);
			ps.setInt(1,customer.getId());
			ps.setString(2, customer.getFirstName() );
			ps.setString(3, customer.getLastName());
			ps.setString(4,customer.getEmail() );
						ps.executeUpdate();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

	
}

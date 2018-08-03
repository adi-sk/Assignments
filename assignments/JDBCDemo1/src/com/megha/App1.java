package com.megha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class App1 {
	
	public static void main(String[] args) {
		List<Card> cards=new ArrayList<>();
		List<Customer> customers=new ArrayList<>();
		String driver="org.apache.derby.jdbc.ClientDriver";
		String url="jdbc:derby://localhost:1527/sample;create=true";
		String user="user";
		String pass="pass";
	
		try(Connection con = ConnectionUtil.getConnection(driver, url, user, pass)){
			Statement st = con.createStatement();
			st.execute("CREATE TABLE card (id int primary key, expiry Date, customerId int,balance float,creditLimit float )");
			st.execute("CREATE TABLE customer (id int primary key, firstname varchar(20),lastname varchar(20),email varchar(50) )");
			st.execute("ALTER TABLE card add constraint fk02 foreign key(customerId) references customer(id)");
			st.close();			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		CustomerDAO customer=new CustomerDAO();
		customer.insertRecord(new Customer(100,"Diskha","Singh","diksha.singh@zycus.com"));
		customer.insertRecord(new Customer(101,"Pranali","Narkar","pranali.narkar@zycus.com"));
		CardDAO card=new CardDAO();
		card.insertRecord(new Card(1,java.sql.Date.valueOf("2022-10-18"),100,50000f,100000f));
		card.insertRecord(new Card(2,java.sql.Date.valueOf("2021-11-03"),101,30000f,100000f));
		
		
		System.out.println(card.findById(1).toString());	
		
		
		
		cards=card.findAll();
		
		System.out.println(customer.findById(100).toString());
		customers=customer.findAll();
		System.out.println(cards.toString());
		System.out.println(customers.toString());
		
		
	}
}

package com.aditya.assignment;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//----------------------------Creating Schemas----------------------------//
		/*try(Connection con = ConnectionUtil.getConnection()){
			Statement st = con.createStatement();
			
			//st.execute("create table customer(id int primary key, firstName varchar(30),lastName varchar(30),email varchar(20))");
			//st.execute("create table card(id int primary key,expiry Date,customer_id int , balance int,credit_limit int, FOREIGN KEY (customer_id) REFERENCES customer(id) )");
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}*/
	
//=================================================================================================================///
		
		
		
		CardDAO cardD = new CardDAO();
		CustomerDAO customerD = new CustomerDAO();
		
		
		customerD.create(new Customer(12,"Kurhade","Aditya","adikrhd@gmail.com"));
//		cardD.create(new Card(2,Date.valueOf("2022-01-01"),11,1200,100));
		
		for(Customer customer : customerD.findAll()){
			System.out.println(customer);
		}
		
		System.out.println(cardD.findById(1));
		
	}
	
	

}

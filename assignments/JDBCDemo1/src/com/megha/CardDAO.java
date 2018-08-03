package com.megha;


import java.sql.*;
import java.sql.Date;
import java.util.*;



public class CardDAO implements CommonDAO<Card> {
	private List<Card> cardList=new ArrayList<>();
	private static final String SQL_SELECT_ID="select id, expiry,customerId,balance,creditLimit from card where id=? ";
	private static final String SQL_SELECT_ALL="select * from card  ";
	private static final String SQL_INSERT="insert into card(id,expiry,customerId,balance,creditLimit)values(?,?,?,?,?)";


	public CardDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Card findById(int id) {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			Card card = new Card();
			if(rs.next()) {
				card.setId(rs.getInt(1));
				card.setExpiry(rs.getDate(2));
				card.setCustomer_id(rs.getInt(3));
				card.setBalance(rs.getFloat(4));
				card.setCredit_limit(rs.getFloat(5));
				
			}

			return card;
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Card> findAll() {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_ALL);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Card newCard= new Card(rs.getInt(1),rs.getDate(2),rs.getInt(3),rs.getFloat(4),rs.getFloat(5));
				cardList.add(newCard);
			}
			return cardList;
		}catch(SQLException ex) {
			System.out.println("SQLEXception occured.Cannot connect to database");
			ex.printStackTrace();
			return null;
		}
		
	}

	@Override
	public void insertRecord(Card newCard) {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_INSERT);
			ps.setInt(1, newCard.getId());
			ps.setDate(2, (Date) newCard.getExpiry());
			ps.setInt(3, newCard.getCustomer_id());
			ps.setFloat(4, newCard.getBalance());
			ps.setFloat(5, newCard.getCredit_limit());
			ps.executeUpdate();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

	

}

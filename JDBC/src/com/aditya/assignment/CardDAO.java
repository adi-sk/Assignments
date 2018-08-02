package com.aditya.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.aditya.jdbc.ConnectionUtil;

public class CardDAO implements CommonDAO<Card> {
	
	private static final String SQL_SELECT_ID="select id,expiry,customer_id,balance,credit_limit from card";
	
	private static final String SQL_INSERT="insert into card(id,expiry,customer_id,balance,credit_limit) values(?,?,?,?,?)";

	@Override
	public void create(Card card) {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_INSERT);
			ps.setInt(1, card.getId());
			ps.setDate(2, card.getExpDate());
			ps.setInt(3, card.getCustomer_id());
			ps.setInt(4, card.getBalance());
			ps.setInt(5, card.getCredit_limit());
			ps.executeUpdate();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		
	}

	@Override
	public List<Card> findAll() {
		
		List<Card> cards = new LinkedList<>();
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_ID);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Card card = new Card();
				
				card.setId(rs.getInt(1));
				card.setExpDate(rs.getDate(2));
				card.setCustomer_id(rs.getInt(3));
				card.setBalance(rs.getInt(4));
				card.setCredit_limit(rs.getInt(5));
				
				cards.add(card);
			}
			
			return cards;
			
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public Card findById(int id) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement("select id,expiry,customer_id,balance,credit_limit  from card where id = ? ");
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			Card card = new Card();
			if(rs.next()) {
				card.setId(rs.getInt(1));
				card.setExpDate(rs.getDate(2));
				card.setCustomer_id(rs.getInt(3));
				card.setBalance(rs.getInt(4));
				card.setCredit_limit(rs.getInt(5));
			}
			return card;
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

}

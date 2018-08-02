package com.aditya.jdbc;

public interface CommonDAO<T> {

	void save(T object);
	void update(T object);
	void delete(T object);
	Employee findById(long id);
	
}

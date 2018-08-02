package com.aditya.assignment;

import java.util.*;

public interface CommonDAO<T> {

	void create(T object);
	List<T> findAll();
	T findById(int id);
}

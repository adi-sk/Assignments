package com.zycusBank.aditya;

import java.util.*;

public interface CommonDAO<T> {

	void create(T object);
	List<T> findAll();
	T findByName(String name);
}

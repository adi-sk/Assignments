package com.megha;

import java.util.ArrayList;
import java.util.List;

public interface CommonDAO<T> {

	
		
		public T findById(int id);
		public List<T> findAll();
		public void insertRecord(T objectOfTypeT);
	}



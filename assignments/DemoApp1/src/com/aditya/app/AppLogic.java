package com.aditya.app;

import java.io.*;
import java.io.FileWriter;

import com.aditya.models.Employee;

public class AppLogic {
	private static final String DATA_PATH = "c:/Users/aditya.kurhade/workspace/DemoApp1/test.dat";
	public Employee[] read(){
		
		Employee[] temp = new Employee[10];
		int i = 0;
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(DATA_PATH))){
			
			Object obj = in.readObject();
			while(obj!=null){
				temp[i++] = (Employee)obj;
				obj = in.readObject();
			}
			
		}catch(IOException | ClassNotFoundException ex){
			ex.printStackTrace();
			
		}
		
		return temp;
		
	}
	public void write(Employee[] emps){
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH))){
			for(Employee e: emps){
				out.writeObject(e);
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	
	public Employee convert(String[] data){
		String fname = data[0].trim();
		String lname = data[1].trim();
		int age = Integer.parseInt(data[2].trim());
		String designation = data[3].trim();
		
		return new Employee(fname,lname,designation,age);
		
	}

}

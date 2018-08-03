package com.aditya.app;

import com.aditya.models.Employee;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AppLogic logic = new AppLogic();
		Employee[] emp1 = new Employee[3];
		
		emp1[0] = new Employee("Aditya","Kurhade","trainee",22);
		emp1[1] = new Employee("adi","Kur","Manager",29);
		emp1[2] = new Employee("A","K","Mentor",28);
		logic.write(emp1);
		System.out.println("Data written to file");
		
		Employee[] emp = new Employee[3];
		emp = logic.read();
		System.out.println(emp[1].getFirstName());
		
		
	}

}

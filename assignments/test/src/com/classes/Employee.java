package com.classes;

public class Employee {
	private String firstName,LastName;
	private Address address;
	public Employee(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", LastName=" + LastName + ", address=" + address + "]";
	}

	static class Address{
		private String line1,line2,city,state;

		public Address(String line1, String line2, String city, String state) {
			super();
			this.line1 = line1;
			this.line2 = line2;
			this.city = city;
			this.state = state;
		}

		@Override
		public String toString() {
			return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state + "]";
		}
		
	}
	
	
}

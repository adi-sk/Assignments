package com.classes;

public class Person {
	private String firstName,lastName;
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}





	public Person(String firstName, String lastName,String line1, String line2, String city, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Address address = new Address(line1,line2,city,state);
	}





	private class Address{
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

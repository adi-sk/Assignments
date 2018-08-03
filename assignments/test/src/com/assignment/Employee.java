package com.assignment;

public class Employee extends Person {

	
	private String designation;
	private int empId;
	
	public Employee(String firstName, String lastName, int age,int empId,String designation) {
		super(firstName, lastName, age);
		this.empId = empId;
		this.designation = designation;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [designation=" + designation + ", empId=" + empId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (empId != other.empId)
			return false;
		return true;
	}

}

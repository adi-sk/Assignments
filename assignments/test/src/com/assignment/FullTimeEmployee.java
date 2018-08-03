package com.assignment;

public class FullTimeEmployee extends Employee {

	private int salary,pf;
	public FullTimeEmployee(String firstName, String lastName, int age, int empId, String designation,int salary,int pf) {
		super(firstName, lastName, age, empId, designation);
		// TODO Auto-generated constructor stub
		this.salary= salary;
		this.pf = pf;
	}
	@Override
	public String toString() {
		return super.toString()+"FullTimeEmployee [salary=" + salary + ", pf=" + pf + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + pf;
		result = prime * result + salary;
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
		FullTimeEmployee other = (FullTimeEmployee) obj;
		if (pf != other.pf)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

}

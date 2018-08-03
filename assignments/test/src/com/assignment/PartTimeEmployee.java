package com.assignment;

public class PartTimeEmployee extends Employee {

	private String timeShift;
	private int remuneration;
	public PartTimeEmployee(String firstName, String lastName, int age, int empId, String designation,int remuneration,String timeShift) {
		super(firstName, lastName, age, empId, designation);
		// TODO Auto-generated constructor stub
		
		this.remuneration = remuneration;
		this.timeShift = timeShift;
	}
	@Override
	public String toString() {
		return super.toString()+"PartTimeEmployee [timeShift=" + timeShift + ", remuneration=" + remuneration + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + remuneration;
		result = prime * result + ((timeShift == null) ? 0 : timeShift.hashCode());
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
		PartTimeEmployee other = (PartTimeEmployee) obj;
		if (remuneration != other.remuneration)
			return false;
		if (timeShift == null) {
			if (other.timeShift != null)
				return false;
		} else if (!timeShift.equals(other.timeShift))
			return false;
		return true;
	}

}

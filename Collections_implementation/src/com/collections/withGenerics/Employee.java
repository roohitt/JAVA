package com.collections.withGenerics;

public class Employee implements Comparable{
	private int id;
	private String nameString;
	private float Salary;
	
	public Employee(int id, String name,float salary){
		
		super();
		this.setId(id);
		this.setNameString(name);
		this.setSalary(salary);
		// TODO Auto-generated constructor stub
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//override the toString method and returns String
	public String toString() {
		return "ID "+id+" Name "+nameString+" Salary "+Salary;
	}
	
	//adding these two methods as this will be a custom class and we need to perform these checks
	
	public int hashCode() {
		return id%3;
	}
	
	public boolean equals(Object o) {
		
		Employee employee = (Employee)o;
		if(this.id==employee.id) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int compareTo(Object o) {
		Employee employee = (Employee)o;
		
		if(this.id==employee.id) {
			return 0;
		}
		else if (this.id>employee.id) {
			return 1;
		}
		else {
			return -1;
		}
	
	}
}

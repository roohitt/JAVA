package com.collections.demo;

public class Employee{
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
}

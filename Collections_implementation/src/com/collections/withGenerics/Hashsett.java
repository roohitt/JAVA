package com.collections.withGenerics;

import java.util.HashSet;
import java.util.Set;

public class Hashsett {

	public static void main(String[] args) {
		
		Set<Employee> employees = new HashSet<Employee>();
		
		//DUplicates are not allowed in HashSet
		Employee e1 = new Employee(101, "Rohit", 10000);
		Employee e2 = new Employee(102, "Shreyansh", 20000);
		Employee e3 = new Employee(103, "Vishal", 30000);
		Employee e4 = new Employee(104, "Lokesh", 40000);
		
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		//But in the following case the object references are different but the values are same therefore compiler not able to detect and will add duplicates.
		Employee e5 = e1;
		employees.add(e5);
		//What we do is we add to methods in Employee to do the checking.
		//This way that method checks and returns true or false.
		//And e5 will not be added to HashSet.
		System.out.println(employees);
	}
}

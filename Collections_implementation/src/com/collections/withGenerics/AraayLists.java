package com.collections.withGenerics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AraayLists {
	 
	public static void main(String[] args) {
		List<Employee> employees= new ArrayList<Employee>();
		
		Employee e1 = new Employee(101, "Rohit", 10000);
		Employee e2 = new Employee(102, "Shreyansh", 20000);
		Employee e3 = new Employee(103, "Vishal", 30000);
		Employee e4 = new Employee(104, "Lokesh", 40000);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		//USing Iterator:
		Iterator<Employee> iterator= employees.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}

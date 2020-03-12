//Sorts the elements automatically
package com.collections.withGenerics;
import java.util.SortedSet;
import java.util.TreeSet;

public class TReeSet {
	
	public static void main(String[] args) {
		
		SortedSet<Employee> employees = new TreeSet<Employee>();
		
		//DUplicates are not allowed in HashSet
		Employee e1 = new Employee(101, "Rohit", 10000);
		Employee e2 = new Employee(102, "Shreyansh", 20000);
		Employee e3 = new Employee(103, "Vishal", 30000);
		Employee e4 = new Employee(104, "Lokesh", 40000);
		
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		//Now like HashSet requires hashCode and equals method to eliminate duplicates
		//TreeSet requires Comparator and Comparable to sort elements so Employee must override them.
		//we get sorted Treeset
		System.out.print(employees);
		
	}

}

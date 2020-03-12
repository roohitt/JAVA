//WITHOUT GENERICS
package com.collections.demo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_and_LinkedHAshset {
	
	public static void main(String[] args) {
		Set hashSet = new HashSet();
		hashSet.add("rina");
		hashSet.add("Tina");
		hashSet.add("Mina");
		hashSet.add("Anny");
		hashSet.add("TAnny");
		hashSet.add("rina");
		
		//Does not allow duplicates therefore Rina will not be there in O/P.
		//there is no order of elements is unpredictable.
		System.out.println(hashSet);
		
	//We can also add custom objects
		hashSet.add(new Employee(101, "Rohit", 2000000));
		
		//Normal for loops does not work 
		//Enhanced for:
		
		for(Object object : hashSet) {
			System.out.println(object);
		}
		
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}

//An ordered list and duplicates are allowed.
//WITHOUT GENERICS
package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist_Demo{

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("rina");
		list.add("Tina");
		list.add("Mina");
		list.add("Anny");
		list.add("TAnny");
		
		System.out.println(list);
		
		//Compiler should give an error as Collections accept only objects.
		list.add(7);
		//But due to auto-boxing it is converted to Object.
		System.out.println(list);
		
//Accessing elements:
		//1. For loop:
		for(int i=0;i<6;i++) {
			System.out.println(list.get(i));
		}
		
		//2. Enhanced For Loop:
		for(Object object : list) {
			System.out.println(object);
		}
		
		//3.Iterator
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

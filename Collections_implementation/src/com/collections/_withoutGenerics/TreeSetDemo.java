//WITHOUT GENERICS
package com.collections.demo;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		Set treeSet = new TreeSet();
		treeSet.add("a");
		treeSet.add("s");
		treeSet.add("d");
		treeSet.add("f");
		treeSet.add("g");
		
		//Treeset is a sorted collection and prints elements in a sorted order.
		System.out.println(treeSet);
		//BUt if we try to add Employee it gives exception
		//bcoz to sort those elements they must be of same typ

	}

}

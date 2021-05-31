package com.foxmula_assignment2;

import java.util.Iterator;
import java.util.TreeSet;

public class Traverse_TreeSet {
	
	static void display(TreeSet treeset) {
		Iterator iterable=treeset.iterator();
		System.out.print("[ ");
		while(iterable.hasNext())
			System.out.print(iterable.next()+" ");
		System.out.println("]");
	}
	public static void main(String[] args) {
		TreeSet<String> treeset=new TreeSet<String>();
		treeset.add("Ram");
		treeset.add("Akshay");
		treeset.add("Monty");
		treeset.add("Sahil");
		treeset.add("Vikram");
		display(treeset);
	}

}

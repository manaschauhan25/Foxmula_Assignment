package com.foxmula_assignment2;

import java.util.HashSet;
import java.util.Iterator;

public class Traverse_HashSet {
	
	static void display(HashSet set) {
		Iterator iterable=set.iterator();
		System.out.print("[ ");
		while(iterable.hasNext())
			System.out.print(iterable.next()+" ");
		System.out.println("]");
	}
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		display(set);
	}

}

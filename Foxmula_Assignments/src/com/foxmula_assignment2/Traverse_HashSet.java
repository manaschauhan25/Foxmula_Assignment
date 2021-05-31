package com.foxmula_assignment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Traverse_HashSet {
	
	static void display(HashSet set) {
		Iterator iterable=set.iterator();
		System.out.print("[ ");
		while(iterable.hasNext())
			System.out.print(iterable.next()+" ");
		System.out.println("]");
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Size of Hash Set:");
		int size=Integer.parseInt(scanner.nextLine());
		if(size>0)
			System.out.println("Enter the elements");
		HashSet<String> set=new HashSet<String>(size);
		for(int i=0;i<size;i++) {
			String element=scanner.nextLine();
			set.add(element);
		}
		display(set);
	}

}

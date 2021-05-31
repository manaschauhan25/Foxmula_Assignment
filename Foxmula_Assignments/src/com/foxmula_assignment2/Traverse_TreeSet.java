package com.foxmula_assignment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
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
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Size of Hash Set:");
		int size=Integer.parseInt(scanner.nextLine());
		if(size>0)
			System.out.println("Enter the elements");
		TreeSet<String> treeset=new TreeSet<String>();
		for(int i=0;i<size;i++) {
			String element=scanner.nextLine();
			treeset.add(element);
		}
		display(treeset);
	}

}

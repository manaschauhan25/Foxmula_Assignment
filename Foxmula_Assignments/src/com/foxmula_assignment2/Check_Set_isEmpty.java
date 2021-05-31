package com.foxmula_assignment2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Check_Set_isEmpty {
	static void isEmpty(HashSet<String> set) {
		if(set.size()==0)
			System.out.println("The set is empty");
		else
		System.out.println("The set is not empty");
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Size of Hash Set:");
		int size=Integer.parseInt(scanner.nextLine());
		HashSet<String> set=new HashSet<String>(size);
		if(size>0)
			System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			String element=scanner.nextLine();
			set.add(element);
		}
		isEmpty(set);
//		isEmpty(set);
//		set.add("1");
//		isEmpty(set);
//		set.add("2");
//		set.remove(0);
//		set.remove(0);
//		isEmpty(set);
//		set.add("3");
//		set.add("4");
//		isEmpty(set);
//		set.add("5");
//		set.clear();
//		isEmpty(set);
		
		
	}

}

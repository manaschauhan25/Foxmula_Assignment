package com.foxmula_assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class Occurence_Each_Element {
	private static void frequency(ArrayList list) {
		HashMap map=new HashMap();
		for(int i=0;i<list.size();i++) {
			if(map.containsKey(list.get(i))){
				int value=(Integer)(map.get(list.get(i)))+1;
				map.replace(list.get(i), value);

			}
			else {
				map.put(list.get(i), 1);
			}
				
		}
		System.out.println(map.toString());
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Size of Array List:");
		int size=Integer.parseInt(scanner.nextLine());
		if(size>0)
			System.out.println("Enter the elements");
		ArrayList list=new ArrayList(size);
		for(int i=0;i<size;i++) {
			String element=scanner.nextLine();
			list.add(element);
		}
		frequency(list);
		
	}

}

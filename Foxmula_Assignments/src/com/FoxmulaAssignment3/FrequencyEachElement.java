package com.FoxmulaAssignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyEachElement {
	public static HashMap frequency(ArrayList list) {
		HashMap map=new HashMap(list.size());
		for(int i=0;i<list.size();i++) {
			if(map.containsKey(list.get(i))){
				int value=(Integer)(map.get(list.get(i)))+1;
				map.replace(list.get(i), value);

			}
			else {
				map.put(list.get(i), 1);
			}
				
		}
		return map;
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
		HashMap result=frequency(list);
		System.out.println(result);
		
		
	}

}

package com.FoxmulaAssignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class SortFrequency {
	private static void Sortedfrequency(ArrayList list) {
		FrequencyEachElement fElement=new FrequencyEachElement();
		HashMap<Integer, Integer> map=fElement.frequency(list);
		
		ArrayList<Entry<Integer, Integer>> entrySet=new ArrayList<Entry<Integer, Integer>>(map.entrySet());
		Collections.sort(entrySet, new Comparator<Entry<Integer, Integer>>(){
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		System.out.println(entrySet);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Size of Array List:");
		int size=Integer.parseInt(scanner.nextLine());
		
		if(size>0)
			System.out.println("Enter the elements");
		
		ArrayList list=new ArrayList(size);
		for(int i=0;i<size;i++) {
			int element=Integer.parseInt(scanner.nextLine());
			list.add(element);
		}
		Sortedfrequency(list);
	}

}

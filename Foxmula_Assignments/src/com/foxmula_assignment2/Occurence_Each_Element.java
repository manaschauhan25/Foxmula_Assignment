package com.foxmula_assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Occurence_Each_Element {
	static void frequency(ArrayList list) {
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
		ArrayList list=new ArrayList();
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(2);
		frequency(list);
		
	}

}

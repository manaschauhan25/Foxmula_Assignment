package com.foxmula_assignment2;


import java.util.HashSet;

public class Check_Set_isEmpty {
	static void isEmpty(HashSet<String> set) {
		if(set.size()==0)
			System.out.println("The set is empty");
		else
		System.out.println("The set is not empty");
		
	}
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		isEmpty(set);
		set.add("1");
		isEmpty(set);
		set.add("2");
		set.remove(0);
		set.remove(0);
		isEmpty(set);
		set.add("3");
		set.add("4");
		isEmpty(set);
		set.add("5");
		set.clear();
		isEmpty(set);
		
		
	}

}

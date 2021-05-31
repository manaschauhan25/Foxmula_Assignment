package com.foxmula_assignment2;
import java.util.ArrayList;
import java.util.Collections;

public class Check_isEmpty {
	static void isEmpty(ArrayList list) {
		if(list.size()==0)
			System.out.println("The list is empty");
		else
		System.out.println("The list is not empty");
		
	}
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		isEmpty(list);
		list.add("1");
		isEmpty(list);
		list.add("2");
		list.remove(0);
		list.remove(0);
		isEmpty(list);
		list.add("3");
		list.add("4");
		isEmpty(list);
		list.add("5");
		list.clear();
		isEmpty(list);
		
	}

}

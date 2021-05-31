package com.foxmula_assignment2;

import java.util.ArrayList;
import java.util.HashSet;

public class Pair_Sum {
	static ArrayList get_pair(ArrayList<Integer> list,int sum) {
		HashSet<Integer> set=new HashSet<Integer>();
		ArrayList<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			int tem=sum-list.get(i);
			if(set.contains(tem)) {
				result.add(list.get(i));
				result.add(tem);
				return result;
			}
			else {
				set.add(list.get(i));
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		int sum=4;
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(1);
		list.add(4);
		ArrayList answer=get_pair(list, sum);
		if(answer.isEmpty())
			System.out.println("No pair");
		else
		System.out.print(answer.toString());
		
	}

}

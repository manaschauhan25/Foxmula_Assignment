package com.foxmula_assignment2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Check_isEmpty {
	static void isEmpty(ArrayList list) {
		if(list.size()==0)
			System.out.println("The list is empty");
		else
		System.out.println("The list is not empty");
		
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
		isEmpty(list);

	}

}

package com.foxmula_assignment1;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Stack stack1=new Stack();
		Stack stack2=new Stack();
		Scanner scanner= new Scanner(System.in);
		
		while(true) {
			System.out.println();
			int press;
			
			System.out.println("1.Press 1 for operation in Stack1: \n2.Press 2 for operation in stack2:\n3.Exit");
			press=scanner.nextInt();
			System.out.println("\n");
			if(press == 1) {
				stack1.input(stack2);
				
				
			}
			else if(press == 2) {
				stack2.input(stack1); // Here first argument where operation happens 
			}
			
			else if(press == 3) {
				System.exit(0);
			}
			else  {
				System.out.println("Wrong Choice........");
			}
			
		}
		
	}

}

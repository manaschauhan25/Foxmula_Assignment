package com.foxmula_assignment1;

import java.util.Scanner;



public class Stack {
	private int size=0;		// Number of elements in the stack
	
	// Defining Node class
	class Node{
		private int data;   // the number in the node
		private Node next;  // the refrene that point to next node
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node topNode=null;
	
	Stack(){
		this.topNode=null;
	}
	
	public void push(int data) {
		Node node=new Node(data);
		node.next=this.topNode;
		this.topNode=node;
		size++;
	}
	public void pop() {
		if(this.topNode==null) {
			System.out.println("StackUnderflow");
			return;
		}
		this.topNode=this.topNode.next;
		size--;
		
	}
	public void checkEmpty() {
		if(this.size==0) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Size of Stack is: "+this.size);
		}
	}
	public void checkLength(Stack stack2){
		if(this.size == stack2.size) {
			
			System.out.println("Both Stack size are equal");
			if(this.size == 0 && stack2.size == 0) {
				System.out.println("Both Stack  are also empty");
			}
			System.out.println("First Stack:");
			display(this);
			System.out.println("Second Stack:");
			display(stack2);
			
		}
		
	
	}
		
	
	public void display(Stack prStack) {
		Node traverseNode=prStack.topNode;
		System.out.print("[");
		while(traverseNode!=null) {
			System.out.print(traverseNode.data+" ");
			traverseNode=traverseNode.next;
		}
		System.out.println("]");
		
	}
	public static void input(Stack stack1, Stack stack2) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. For Push: \n2.For Pop: \n3.Check if the stack is empty or not:\n4.Display the Stack");
		int operation=scanner.nextInt();
		if(operation == 1) {
			System.out.print("Enter the Element:");
			int  data=scanner.nextInt();
			stack1.push(data);
			stack1.checkLength(stack2);
		}
		else if(operation == 2) {
			stack1.pop();
			stack1.checkLength(stack2);
		}
		else if(operation == 3) {
			stack1.checkEmpty();
			
		}
		else if(operation == 4) {
			stack1.display(stack1);
		}
		
		else {
			System.out.println("Wrong Choice of Input.....");
		}
	}
	
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
				input(stack1, stack2);
				
				
			}
			else if(press == 2) {
				input(stack2,stack1); // Here first argument where operation happens 
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

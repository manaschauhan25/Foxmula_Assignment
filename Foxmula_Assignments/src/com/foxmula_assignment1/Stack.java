package com.foxmula_assignment1;

import java.util.Scanner;



public class Stack extends Node {
	private int size=0;		// Number of elements in the stack
	
	// Defining Node class
	private Node topNode;
	
	Stack(){
		this.topNode=null;
	}
	
	public void push(int data) {
		Node node=new Node(data);
		node.setNext(this.topNode);
		this.topNode=node;
		size++;
	}
	public void pop() {
		if(this.topNode==null) {
			System.out.println("StackUnderflow");
			return;
		}
		this.topNode=(this.topNode.getNext());
		size--;
		
	}
	public void checkEmpty() {
		if(this.size==0) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Stack is not empty its size is: "+this.size);
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
			System.out.print(traverseNode.getData()+" ");
			traverseNode=traverseNode.getNext();
		}
		System.out.println("]");
		
	}
	public void input(Stack stack2) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. For Push: \n2.For Pop: \n3.Check if the stack is empty or not:\n4.Display the Stack");
		int operation=scanner.nextInt();
		if(operation == 1) {
			System.out.print("Enter the Element:");
			int  data=scanner.nextInt();
			this.push(data);
			this.checkLength(stack2);
		}
		else if(operation == 2) {
			this.pop();
			this.checkLength(stack2);
		}
		else if(operation == 3) {
			this.checkEmpty();
			
		}
		else if(operation == 4) {
			this.display(this);
		}
		
		else {
			System.out.println("Wrong Choice of Input.....");
		}
	}
	

}

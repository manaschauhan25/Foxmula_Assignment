package com.foxmula_assignment1;


public class Node{
	private int data;   // the number in the node
	private Node next;  // the reference that point to next node
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return this.next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	Node(){
		
	}
	Node(int data){
		this.setData(data);
		this.setNext(null);
	}
}

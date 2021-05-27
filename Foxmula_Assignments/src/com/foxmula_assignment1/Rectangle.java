package com.foxmula_assignment1;



public class Rectangle extends Quadrilateral {
	public Rectangle(int x1, int y1, int x2,int y2, int x3, int y3 , int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		
	}
	double area() {
		return side1*side2;
	}
	
	public static void main(String[] args) {
		// Assuming that top left is (x1,y1) the top right (x2,y2) bottom left is (x3,y3) bottom right is (x4,y4)
		Rectangle rectangle= new Rectangle(0,2,3,2,3,0,0,4);
		System.out.println("Area of Square:"+rectangle.area());
	}

}

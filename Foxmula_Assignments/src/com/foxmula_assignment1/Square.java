package com.foxmula_assignment1;

public class Square extends Quadrilateral {
	public Square(int x1, int y1, int x2,int y2, int x3, int y3 , int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		
	
	}
	double area() {
		return side1*side1;
	}
	public static void main(String[] args) {
		// Assuming that top left is (x1,y1) the top right (x2,y2) bottom left is (x3,y3) bottom right is (x4,y4)
		Square square= new Square(0,2,2,2,2,0,0,0);
		System.out.println("Area of Square:"+square.area());
	}

}

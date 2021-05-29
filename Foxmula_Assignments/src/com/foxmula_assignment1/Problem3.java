package com.foxmula_assignment1;



public class Problem3 {
	public static void main(String[] args) {
		// Assuming that top left is (x1,y1) the top right (x2,y2) bottom left is (x3,y3) bottom right is (x4,y4)
		
				Square square= new Square(0,2,2,2,2,0,0,0);
				Rectangle rect= new Rectangle(0,2,3,2,3,0,0,4);
				Parallelogram parl=new Parallelogram(7,5,16,5,9,0,0,0);
				Trapezoid trapezoid=new Trapezoid(-2,2,2,2,6,0,-6,0);
				
				
				System.out.println();
				System.out.println("Area of Square:"+square.area());
				System.out.println();
				System.out.println("Area of Rectangle:"+rect.area());
				System.out.println();
				//Assumption Paralleogram can be made only by changing x1 and x4 not considering for y1 and y2
				System.out.println("Area of Paralleogram:"+parl.area());
				System.out.println();
				//Assumption in Trapazious parallel sides can be on up or down but not on left and right
				System.out.println("Area of Trapazoid:"+trapezoid.area());
	}

}

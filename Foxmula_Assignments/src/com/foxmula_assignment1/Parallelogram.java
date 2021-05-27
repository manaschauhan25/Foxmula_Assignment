package com.foxmula_assignment1;



public class Parallelogram extends Quadrilateral {
	public Parallelogram(int x1, int y1, int x2,int y2, int x3, int y3 , int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		
	}
	double area() {
		double base;
		float m;
		double ar=0;
		
		
		if(x1>x4) {
			
			
			base=side4;
			m=(y4-y3)/(x4-x3);
			float x=(x1+m*y1+m*m*x3-m*y3)/(1+m*m);
			float y=(y3+m*x1-m*x3+m*m*y1)/(1+m*m);
			double height=Math.sqrt(Math.pow(Math.abs(x-x1),2)+Math.pow(Math.abs(y-y1),2));
			
			ar=base*height;
		}
			else if(x4>x1) {
				
			base=side1;
			m=(y1-y2)/(x1-x2);
			float x=(x4+m*y4+m*m*x2-m*y2)/(1+m*m);
			float y=(y2+m*x4-m*x2+m*m*y4)/(1+m*m);
			double height=Math.sqrt(Math.pow(Math.abs(x-x1),2)+Math.pow(Math.abs(y-y1),2));
			System.out.print("++"+x);
			ar=base*height;
			}
			
			else if(x1==x4 && y1==y2 && x2==x3 && y3==y4) {
				ar=side1*side2;
			}
		
		return ar;
	
	}
	
	public static void main(String[] args) {
		// Assuming that top left is (x1,y1) the top right (x2,y2) bottom left is (x3,y3) bottom right is (x4,y4)
		Parallelogram paralleogram=new Parallelogram(7,5,16,5,9,0,0,0);
		//Assumption Paralleogram can be made only by changing x1 and x4 not considering for y1 and y2
		System.out.println("Area of Paralleogram:"+paralleogram.area());

		
	}

}

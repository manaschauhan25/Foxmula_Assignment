package com.foxmula_assignment1;



public class Trapezoid extends Quadrilateral {
	public Trapezoid(int x1, int y1, int x2,int y2, int x3, int y3 , int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		
		
	}
	double area() {
		
		float m;
		double ar=0;
		
		if(x1>x4) {
			
			
			m=(y4-y3)/(x4-x3);
			float x=(x1+m*y1+m*m*x3-m*y3)/(1+m*m);
			float y=(y3+m*x1-m*x3+m*m*y1)/(1+m*m);
			double height=Math.sqrt(Math.pow(Math.abs(x-x1),2)+Math.pow(Math.abs(y-y1),2));
			
			ar=((side1+side4)*height)/2;
		}
			else if(x4>x1) {
				
			
			m=(y1-y2)/(x1-x2);
			float x=(x4+m*y4+m*m*x2-m*y2)/(1+m*m);
			float y=(y2+m*x4-m*x2+m*m*y4)/(1+m*m);
			double height=Math.sqrt(Math.pow(Math.abs(x-x1),2)+Math.pow(Math.abs(y-y1),2));
			System.out.print("++"+x);
			ar=((side1+side4)*height)/2;
			}
		return ar;
		
	}
	public static void main(String[] args) {
		// Assuming that top left is (x1,y1) the top right (x2,y2) bottom left is (x3,y3) bottom right is (x4,y4)
		Trapezoid trapezoid=new Trapezoid(-2,2,2,2,6,0,-6,0);
		//Assumption in Trapazious parallel sides can be on up or down but not on left and right
		System.out.println("Area of Trapazoid:"+trapezoid.area());
	}

}

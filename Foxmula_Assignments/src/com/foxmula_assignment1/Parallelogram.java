package com.foxmula_assignment1;



public class Parallelogram extends Quadrilateral {
	public Parallelogram(int x1, int y1, int x2,int y2, int x3, int y3 , int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		
	}
	double area() {
		double base;
		double m;
		double ar=0;
		double x1=super.getX1();
		double x3=super.getX3();
		double y3=super.getY3();
		double y1=super.getY1();
		double x4=super.getX4();
		double y4=super.getY4();
		double x2=super.getX2();
		double y2=super.getY2();
		double side4=super.getSide4();
		double side2=super.getSide2();
		double side1=super.getSide1();
		
		
		if(x1>x4) {
			
			
			base=side4;
			m=(y4-y3)/(x4-x3);
			double x=(x1+m*y1+m*m*x3-m*y3)/(1+m*m);
			double y=(y3+m*x1-m*x3+m*m*y1)/(1+m*m);
			double height=Math.sqrt(Math.pow(Math.abs(x-x1),2)+Math.pow(Math.abs(y-y1),2));
			
			ar=base*height;
		}
			else if(x4>x1) {
				
			base=side1;
			m=(y1-y2)/(x1-x2);
			double x=(x4+m*y4+m*m*x2-m*y2)/(1+m*m);
			double y=(y2+m*x4-m*x2+m*m*y4)/(1+m*m);
			double height=Math.sqrt(Math.pow(Math.abs(x-x1),2)+Math.pow(Math.abs(y-y1),2));
			System.out.print("++"+x);
			ar=base*height;
			}
			
			else if(x1==x4 && y1==y2 && x2==x3 && y3==y4) {
				ar=side1*side2;
			}
		
		return ar;
	
	}
	

}

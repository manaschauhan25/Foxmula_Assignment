package com.foxmula_assignment1;

public class Quadrilateral{
	int x1,y1,x2,y2,x3,y3,x4,y4;
	double side1,side2,side3,side4;
	public Quadrilateral(int x1, int y1, int x2,int y2, int x3, int y3 , int x4, int y4) {
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.x4=x4;
		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
		this.y4=y4;
		side1=Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));
		side2=Math.sqrt(Math.pow(Math.abs(x4-x1),2)+Math.pow(Math.abs(y4-y1),2));
		side3=Math.sqrt(Math.pow(Math.abs(x2-x3),2)+Math.pow(Math.abs(y2-y3),2));
		side4=Math.sqrt(Math.pow(Math.abs(x3-x4),2)+Math.pow(Math.abs(y3-y4),2));
		
		
	}
	
}

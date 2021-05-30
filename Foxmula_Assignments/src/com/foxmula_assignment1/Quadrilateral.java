package com.foxmula_assignment1;

public class Quadrilateral{
	private double x1,y1,x2,y2,x3,y3,x4,y4;
	private double side1,side2,side3,side4;
	public double getX1() {
		return x1;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public double getY1() {
		return y1;
	}
	public void setY1(double y1) {
		this.y1 = y1;
	}
	public double getX2() {
		return x2;
	}
	public void setX2(double x2) {
		this.x2 = x2;
	}
	public double getY2() {
		return y2;
	}
	public void setY2(double y2) {
		this.y2 = y2;
	}
	public double getX3() {
		return x3;
	}
	public void setX3(double x3) {
		this.x3 = x3;
	}
	public double getY3() {
		return y3;
	}
	public void setY3(double y3) {
		this.y3 = y3;
	}
	public double getX4() {
		return x4;
	}
	public void setX4(double x4) {
		this.x4 = x4;
	}
	public double getY4() {
		return y4;
	}
	public void setY4(double y4) {
		this.y4 = y4;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getSide4() {
		return side4;
	}
	public void setSide4(double side4) {
		this.side4 = side4;
	}
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

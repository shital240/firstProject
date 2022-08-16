package com.codeo.poly;

public class Rectangle extends Shape {
     double length;
     double bredth;
	 
	public void calculateArea() {
		System.out.println("Calculate area of Rectangle");
	    
	}
	//4,7
	public void calculateArea(double length,double bredth) {
		double area=0;
		area=length*bredth;
		System.out.println("Area of rectangle: "+area);
	}
	
}

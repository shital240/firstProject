package com.codeo.poly;

public class Triangle extends Shape {

	double base;
	double height;
	public void calculateArea(double base,double height) {
		double area=0;
		area=0.5*base*height;
		System.out.println("Area of Triangle: "+area);
	}
}

package com.codeo.poly;
//IS-A Relationship
//Circle is a shape
public class Circle extends Shape{
	double radius;
	@Override
	public void calculateArea() {
		System.out.println("Area of Circle");
		System.out.println(radius);
		
	}
	//5
	public void calculateArea(double radius) {
		this.radius=radius;
		double area=0;
		area=3.14*(Math.pow(radius, 2));
		System.out.println("Area of Cicle will be"+area);
	}

}

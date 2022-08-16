package com.codeo.poly;

public class Shape {
    double a;
    double b;
   
	//Calculate Area without any parameters
	public void calculateArea() {
		System.out.println("Calculate Area of Shape");
	}
	//overloading:-
	//calculate area with parameters
	public void calculateArea(double a,double b) {
		System.out.println(a+b);
	}
	//method with 1 parameter
    public void calculateArea(double radius) {
		System.out.println("area will be : "+radius);
	}
}

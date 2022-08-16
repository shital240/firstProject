package com.codeo.poly;

public class Runner {

	public static void main(String[] args) {
		Shape circle=new Circle();
		//Circle object is created
		//In polymorphism we are creating object of child class
		//by using parent class reference
		circle.calculateArea(5);
		circle.calculateArea();
		Shape rectangle=new Rectangle();
	    rectangle.calculateArea(4,7);	
	    Shape triangle=new Triangle();
	    triangle.calculateArea(3, 6);
	    Shape square=new Square();
	    square.calculateArea(5);
	  

	}

}

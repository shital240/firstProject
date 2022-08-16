package com.codeo.poly;

public class Square extends Shape {
	
	double side;
	
	public void calculateArea(double side) {
		double area;
		this.side=side;
		
		//area=side*side;
		 area=Math.pow(side, 2); 
		System.out.println("Area of Square will be: "+area);
	}

}

package com.codeo.demo;

public class Building {
	//properties/variables
	
	int noOfWindows=5;
	double areaOfHouse=2345.43;
	String color="blue";
	int x;
	String y;
	double d;

	public void construction() {
		System.out.println("Constuction is started");
	}
	public static void main(String xyz[]) {
		
		Building building1=new Building();
		System.out.println(building1.x+" "+building1.y+" "+building1.d);
		Building building2=new Building();
		building1.construction();
		System.out.println(building1);
		System.out.println(building2);
		System.out.println("==========================");
		System.out.println("Properties of Building 1");
		System.out.println("No of windows: "+building1.noOfWindows);
		System.out.println("House color: "+building1.color);
		System.out.println("Area of House: "+building1.areaOfHouse);

	}

}

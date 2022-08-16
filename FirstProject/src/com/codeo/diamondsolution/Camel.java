package com.codeo.diamondsolution;

public interface Camel {
	//we can only declare the method
	//we can't define the method in interface
	//When you want to use multiple Inheritance 
	//we have to define method by using default keyword
	 default void move() {
		System.out.println("Camel is Moving");
	}
}

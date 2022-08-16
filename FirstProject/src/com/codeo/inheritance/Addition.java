package com.codeo.inheritance;

public class Addition extends Object {

	int a;//0
	int b;//0
	
	//1,2
	public Addition(int a, int b) {
		
		this.a = a;
		this.b = b;
	}


	public void addInBaseClass() {
		int c=0;
		c=a+b;
		System.out.println("two variables addition in base class: "+c);
	}
	public int addition(int a,int b) {
		int sum=a+b;
		return sum;
	}
}

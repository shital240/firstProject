package com.codeo.inheritance;

public class Addition3 extends Addition {

	
	int c;//0==>3
	//1,2,3
	public Addition3(int a, int b, int c) {
		//super keyword is use to call base class constructor
		//Constructor call must be the first statement in a constructor
		super(a, b);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void calculateAdditionof3() {
		int sum=0;
		sum=a+b+c;
		System.out.println("Sum of 3 no's in derieved class: "+sum);
	}
}

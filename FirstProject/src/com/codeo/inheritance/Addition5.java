package com.codeo.inheritance;

public class Addition5 extends Addition3{

	int d;//4
	int e;//5
	//1,2,3,4,5
	public Addition5(int a, int b, int c,int d,int e) {
		super(a, b, c);
		this.a = a;
		this.b = b;
		this.c = c;
		this.d=d;
		this.e=e;
		
	}
	public void add5Variables() {
		int sum=0;
		sum=a+b+c+d+e;
		System.out.println("Sum of 5 no's will be: "+sum);
	}

}

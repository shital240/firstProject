package com.codeo.demo;

public class Methods1 extends FinalConcept {
	
	
	public void calculateArea()
	{
		System.out.println("Calculate the area");
	}
	public void displayMessage10()
	{
		for(int i=0;i<=9;i++) {
			System.out.println("Welcome to codeograph solutions");
		}
	}
	
	public void ArithmeticOperation(int a,int b) {
		//a=3,b=2
		int c=0;
		c=a+b;
		System.out.println("The addition will be:"+c);
		c=a/b;
		System.out.println("The division will be: "+c);
	    c=a*b;
	    System.out.println("The Multiplication will be: "+c);
	    c=a-b;
	    System.out.println("The Substraction will be: "+c);
	}
	public static void main(String[] args) {
		Methods1 m=new Methods1();
		m.ArithmeticOperation(3, 2);
	
		m.displayMessage10();
		FinalConcept fc=new FinalConcept();
		fc.myMethod();

	}

}

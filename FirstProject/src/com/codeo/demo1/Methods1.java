package com.codeo.demo1;

public class Methods1 {
	
	int a;
	int b;
	
public Methods1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("The addition in Constructor will be: "+(a+b));
	}
public Methods1() {
	
}
//void it never returns
	public void display() {
		for(int i=0;i<5;i++) {
			System.out.println("Welcome to codeograph");
		}
	}
	//int type method
	//3,4
	public int addition(int a,int b) {
		int c=0;
		c=a+b;//7
		return c;
		
	}
	//double type method
	public double calculateArea(double radius) {
		double areaOfCircle=0;
		areaOfCircle=3.14*radius*radius;
		
		return areaOfCircle;
		
	}
	//String type method
	public String Concating() {
		String str="codeograph";
		return str;
		
	}
	public void ArithmeticOperation(int a,int b) {
		//a=3,b=2
		//a=5,b=5
		int c=0;
		c=a+b;//10==> c=10
		System.out.println("The addition will be:"+c);
		c=a/b;//c=10==>c=1
		System.out.println("The division will be: "+c);
	    c=a*b;
	    System.out.println("The Multiplication will be: "+c);
	    c=a-b;
	    System.out.println("The Substraction will be: "+c);
	}
	
	
	public static void main(String[] args) {
		
        Methods1 method=new Methods1();
        method.ArithmeticOperation(5, 5);
        Methods1 constructorlogic=new Methods1(1,2);
        Methods1 constructorlogic1=new Methods1(3,4);
        method.display();
       System.out.println("The addition will be: "+method.addition(3,4));
        System.out.println("The Area of circle will be: "+method.calculateArea(4));
        System.out.println("The Area of circle will be: "+method.Concating());
	}

}

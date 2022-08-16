package com.codeo.logicbuilding;

public class Logic3 {
//write a program to find even and odd number
	public static void main(String[] args) {
		//even no is divisible by 2
		int a=3;
		if(a%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("number is odd");
		}
		//2/2==> Remainder=0 
		//so In this case if statement will not be executed
		if(a%2!=0) {
			System.out.println("number is odd");
		}
		else {
			System.out.println("Number is even");
		}
		//2/2==> remainder=0 
		// 0==1==> false
		if(a%2==1) {
			System.out.println("Number is odd");
		}
		else {
			//condition is true
			System.out.println("number is even");
		}
		

	}

}

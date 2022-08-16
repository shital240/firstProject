package com.codeo.exceptions;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) throws ArithmeticException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int divide=0;
		try {
			divide=a/b;
			System.out.println("Division will be: "+divide);
		}
		catch(ArithmeticException e) {
		System.out.println("Please enter proper input");
			//e.printStackTrace();
		}
		finally {
			System.out.println("Thanks for using calculator");
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("Welcome to codeograph solutions");
		}
		
	}

}

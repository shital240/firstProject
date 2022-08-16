package com.codeo.exceptions;

public class ArrayExceptions {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6,6};
		//arr[0]====>arr[5]
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(arr[i]);
			}
		}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Enter proper values in for loop");
			}
		
		System.out.println("Welcome to codeograph solutions");

	}

}

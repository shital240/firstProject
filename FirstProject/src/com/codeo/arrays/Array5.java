package com.codeo.arrays;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		int temp=1;
	  int arr[]= {99,6,7,8,5,43,23,3,4,1,2};
	  for(int i=0;i<=arr.length-1;i++) {
		  
		  if(arr[i]==a) {
			  System.out.println("Element is present at "+i+" position");
		      temp++;
		  }
		 
	  }
	  if(temp==1) {
		  System.out.println("Element not found");
	  }
	}

}

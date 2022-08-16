package com.codeo.arrays;

public class Arrays4 {
//Write a program to print sum of even number
	//which are present in array
	public static void main(String[] args) {
		int arr[]= {99,6,7,8,5,43,23,3,4,1,2};
		int sum=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of even number will be: "+sum);

	}

}

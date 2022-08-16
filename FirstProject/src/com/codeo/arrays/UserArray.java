package com.codeo.arrays;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter no of values you want to store");
//We want to store 7 values
int a=sc.nextInt();
//create an array of 7 values(0-->4) only 5 values
int arr[]=new int[10];
System.out.println("enter the array elements");
// user have entered 7 values 1,2,3,4,5 
for(int i=0;i<=a-1;i++) {
	arr[i]=sc.nextInt();
	//a[0]=1, a[1]=2,....a[6]=5;
}
System.out.println("Array elements are: ");
		/*
		 * for(int i=0;i<a;i++) { System.out.println(arr[i]); //print a[0]=1; }
		 */
//for each loop

for(int i:arr) {
	System.out.print(i+",");
}
	}

}

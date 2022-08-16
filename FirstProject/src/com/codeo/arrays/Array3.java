package com.codeo.arrays;

public class Array3 {

	public static void main(String[] args) {
		//how to sort the array element.
		//Sort the array elements by ascending order
		//int temp=0;
		int[] arr= {99,6,7,8,5,43,23,3,4,1,2};
		
		System.out.println("Array before sorting: ");
		for(int i:arr) {
			System.out.print(","+i);
		}
		//i=0; 0<=10 
		//j=1; 1<11
		//i=1
		//j=2
		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				//arr[0]>arr[1]==>99>6
				//arr[1]>arr[2]==>99>7
				//swap the number
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]+arr[j]; 
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j]; 
				}
			}
		}
		System.out.println("============");
		System.out.println("Sorted Array will be: ");
		for(int i: arr) {
			System.out.print(","+i);
		}
		System.out.println("");
		System.out.println("3nd Largest element will be: "+arr[arr.length-3]);
        System.out.println("2nd smallest element will be: "+arr[1]);
        
	}

}

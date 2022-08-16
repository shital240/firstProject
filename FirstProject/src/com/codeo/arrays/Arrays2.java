package com.codeo.arrays;

public class Arrays2 {
//Write a program to calculate sum of the array elements
	public static void main(String[] args) {
		//indexing will be arr[0] to arr[10]
		int arr[]= {99,6,7,8,5,43,23,3,4,1,2};
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			//0=0+99==>sum=99
			//99=99+6==>sum=105
			
		}
		System.out.println("The sum will be: "+sum);
		System.out.println("The average will be: "+sum/(arr.length));
		System.out.println("===================================================");
      for(int i=arr.length-1;i>=0;i--) {
    	  System.out.println(arr[i]);
      }
      //write a program to count elements present in array
      for(int i=2;i<=arr.length-1;i++) {
    	  count++;
      }
      System.out.println("Count of elements: "+count);
      
	}

}

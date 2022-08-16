package com.codeo.arrays;

import java.util.Arrays;

public class Arrays1 {
	
	

	public static void main(String[] args) {
		int arr[]= {99,6,7,8,5,43,23,3,4,1,2};
		String str[]= {"codeo","Graph","Solutions","Near IT Park","","null"};
	
		//Traditional for loop
		System.out.println("Length of the array: "+arr.length);
        int stringcount=0;
		for(int i=0;i<=arr.length-1;i++) {
			//arr[0]=1;
			//arr[1]=2;
			//arr[10] loop will break
			
			System.out.println(arr[i]);
		}
		System.out.println("===========================");
		System.out.println("For Each Loop");
		//for each loop in Java
		for(int i:arr) {
			System.out.println(i);
		}
		
		//Write a program to sort Array Elements
	//Method you should not use while time of interview	
    Arrays.sort(arr);
    System.out.println("Elements after sorting will be: ");
    for(int a:arr) {
    	System.out.println(+a);
    }
    //In case of String this values are sort by ASCII values
    //convert particular elements into either upper or lower case
    Arrays.sort(str);
    System.out.println("================================");
    System.out.println("The sorted String array will be: ");
    for(String s:str) {
    	System.out.println(s);
    }
    
    for(int i=0;i<=str.length-1;i++) {
    	if(str[i]!= "" && str[i]!= "null" ) {
    		stringcount++;
    	}
    }
    System.out.println("count of String will be: "+stringcount);

	}

}

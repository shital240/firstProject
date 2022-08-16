package com.codeo.string;

public class StringConcepts1 {

	public static void main(String[] args) {
		 String string = "The best of both worlds";  
	        int count = 0;  
	          int length=string.length();
	        //Counts each character except space  
	        for(int i = 0; i < length; i++) {  
	            if(string.charAt(i) != ' ')  
	                count++;  
	        }  
	          
	        //Displays the total number of characters present in the given string  
	        System.out.println("Total number of characters in a string: " + count);  
		
		//write a program to reverse the string
		//without using StringBuffer & StringBuilder
	//Method you should not use to reverse string
		String str="codeograph solutions";
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
   //step1. you will convert this string to char array
		// c o d e o g r a p h
		//arr[0] ==>arr[9]
		char[] arr=str.toCharArray();
  //step2: use for loop to reverse the array
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(+arr[i]);
		}
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') 
				count++;
			
		}
		System.out.println(count);
		
		
		
	}
	//calculate characters in string without spaces
	

}

package com.codeo.arrays;

public class ConstructArray {
	
	int arr[];
	String str[];

	// a[]={99,6,7,8,5,43,23,3,4,1,2};
	//String str[]= {"codeo","graph","solutions","near IT Park"};
	public ConstructArray(int[] arr,String str[]) {
		super();
		this.arr = arr;
		this.str=str;
		
	}
	public static void printMsg() {
		System.out.println("Message by normal ");
	}
  
	public void printArray() {
		//for each loop
		for(int i:arr) {
			System.out.println(i);
		}
		for(String s:str) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		int a[]={99,6,7,8,5,43,23,3,4,1,2};
		String str[]= {"codeo","graph","solutions","near IT Park"};
		ConstructArray ca=new ConstructArray(a,str);
     	ca.printArray();
     	

	}

}

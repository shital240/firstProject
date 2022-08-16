package com.codeo.arrays;

public class Arrays6 {
	
	Arrays6 arr1;//null
	Arrays6 arr2;//null

	
	public Arrays6(Arrays6 arr1, Arrays6 arr2) {
		super();
		this.arr1 = arr1;
		this.arr2 = arr2;
	}
	public void printObject() {
		System.out.println(arr1+" "+arr2);
	}


	public Arrays6() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		
		Arrays6 arr=new Arrays6();
		Arrays6 arr1=new Arrays6();
	  Arrays6 arr2=new Arrays6(arr, arr1);
		arr2.printObject();
      
	}

}

package com.codeo.wrapper;

public class WrapperConcept {

	public static void main(String[] args) {
		String str="2000";
	
		String s="2000";
		s=s+str;
		System.out.println(s);
		//Unboxing
		//Converting Object to primitive type
		int y=Integer.parseInt(str); //y=2000
		int z=5;
		z=z+y;  //5=5+2000==> z=2005
		System.out.println(z);
		// converting primitive type to Object
		int a=20; //primitive type
		Integer i=Integer.valueOf(a);//converting int into Integer
		Integer j=a;//auto boxing, now compiler will write Integer.valueOf(a) internally  
		System.out.println("The value will be "+j+" "+i);


	}

}

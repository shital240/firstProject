package com.codeo.wrapper;

public class Conversion {

	public static void main(String[] args) {
		//Primary Data type==> Wrapper class Object
	String str="300";
	String str1="300";
	String str2="56.876";
	String str3="4873.323";
	int a;
	String add=str+str1;
	System.out.println("Addition of Strings: "+add);
	a=Integer.valueOf(str)+Integer.valueOf(str);
	double b=Double.valueOf(str3)+Double.valueOf(str2);	System.out.println(a);
	
	System.out.println(b);
	System.out.println(a);
	
	}

}

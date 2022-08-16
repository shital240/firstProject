package com.codeo.demo;

public class TypesOfMethods {
	//void method means it will never return anything
	public void answer() {
		System.out.println("please provide me answer");
	}
	public int addition(int a,int b,int c) {
		//it will return by default 0
		int d=0;
		d=a+b+c;
		return d;
		
	}
	/*
	 * public StringBuffer reverseString() { String str="welcome to codeograph";
	 * StringBuffer sb=new StringBuffer(str); return sb.reverse(); }
	 */
	
	public String concatinate() {
		//It will return null by default
		String str="codeo"+"1";
		return str;
		
	}
	public boolean sendResults(int n) {
		if(n%2==0) {
			System.out.println("true");
		}
		return false;
		
	}

	public static void main(String[] args) {
		TypesOfMethods top=new TypesOfMethods();
		top.answer();
		System.out.println(top.addition(1,2,4));
		//System.out.println(top.reverseString());
		System.out.println(top.concatinate());
		System.out.println(top.sendResults(2));

	}

}

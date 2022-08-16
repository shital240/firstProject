package com.codeo.string;

public class StringBasics2 {

	public static void main(String[] args) {
		String str1="codeo";
		String str2="graph";
		String str3="codeo";
		String str4="codeograph";
		String str5=str1+str2;
		//Note:(==) is used for object comparison
		if(str1==str3) {
			System.out.println("Object is same");
		}
		else {
			System.out.println("Object is different");
		}
		//(equals() method is used for content comprarison)
		if(str1.equals(str4)) {
			System.out.println("Content is same");
		}
		else {
			System.out.println("Content is different");
		}

	}

}

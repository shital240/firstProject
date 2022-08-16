package com.codeo.string;

public class StringBasics3 {

	public static void main(String[] args) {
		String str="codeo";
		String str1="graph";
		String str2="dEoCo";
		System.out.println(str.concat(str1));
		System.out.println(str.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str.charAt(3));
		//remaining portion
		//System.out.println(str1.compareTo(str));
        System.out.println(str2.indexOf('O'));
        System.out.println(str1.length());
        System.out.println(str.isEmpty());
        System.out.println(str.replace('o','c'));
        System.out.println(str.replaceAll(str1, str2));
       System.out.println(str.getBytes());
    // substring 
    		System.out.println(str.substring(3));
    		System.out.println(str.substring(2, 4));
	}

}

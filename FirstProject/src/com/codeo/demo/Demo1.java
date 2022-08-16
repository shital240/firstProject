package com.codeo.demo;

import java.util.Scanner;

public class Demo1 {
	int a;
	String b;
	double c;
	boolean e;

	public static void main(String[] args) {
	int countn=0,counte=0,counto=0;
		for(int i=0;i<=10;i++) {
			
			if(i<=10) {
				countn=countn+i;
			}
			 if(i%2==0) {
				counte=counte+i;
			}
			else {
				counto=counto+i;
			}
		}
		System.out.println(counto);
		System.out.println(counte);
		System.out.println(countn);
		
	}
}

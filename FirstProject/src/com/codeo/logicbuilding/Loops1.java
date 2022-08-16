package com.codeo.logicbuilding;

public class Loops1 {

	public static void main(String anish[]) {
	
		for(int i=1;i<=10;i++) {
			System.out.println("2*"+i+"="+(2*i));
		}
		//i=11;11<=10==> false 
		for(int i=1;i<=10;i++) {
			System.out.println(+(2*i));
		}
		for(int i=10;i>0;i--) {
			//i=9;9>0
			//i=0;0>0==> false==> for loop break
			System.out.println("2*"+i+"="+(2*i));
		}
		

	}

}

package com.codeo.logicbuilding;

public class Loop4 {

	public static void main(String[] args) {
		/*
		 * 1. Addition of Natural Numbers 1==>10 
		 * 2. Addition of Even Numbers 1==>10
		 *  3.
		 * Addition of Odd Numbers 1==>10
		 */
		int count=0;
		int counteven=0;
		int countodd=0;
	
		for(int i=1;i<=10;i++) {
			//1
			//1+2==>3
			//3+3==>6
			count=count+i;
			//0==>0+1==> count=1
			//1==>1+2==> count=3
			if(i%2==0) {
				counteven=counteven+i;
			}
			else {
				countodd=countodd+i;
			}
		}
		
		System.out.println("Sum of the digits 1==> 10 will be :"+count);
	    //10+8+6+4+2==> even number
		System.out.println(" Addition of Even Numbers 1==>10: "+counteven);
	    System.out.println(" Addition of Odd Numbers 1==>10: "+countodd);
	}

}

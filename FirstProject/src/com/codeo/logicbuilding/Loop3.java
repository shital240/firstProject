package com.codeo.logicbuilding;

public class Loop3 {

	//write a program to add number between 1==>10
	public static void main(String[] args) {
	//1+2+3...+10
		int count=0;
		for(int i=1;i<=10;i++) {
			//==>0=0+1==. count=1
			//1+2==>3     count=3
			//3+3==>6
			count=count+i;
			//0==>0+1==> count=1
			//1==>1+2==> count=3
		}
		
		System.out.println("Sum of the digits 1==> 10 will be :"+count);
	}

}

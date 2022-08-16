package com.codeo.logicbuilding;

public class Concept1 {

	public static void main(String[] args) {
		int a=10;
		for(int i=0;i<3;i++) {
			a--;
		}
		System.out.println(a);//7
		//unary operators:
		//which is used for increment and decrement
		System.out.println(a++);//7
		System.out.println(++a);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(""+a--);
		System.out.println(+a);
		System.out.println(-a);
		System.out.println("===============");
		System.out.println(a++ + ++a);
		System.out.println(a++ - --a);

	}

}

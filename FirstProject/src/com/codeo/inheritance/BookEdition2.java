package com.codeo.inheritance;
//child class
public class BookEdition2 extends BookEdition1 {

	@Override
	public void bookEdition() {
		System.out.println("Updated edition of POSM Book");
	}
	public void welcomePage() {
		System.out.println("Welcome to POSM book");
	}
}

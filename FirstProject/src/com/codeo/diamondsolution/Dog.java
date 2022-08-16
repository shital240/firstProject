package com.codeo.diamondsolution;
//Parent class
public interface Dog {
//as per last discussion
//	public void move();a
	
	default void move() {
		System.out.println("Dog is Moving");
	}
	static void animalVoice() {
		System.out.println("Dog is barking");
	}
}

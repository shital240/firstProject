package com.codeo.diamondsolution;

public interface Fish {

	default void move() {
		System.out.println("Fish is Moving");
	}
}

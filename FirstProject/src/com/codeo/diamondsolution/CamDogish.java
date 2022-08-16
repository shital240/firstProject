package com.codeo.diamondsolution;

public class CamDogish implements Dog,Fish,Camel {

	@Override
	public void move() {
		Dog.super.move();
	    Dog.animalVoice();
		Fish.super.move();
		Camel.super.move();
	}

}

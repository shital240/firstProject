package com.codeo.abstracts;

public abstract class MobileTower {

	//abstract method==> only declaration
	abstract void mobileOutgoingCall();
	abstract void mobileIncommingCall();
	abstract void mobileTariffRate(double rate);
	//Non_Abstract Method
	//concrete methods==> with defination
	 void specialOffers() {
		System.out.println("Special offers for Customer");
	}
	static void myMethod() {
		 System.out.println("I am a static method");
	 }
}

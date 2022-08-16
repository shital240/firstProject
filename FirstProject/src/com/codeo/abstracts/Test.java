package com.codeo.abstracts;

public class Test {

	public static void main(String[] args) {
		//We can't create object of Abstract class
		MobileTower jio=new Jio();//polymorphism
		jio.mobileIncommingCall();
		jio.mobileOutgoingCall();
		jio.mobileTariffRate(149);
		//MobileTower.myMethod();
		Airtel airtel=new Airtel();
		airtel.specialOffers();
		airtel.mobileIncommingCall();
		
		

	}

}

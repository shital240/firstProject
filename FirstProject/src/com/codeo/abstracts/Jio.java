package com.codeo.abstracts;

public class Jio extends MobileTower{

	@Override
	void mobileOutgoingCall() {
	System.out.println("Outgoing call by Jio");
		
	}

	@Override
	void mobileIncommingCall() {
		System.out.println("Incomming call from JIo");
		
	}

	@Override
	void mobileTariffRate(double rate) {
		double basicmobilerate=0;
		basicmobilerate=rate+(9*rate/100);
		System.out.println("Mobile Tariff of Jio will be: "+basicmobilerate);
		
	}

}

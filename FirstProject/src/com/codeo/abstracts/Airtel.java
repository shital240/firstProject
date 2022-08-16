package com.codeo.abstracts;

public class Airtel extends MobileTower{

	@Override
	void mobileOutgoingCall() {
		System.out.println("Outgoing call from Airtel");
		
	}

	@Override
	void mobileIncommingCall() {
		System.out.println("Incomming call from Airtel");
		
	}

	@Override
	void mobileTariffRate(double rate) {
	double basicmobilerate=0;
	basicmobilerate=rate+(9*rate/100);
	System.out.println("Mobile Tariff will be: "+basicmobilerate);
		
	}
	

}

package com.codeo.abstracts;

public class DTDC extends Amazon{
     //1,2
	public DTDC(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	void DeliverTheProduct() {
		System.out.println("DTDC Delivers product within 5 Working days");
		
	}

	@Override
	void EasyReturns() {
		System.out.println("Easy return policy by DTDC within 15 Days");
		
	}
	
	public void FastCourier() {
		System.out.println("Courier within 24 hours by DTDC");
	}

	@Override
	void courierCharges(double charges) {
		
		double couriercharges=0;
		couriercharges=charges+(18*charges/100);
		System.out.println("Courier charges by DTDC will be: "+couriercharges);
		
	}

}

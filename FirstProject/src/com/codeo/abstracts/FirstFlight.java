package com.codeo.abstracts;

public class FirstFlight extends Amazon {

	public FirstFlight() {
		
	}
	public FirstFlight(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	void DeliverTheProduct() {
		System.out.println("Delivery by FirstFlight within  5 Days");
		
	}

	@Override
	void EasyReturns() {
		System.out.println("Easy return policy by First Flight  within 5 Days");
	}

	@Override
	void courierCharges(double charges) {
		
		double couriercharges=0;
		couriercharges=charges+(18*charges/100);
		System.out.println("Courier charges by First Flight will be: "+couriercharges);
		
	}
}

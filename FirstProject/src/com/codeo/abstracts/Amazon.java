package com.codeo.abstracts;
//We can't create object of Abstract class
public abstract class Amazon {
	
	int a;
	int b;
	
	public Amazon() {
		
	}
	//1,2
public Amazon(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
//we have to declare abstract method 
	abstract void DeliverTheProduct();
	abstract void EasyReturns();
	abstract void courierCharges(double charges);
	
	//non abstract or concrete method
	
	public void PrimeDelivery() {
		System.out.println("Prime delivery within 2 Days: ");
	     System.out.println(a+b);
	}
	
	public void FastCourier() {
		System.out.println("Fast courier by amazon");
	}
	

}

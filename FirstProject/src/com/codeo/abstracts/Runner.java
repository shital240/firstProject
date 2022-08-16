package com.codeo.abstracts;

import com.codeo.interfaces.Bank;
import com.codeo.interfaces.StateBankOfIndia;

public class Runner {

	public static void main(String[] args) {
		
		Amazon dtdc=new DTDC(1,2);//polymorphism
		dtdc.DeliverTheProduct();
		dtdc.EasyReturns();
		dtdc.PrimeDelivery();
		dtdc.FastCourier();
		dtdc.courierCharges(150);
		Amazon firstflight=new FirstFlight();
		firstflight.courierCharges(200);
		

	}

}

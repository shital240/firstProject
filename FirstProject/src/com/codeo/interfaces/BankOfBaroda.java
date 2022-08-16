package com.codeo.interfaces;

public class BankOfBaroda implements Bank {

	

	@Override
	public void rateOfInterst() {
		System.out.println("Rate of Interst on saving account will be: 4%");
		}

	@Override
	public void rateOfInterstOnFD() {
		
		System.out.println("Rate of Interst on Fixed Deposite will be: 9%");
	}

	@Override
	public void depositeCheque() {
		System.out.println("Any Bank cheque will be acceptable ");
		
	}

}

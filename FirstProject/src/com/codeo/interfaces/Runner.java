package com.codeo.interfaces;

public class Runner {

	public static void main(String[] args) {
	 Bank sbi=new StateBankOfIndia();
	 sbi.rateOfInterst();
	 
	 Bank kotak=new KotakMahindra();
	 kotak.rateOfInterst();
	 
	 Bank bankOfBarodara=new BankOfBaroda();
	 bankOfBarodara.depositeCheque();
	 bankOfBarodara.rateOfInterstOnFD();
	 bankOfBarodara.rateOfInterst();

	}

}

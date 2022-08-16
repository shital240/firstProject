package com.codeo.accessmodifier;

public class Ferm {

	public static void main(String[] args) {
		Merchant m1=new Merchant();
		System.out.println(m1.merchant_id+" "+m1.merchant_name);
        m1.displayMessage();
        m1.displayText();
        Consumer c1=new Consumer(1,"sudarshan",2323.32);
		System.out.println(c1.Consumer_id+" "+c1.Consumer_name);
	}

}

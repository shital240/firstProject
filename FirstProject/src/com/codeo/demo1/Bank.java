package com.codeo.demo1;

public class Bank {

	long BankAccountno;
	String person_name;
	double amount;
	static String IFSC="SBIN0008823";
	
	
	static {
		System.out.println("Welcome to SBI Branch 2");
	}
	{
		System.out.println("I am non static Block");
	}
	public Bank(long bankAccountno, String person_name, double amount) {
		super();
		this.BankAccountno = bankAccountno;
		this.person_name = person_name;
		this.amount = amount;
		
	}


	static public  void main(String[] args) {
		
    Bank b1=new Bank(2131231,"sudarshan",100000.32);
    b1.main1("sudarshan");
    Bank b2=new Bank(2131233,"darshan",103000.32);
    System.out.println(b1.BankAccountno+" "+b1.person_name+" "+b1.IFSC);
    System.out.println(b2.BankAccountno+" "+b2.person_name+" "+Bank.IFSC);
    
	}
	static {
		System.out.println("Welcome to SBI Branch 1");
	}
	static public  void main1(String string) {
		System.out.println("fake main method");
	}

}

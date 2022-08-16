package com.codeo.exceptions;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Sbi {
	
	int atmpin;//3434==>3400
	double amount,cashremaining;
	double bankBalance;//25000
	int date,month,year;
	int hour,minute,seconds;
	String person_name;//Dinesh
	//3434,25000,"Dinesh"
	//3400,27000,"Sudarshan"
	public Sbi(int atmpin, double bankBalance, String person_name) {
		super();
		this.atmpin = atmpin;
		this.bankBalance = bankBalance;
		this.person_name = person_name;
	}
	static {
		System.out.println("Welcome to SBI ATM Services");
	}
	public void useAtmMachine() {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 Digit Pin: ");
		int pin=sc.nextInt();
		
		try {
			if(pin==atmpin) {
				System.out.println("Welcome to your account MR. "+person_name);
			}
			else {
				System.out.println("Invalid pin is inserted");
			     throw new InvalidpinException();
			}
			System.out.println("Enter amount to be withdrawn: ");
		     double amount=sc.nextDouble();   
		     if(amount<=bankBalance) {
		    	 cashremaining=bankBalance-amount;
		    	 System.out.println("Your remaining balance will be: "+cashremaining);
		     }
		     else {
		    	 System.out.println("Insufficient Bank Balance");
		           throw new InsufficientBankBalance();
		     }
		}
		
		catch(InvalidpinException e1) {
			e1.printStackTrace();
		}
		catch( InsufficientBankBalance e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		finally {
			System.out.println("Thanks for using SBI ATM Services");
			Calendar gc=new GregorianCalendar();//polymorphism
			date=gc.get(GregorianCalendar.DATE);
			month=gc.get(GregorianCalendar.MONTH);
			year=gc.get(GregorianCalendar.YEAR);
			hour=gc.get(GregorianCalendar.HOUR);
			minute=gc.get(GregorianCalendar.MINUTE);
			seconds=gc.get(GregorianCalendar.SECOND);
			System.out.println(date+"/"+month+"/"+year);
			System.out.println(hour+":"+minute+":"+seconds);
			
		}
	}
	public static void main(String[] args) {
       Sbi sbi1=new Sbi(3434,25000,"Dinesh");
       sbi1.useAtmMachine();
		/*
		 * Sbi sbi2=new Sbi(3400,27000,"Sudarshan"); sbi2.useAtmMachine();
		 */
       //cntrl +shift + /
	}

	

}

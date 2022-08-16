package com.codeo.string;

import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class StringReceipt {
// Math class: this class is used for arithmetic 
	//operations
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		
		System.out.println("Addition will be: "+Math.addExact(x, y));
		// captca , Receipt, 
		System.out.println("Power function"+Math.pow(x, y));
		System.out.println("Square root"+ Math.sqrt(9));
		System.out.println("Generate Random no"+Math.random());
		Random r=new Random();
		int z=r.nextInt(10000);
		System.out.println(z);
		//random value will be 0 to 10000
		GregorianCalendar date = new GregorianCalendar();
		
		int day=date.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println(day);
		int hour=date.get(GregorianCalendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		z=z+day+hour;
		System.out.println("random value using random class: "+z);
		System.out.println("time will be : "+date.getTime());
	}
}

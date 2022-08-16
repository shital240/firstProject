package com.codeo.wrapper;

import java.util.Scanner;

public class FormDetails {

	public void calculateSimpleInterst(String principal,String tenure, String rateOfInterst) {
		double Principal=Double.valueOf(principal);
		double Tenure=Double.valueOf(tenure);
		double RateOfInterst=Double.valueOf(rateOfInterst);
		double simpleInterst=(Principal*Tenure*RateOfInterst)/100;
		System.out.println("Calculated Simple Interst will be:"+simpleInterst);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount");
		//double principal=sc.nextDouble();
		String principal=sc.next();
		System.out.println("Enter tenure: ");
		String tenure=sc.next();
		System.out.println("Enter Interest rate:");
		String rateOfInterst=sc.next();
		FormDetails calculation=new FormDetails();
          calculation.calculateSimpleInterst(principal,tenure,rateOfInterst);
	}

}

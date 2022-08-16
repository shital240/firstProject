package com.codeo.demo1;

import java.util.Scanner;

public class MethodStat {

	public static void MakeMyTrip() {
		System.out.println("Ticket will be 300");
	}
 public static void Yatra() {
	System.out.println("Ticket will be 250");
	}
	
	public static void TicketBooking(String website) {
		if(website.equals("makemytrip")) {
			MethodStat.MakeMyTrip();
		}
		else if(website.equals("Yatra")) {
		MethodStat.Yatra();
		}
		else {
			System.out.println("Please enter proper Input");
		}
	}
	public static void main(String[] args) {
		//MethodStat mmt=new MethodStat();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ticket website");
		String ticketwebsite=sc.next();
		MethodStat.TicketBooking(ticketwebsite);
		Yatra();

	}

}

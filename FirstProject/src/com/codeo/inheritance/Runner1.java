package com.codeo.inheritance;

public class Runner1 {

	public static void main(String[] args) {
		Indigo i=new Indigo();
		i.getTicketFromAirport();
		MakeMyTrip mmt=new MakeMyTrip();
		mmt.getTicketFromMMT();
		Yatra y=new Yatra();
		y.getTicketFromYatra();

	}

}

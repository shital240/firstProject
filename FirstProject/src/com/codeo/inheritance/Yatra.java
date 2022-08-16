package com.codeo.inheritance;

public class Yatra extends Indigo {

	public void getTicketFromYatra() {
		double ticket_rate=Indigo.ticket_rate-(5*Indigo.ticket_rate/100);
		System.out.println("Yatra ticket fair from "+Indigo.ticket_from +" will be: "+ticket_rate);
	}
}

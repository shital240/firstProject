package com.codeo.inheritance;

public class MakeMyTrip extends Indigo {

	public void getTicketFromMMT() {
		double ticket_rate=Indigo.ticket_rate-(10*Indigo.ticket_rate/100);
		System.out.println("MMT ticket fair from "+Indigo.ticket_from +" will be: "+ticket_rate);
	}
}

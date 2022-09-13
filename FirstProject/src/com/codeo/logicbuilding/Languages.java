package com.codeo.logicbuilding;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Languages {

	public static void main(String[] args) {
		Locale l1 = Locale.FRANCE;
		System.out.println(l1.getLanguage());
		System.out.println(l1.getCountry());
		
		Locale l2 = Locale.US;
		System.out.println(l2.getLanguage());
		System.out.println(l2.getCountry());

		Locale l3 = Locale.ITALY;
		System.out.println(l3.getLanguage());
		System.out.println(l3.getCountry());
		
		Locale l4 = Locale.GERMANY;
		System.out.println(l4.getLanguage());
		System.out.println(l4.getCountry());
		
		Locale l5 = Locale.UK;
		System.out.println(l5.getLanguage());
		System.out.println(l5.getCountry());
        Date date = new Date();
		
		DateFormat format1 = DateFormat.getDateInstance(DateFormat.DEFAULT);
		System.out.println(format1.format(date));
		
		DateFormat format2 = DateFormat.getDateInstance(DateFormat.DATE_FIELD,Locale.FRANCE);
		System.out.println(format2.format(date));
		
		DateFormat format3 = DateFormat.getDateInstance(DateFormat.FULL,Locale.ITALY);
		System.out.println(format3.format(date));
		
		DateFormat format4 = DateFormat.getDateInstance(DateFormat.FULL,Locale.CHINESE);
		System.out.println(format4.format(date));	
	}
}

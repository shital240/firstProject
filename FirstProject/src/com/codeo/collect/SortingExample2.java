package com.codeo.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingExample2 {

	public static void main(String[] args) {
		//Hetrogenous different type of elments
		
	ArrayList<Merchant> list=new ArrayList<>();
	list.add(new Merchant(13,"Akshay",75020));
	list.add(new Merchant(13,"Akshay",75000));
	list.add(new Merchant(14,"Rajat",75658));
	list.add(new Merchant(15,"Nagendra",75200));
	list.add(new Merchant(16,"Dellendra",7500));
	list.add(new Merchant(11,"Sudarshan",79789));
	list.add(new Merchant(12,"Meghana",75088));
	list.add(new Merchant(13,"Abhishek",74000));
	list.add(new Merchant(13,"Sudarshan",72000));
	
    
      Collections.sort(list, Comparator.comparing(Merchant::getMerchant_id).thenComparing(Merchant::getMerchant_income));
      for(Merchant e:list) {
    	 System.out.println(e.merchant_id+" "+e.merchant_name+" "+e.merchant_income);
      }
      System.out.println("==========================");
    list.sort(Comparator.comparing(Merchant::getMerchant_name).thenComparing(Merchant::getMerchant_income));
    for(Merchant e:list) {
    	System.out.println(e.merchant_id+" "+e.merchant_name+" "+e.merchant_income);
    }
    System.out.println("==========================");
    list.sort(Comparator.comparing(Merchant::getMerchant_income).thenComparing(Merchant::getMerchant_income));
    for(Merchant e:list) {
    	System.out.println(e.merchant_id+" "+e.merchant_name+" "+e.merchant_income);
    }
	}

}

package com.codeo.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingExample2 {

	public static void main(String[] args) {
		//Hetrogenous different type of elments
	ArrayList<Merchant> list=new ArrayList<>();
	list.add(new Merchant(13,"Akshay",75000));
	list.add(new Merchant(14,"Rajat",75658));
	list.add(new Merchant(15,"Nagendra",75000));
	list.add(new Merchant(16,"Dellendra",75000));
	list.add(new Merchant(11,"Sudarshan",79789));
	list.add(new Merchant(12,"Meghana",75000));

      Collections.sort(list, Comparator.comparing(Merchant::getMerchant_id).thenComparing(Merchant::getMerchant_income));
      for(Merchant e:list) {
    	  System.out.println(e.toString());
      }
      System.out.println("==========================");
    list.sort(Comparator.comparing(Merchant::getMerchant_id).thenComparing(Merchant::getMerchant_name));
    for(Merchant e:list) {
  	  System.out.println(e.toString());
    }
	}

}

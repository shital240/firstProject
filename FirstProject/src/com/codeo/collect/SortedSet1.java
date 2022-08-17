package com.codeo.collect;

import java.util.ArrayList;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {
//Duplicates are not allowed 
	//Objects are getting sorted
	public static void main(String[] args) {
		try {
		SortedSet list=new TreeSet();
		
	        list.add(1);
	       list.add(2);
	       list.add(9);
	       list.add(3);
	       list.add(9);
	       list.add(4);
	       list.add(5);
	       
	       list.add(4);
	       System.out.println(list);
		}
		catch(ClassCastException e) {
			e.printStackTrace();
			System.out.println("Please enter similar type of Objects");
		}
		SortedSet<Merchant> list1=new TreeSet<>();
		list1.add(new Merchant(13,"Akshay",75000));
		list1.add(new Merchant(14,"Rajat",75658));
		list1.add(new Merchant(15,"Nagendra",75000));
		list1.add(new Merchant(16,"Dellendra",75000));
		list1.add(new Merchant(11,"Sudarshan",79789));
		list1.add(new Merchant(12,"Meghana",75000));
		for(Merchant e:list1) {
	    	  System.out.println(e.toString());
	      }
	}

}

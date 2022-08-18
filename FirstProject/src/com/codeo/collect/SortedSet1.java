package com.codeo.collect;

import java.util.ArrayList;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {
//Duplicates are not allowed 
	//Objects are getting sorted
	public static void main(String[] args) {
	//SortedSet==> Interface
		//TreeSet==> Class
		SortedSet list=new TreeSet();
		     
	        list.add(1);
	        list.add(10);
	       list.add(2);
	       list.add(9);
	       list.add(3);
	       list.add(9);
	       list.add(4);
	       list.add(5);
	        list.add(4);
	        list.add(4);
		       list.add(5);
		        list.add(4);
	       System.out.println(list);
	     	SortedSet<String> set=new TreeSet<>();
	     	set.add("zukerberg");
	     	set.add("anderson");
	     	set.add("sthiphen");
	     	set.add("matt");
	     	set.add("hooper");
	     	set.add("anderson");
	     	set.add("sthiphen");
	     	set.add("matt");
	     	try {
	     	set.add(null);
	     	}
	     	catch(NullPointerException e) {
	     		e.printStackTrace();
	     	}
	     	System.out.println(set);
	}
		
	}



package com.codeo.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		 List list1=new ArrayList();
	       list1.add("codeo");
	       list1.add("graph");
	       list1.add("Solutions");
	       list1.add("nagpur");
	       list1.add(String.valueOf(3));
	    
	       Collections.sort(list1);
	       System.out.println(list1);
	       
	       
	       List<Integer> list=new LinkedList<>();
	       list.add(1);
	       list.add(2);
	       list.add(3);
	       list.add(9);
	       list.add(4);
	       list.add(5);
	       Collections.sort(list);
	       System.out.println(list);
	       
	       //Comparable Interface
	       //Note: To perform sorting operation internally JVM 
	       //uses compareTo() Method
	       // codeo codeo = 0 no change

	}

}

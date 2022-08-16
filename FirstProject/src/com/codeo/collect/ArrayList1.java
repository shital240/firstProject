package com.codeo.collect;


import java.util.Collections;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		List list1=new ArrayList();
		list1.add(1);
		list1.add(2323.232);
		list1.add("sudarshan");
		list1.add(true);
		System.out.println(list1);
	// ArrayList allows duplicate Object
		List<Integer> list=new ArrayList<>(); //polymorphism
		list.add(Integer.valueOf("9"));
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(null);
		list.add(3, 4);
		System.out.println(list);
		list.remove(3);
		list.remove(1);
		System.out.println("After removing object: "+list);
	    list.removeAll(list);
	    System.out.println(list);
		
		 
		
	
		
		

	}

}

package com.codeo.collect;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		
		list.add("A");
		list.add("A");
		list.add(null);
		list.add(null);
		list.addFirst("First");
		list.addLast("Last");
		list.add(0, "probablity");
		System.out.println("Orignal Content: "+list);
		list.removeFirst();
		System.out.println(list);
       System.out.println(list.isEmpty());
	}

}

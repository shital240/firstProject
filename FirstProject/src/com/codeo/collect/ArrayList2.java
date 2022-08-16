package com.codeo.collect;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		//for Hetrogenous elements
		List arr=new ArrayList();
		arr.add(1);
		arr.add("sudarshan");
		arr.add(null);
		arr.add(true);
		arr.add(232321.32);
		System.out.println(arr);
       //homogenous arrayList 
		//for homogenous arraylist you have to use generics
		List<Integer> list1=new ArrayList<>();

		list1.add(1);
		list1.add(Integer.parseInt("12"));
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		System.out.println("Capacity: "+list1);
		//traditional for loop
		for(int i=0;i<=list1.size()-1;i++) {
			System.out.println("By traditional for loop: "+list1.get(i));
		}
		//for each loop
		for(int i:list1) {
			System.out.println("By for each loop: "+i);
		}
		
		List<String> list=new ArrayList<String>();
		list.add("codeo");
		list.add("graph");
		list.add("solutions");
		list.add("IT Park");
		for(String xyz: list) {
			System.out.println(xyz);
		}
		
		
	
	}

}

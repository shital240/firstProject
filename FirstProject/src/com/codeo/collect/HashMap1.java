package com.codeo.collect;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
//Map:==>Interface
//HashMap:==> Class
	public static void main(String[] args) {
		//Map<Key,Value>, 
		Map<Integer,String> map=new HashMap<>();
		//Map doesnot allows duplicates.
		//It allows null value but duplicate null's are not allowed
		map.put(1,"akshay");
		map.put(1, "sudarshan");
		map.put(1, "harish");
		map.put(Integer.parseInt("4"), "akshay");
		map.put(3, "yash");
		map.put(9, null);
		map.put(2, "harish");
		map.put(3, "yash");
		System.out.println(map);
		/*
		 * for(int i=0;i<map.size();i++) { System.out.println(map.get(i)); }
		 */
		
		
		Collection<String> values=map.values();
		//values.add("sudarshan1");
		System.out.println(values);
		
	}

}

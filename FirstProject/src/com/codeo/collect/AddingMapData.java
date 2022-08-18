package com.codeo.collect;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AddingMapData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<>();
		//Map doesnot allows duplicates.
		//It allows null value but duplicate null's are not allowed
		map.put(1, "sudarshan");
		map.put(2, "akshay");
		map.put(3, "yash");
		map.put(9, null);
		map.put(2, "akshay");
		map.put(3, "yash");
		System.out.println(map);
		//by using constructor
		Map<Integer,String> map1=new HashMap<>(map);
		map1.put(10, "sudarshan");
		map1.put(11, "Sneha");
		map1.put(13, "Ambika");
		System.out.println("After adding objects: "+map1);
		//by using putAll() to add the data many to one
		System.out.println("=================================");
        Map<String,Integer> map4=new LinkedHashMap<>();
        map4.put("codeo", 1);
        map4.put("graph", 2);
        map4.put("solutions", 3);
        Map<String,Integer> map3=new LinkedHashMap<>();
        map3.put("code", 1);
        map3.put("graphy", 2);
        map3.put("solution", 3);
        LinkedHashMap<String,Integer> finalmap=new LinkedHashMap<String, Integer>();
	    finalmap.putAll(map3);
	    finalmap.putAll(map4);
	    System.out.println(finalmap);
	}

}

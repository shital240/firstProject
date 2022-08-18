package com.codeo.collect;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
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
		
		Collection<String> values=map.values();
		values.add(null);
		System.out.println(values);
		
	}

}

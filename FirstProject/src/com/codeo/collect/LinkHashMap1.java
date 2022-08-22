package com.codeo.collect;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkHashMap1 {

	public static void main(String[] args) {
	HashMap<String,Double> hashmap=new LinkedHashMap<>();
	hashmap.put(String.valueOf(12), Double.parseDouble("12"));
	hashmap.put("Codeo", (double) 12);
   System.out.println(hashmap);
	}

}

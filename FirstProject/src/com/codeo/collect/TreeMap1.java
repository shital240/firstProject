package com.codeo.collect;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap1{
	//In sorted map duplicates are not allowed
	//sorting will be based on key pair
	public static void main(String[] ar) {
		SortedMap<Double,String> sortedmap=new TreeMap<>();
		sortedmap.put(Double.parseDouble("13"), "zudio");
		sortedmap.put((double) 12,"dbc");
		sortedmap.put((double) 12,"bbc");
		sortedmap.put(232.32, "graph");
		sortedmap.put((double) 232.32, "graph");
		sortedmap.put(1.0, null);
		sortedmap.put(0.0,null);
		
		
		System.out.println(sortedmap);
	}

}

package com.codeo.collect;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap3 {

	public static void main(String[] args) {
		SortedMap<String,Integer> sortedmap=new TreeMap<>();
       sortedmap.put("zudio", 1);
       sortedmap.put("pennylsolutions", 3);
       sortedmap.put("zudio", 1);
       sortedmap.put("graph", 2);
       System.out.println(sortedmap);
       
	}

}

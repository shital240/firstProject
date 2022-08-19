package com.codeo.collect;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
//Map==> Base Interface
//SortedMap==> Derieved Interface
//TreeMap==> Class
public class TreeMap2 {
	
	
	public static void main(String args[]) {
		
		Map<Double,String> sortedmap=new TreeMap<>();
		
		sortedmap.put(Double.parseDouble("13"), "zudio");
		sortedmap.put((double) 12,"dbc");
		sortedmap.put((double) 12,"bbc");
		sortedmap.put(232.32, "graph");
		sortedmap.put((double) 232.32, "graph");
		sortedmap.put(1.0, null);
		sortedmap.put(2.0,null);
		
		
		System.out.println(sortedmap);
		
		TreeMap<Double,String> treemap=new TreeMap<Double, String>(sortedmap);
		treemap.put(1.0, "sudarshan");
		treemap.put(2.0, "codeogrpah");
		System.out.println("Adding <Double,String> Objects: "+treemap);
	}

}

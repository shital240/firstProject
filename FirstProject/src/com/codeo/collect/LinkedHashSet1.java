package com.codeo.collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSet1 {
//how to convert List data to set data
	//Note: In hashset if we are inserting duplicates first object 
	//will be inserted next objects are ignored
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> hash=new LinkedHashSet<>();
		hash.add("codeo");
		hash.add("codeo");
		hash.add("graph");
		hash.add("solutions");
		System.out.println(hash);
		//conversion of List data into set
		List<String> names=new ArrayList<>();
		names.add("codeo");
		names.add("codeo");
		names.add("codeo");
		names.add(null);
		names.add(null);
		names.add("graph");
		names.add("solutions");
		System.out.println("ArrayList: "+names);
		HashSet<String> orignalnames=new HashSet<String>(names);
		System.out.println("HashSet: "+orignalnames);
		
	}

}

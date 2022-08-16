package com.codeo.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList5 {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();  
		list1.add("solutions");
		list1.add("codeo");
	    list1.add("Graph");
	    list1.add("IT company");
	    list1.add("Block Chain solutions");
	    
	    
	      Collections.sort(list1); 
	      ArrayList<String> list=new ArrayList<>();
	       list.add("aaa");
	       list.add("bbb");
	       list.addAll(list1);
	      
	       System.out.println("List after adding objects from another list"+list);
	      System.out.println(list1);

	}

}

package com.codeo.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList3 {
//how to convert arrays(String) into collection
	//Arrays.asList()
	public static void main(String[] args) {
		//step1. Declare String type array
		String arr[]= {"codeo","graph","solutions"};
		ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
       list.add("aaa");
       list.add("bbb");
       list.remove(2);
       System.out.println("Conversion of String array to particular ArrayList"+list);
       System.out.println("===================================");
       //how to convert collection(ArrayList) to String array
       //toArray(args);
       List<String> list1=new ArrayList<>();
       list1.add("codeo");
       list1.add("graph");
       list1.add("solutions");
       
    
       String[]  data=new String[list1.size()];
       list1.toArray(data);
       //for each loop
       for(String xyz: data) {
    	   System.out.println("Conversion of Arraylist to String arr: "+xyz);
       }
       
       
	}

}

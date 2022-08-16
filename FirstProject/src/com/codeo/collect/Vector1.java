package com.codeo.collect;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		System.out.println(v);
         System.out.println(v.capacity());
         
         Vector str=new Vector();
         str.add("codeo");
         str.add("kfdsja");
         str.add("dkfj");
         str.add("codeo");
         str.add("kfdsja");
         str.add("dkfj");
         str.add("codeo");
         str.add("kfdsja");
         str.add("dkfj");
         str.add("codeo");
         str.add("codeo");
      
         System.out.println(str.capacity());
	}

}

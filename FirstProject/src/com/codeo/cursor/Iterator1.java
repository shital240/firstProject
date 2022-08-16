package com.codeo.cursor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<>();
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		System.out.println(v);
         System.out.println(v.capacity());
         Iterator<Integer> e=v.iterator();
         
         while(e.hasNext()) {
        	 int i=e.next();
         	//retrieved even objects
         	if(i%2==1) {
         		e.remove();
         	}
         	if(i%2==1) {
        		System.out.print(i+",");
        	}
         	
         }
         System.out.println("Remaining objects in Vector: "+v);
	}

}

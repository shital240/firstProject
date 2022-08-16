package com.codeo.cursor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

public class EnumerationProcess1 {

	public static void main(String[] args) {
		Vector<Integer> list=new Vector<>();
        for(int i=0;i<=10;i++) {
        	list.add(i);
        }
        System.out.println(list);
        
        Enumeration<Integer> e=list.elements();
        
        while(e.hasMoreElements()) {
        	try {
        	int i=(int) e.nextElement();
        	//retrieved even objects
        	if(i%2!=1) {
        		System.out.print(i+",");
        	}
        	}
        	catch(NoSuchElementException e1) {
        		e1.printStackTrace();
        	}
        }
	}

}

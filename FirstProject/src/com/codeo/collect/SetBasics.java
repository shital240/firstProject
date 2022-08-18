package com.codeo.collect;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetBasics {

	public static void main(String[] args) {
		//Set ==> Interface
		//HashSet ==> Base class
		//LinkedHashSet==> Derieved class of HashSet
		
		HashSet set=new LinkedHashSet();//polymorphism
		set.add(1);
		set.add("codoe");
		set.add(true);
		set.add(1);
		set.add(null);
		set.add(null);
		set.add(443.32);
		set.add("codoe");
		System.out.println(set);

	}

}

package com.codeo.collect;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetBasics {

	public static void main(String[] args) {
		//Set ==> Interface
		//HashSet ==> class
		//LinkedHashSet==> Derieved class of HashSet
		
		Set set=new LinkedHashSet();
		set.add(1);
		set.add("codoe");
		set.add(true);
		set.add(1);
		set.add(null);
		set.add(443.32);
		set.add("codoe");
		System.out.println(set);

	}

}

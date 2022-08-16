package com.codeo.collect;

import java.util.*;


//Taking input from end user and 
//store it into arraylist as an Object
public class ArrayList6 {

	public static void main(String[] args) {
		//Taking Different values from end user store into ArrayList. 
				Scanner scanner = new Scanner(System.in);

				System.out.println("Enter No of Objects for insertion in Arraylist");
				int a=scanner.nextInt();
			    System.out.println("Enter type of Object to be inserted: ");
			    String object_type=scanner.next();
			    if(object_type.equals("Integer")) {
			    	//Taking 5 Integer values from end user store into ArrayList 
					ArrayList<Integer> intobjs = new ArrayList<Integer>();
					for(int i=1;i<=a;i++)
					{	System.out.println("Enter "+i+" value :");
					int value=scanner.nextInt();
						intobjs.add(value);
					}
					//traditional for loop
				     for(int i=0;i<intobjs.size();i++) {
				    	 System.out.println("Value of object "+i+" will be: "+intobjs.get(i));
				     }
			    }
			    else if(object_type.equals("String")) {
			    	ArrayList<String> intobjs = new ArrayList<>();
					for(int i=1;i<=a;i++)
					{	System.out.println("Enter "+i+" value :");
					String value=scanner.next();
						intobjs.add(value);
					}
					//traditional for loop
				     for(int i=0;i<intobjs.size();i++) {
				    	 System.out.println("Value of object "+i+" will be: "+intobjs.get(i));
				     }
			    }
			    else {
			    	System.out.println("Enter Proper Input");
			    }
				

				scanner.close();
	}

}

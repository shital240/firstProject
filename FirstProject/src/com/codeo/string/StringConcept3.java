package com.codeo.string;

public class StringConcept3 {

	public static void main(String[] args) {
		//when new keyword will be there object will be
		//created in Heap Memory
		String str=new String("codeo");
         String str1=new String("codeo");
         String str3=" codeo";
         String str2=new String("codeograph");
         //(equals() method is used for content comprarison)
         if(str1.equals(str3)) {
        	 System.out.println("Content is same");
         }
         else {
        	 System.out.println("content is different");
         }
         //object comparison
         if(str==str3) {
        	 System.out.println("Object is same");
         }
         else {
        	 System.out.println("object is different");
         }
	}

}

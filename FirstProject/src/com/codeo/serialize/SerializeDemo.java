package com.codeo.serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String args[]) {
	  Student e = new Student();
      e.name = "sudarshan";
      e.marks = 98.78;
      e.SSN = 11;
      e.rollno = 101;
      System.out.println(e.SSN);
      Student e1=new Student();
      e1.name="Akshay";
      e1.marks=67;
      e1.rollno=102;
      e1.value=true;
      
      try {
    	  File f=new File("student.ser");
    	  f.createNewFile();
         FileOutputStream fileOut =
         new FileOutputStream(f);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.writeObject(e1);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in /tmp/student.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}

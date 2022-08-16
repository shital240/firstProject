package com.codeo.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		//Student is class Name
		//e will be reference variable
		//type casting concept remaining
		Student e = null;
		Student student1=null;//class type reference variable
	      try {
	         FileInputStream fileIn = new FileInputStream("student.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Student) in.readObject();
	         student1=(Student) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Student class not found");
	         c.printStackTrace();
	         return;
	      }
	      
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.name);
	      System.out.println("marks: " + e.marks);
	      System.out.println("SSN: " + e.SSN);
	      System.out.println("Roll No: " + e.rollno);
	      System.out.println("================================");
	      System.out.println("Deserialized Employee1...");
	      System.out.println("Name: " + student1.name);
	      System.out.println("marks: " + student1.marks);
	      System.out.println("SSN: " +student1.SSN);
	      System.out.println("Roll No: " + student1.rollno);
	      System.out.println("Value will be: "+student1.value);   
	}

	}



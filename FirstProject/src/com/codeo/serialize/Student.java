package com.codeo.serialize;

public class Student implements java.io.Serializable {

	public String name;//null
	   public double marks;//0.0
	   public transient int SSN;//0
	   //Transient variable will not consider in process
	   public int rollno;//0
	   public boolean value;
}

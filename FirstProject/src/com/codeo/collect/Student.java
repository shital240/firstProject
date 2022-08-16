package com.codeo.collect;

import java.util.ArrayList;

public class Student extends Object {

	private int rollno;
	private String name;
	private double marks;
	

	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		
		Student s1=new Student(11,"sudarshan",67);
		Student s2=new Student(12,"siddesh",76);
		Student s3=new Student(13,"Rajat",97);
		//Arraylist acts as a bucket
		// consider 3 objects as balls
		ArrayList<Student> list1=new ArrayList<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		System.out.println(list1);
		//for each loop
		for(Student s: list1) {
			//System.out.println("object references"+s);
			System.out.println(s.rollno+ " "+ s.name+" "+s.marks);
		}
		System.out.println("================================");
		ArrayList<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s2);
		//list.remove(s3);
		//list.removeAll(list);
		System.out.println("List after removal: "+list);
		//list.retainAll(list1);
		//System.out.println("Retrieved list: "+list);
		System.out.println(list.contains(s3));
		System.out.println(list.containsAll(list1));
	
		for(Student sz:list) {
			System.out.println(sz.name+" "+sz.rollno+ " "+ sz.marks);
		}
	}

}

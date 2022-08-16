package com.codeo.demo;

import java.util.Scanner;

public class Student1 {
	
	 int student_rollno;//0==>12==>11,
	String student_name;//null==>Depanshu==>"payal"
	 double student_percent;//0.0==>67.98==>,89.98
	  static String school_name="Somalwar School";
	 public Student1(int student_rollno, String student_name1 , double student_percent) {
			student_name=student_name1;
			this.student_percent=student_percent;
			this.student_rollno=student_rollno;
			System.out.println("Constructor call: "+student_rollno+" "+student_name);
		
		}
	
	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter student rollno: ");
	int roll_no=xyz.nextInt();
	System.out.println("Enter student name: ");
	String name=xyz.next();
	System.out.println("enter student percent: ");
	double percent=xyz.nextDouble();
	Student1 deepanshu=new Student1(roll_no,name,percent);
     System.out.println("Student_details :===========");
     System.out.println(deepanshu.student_rollno+" "+deepanshu.student_name+" "+deepanshu.student_percent);
	}

}

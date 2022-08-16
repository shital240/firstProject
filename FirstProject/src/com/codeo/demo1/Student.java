package com.codeo.demo1;

import java.util.Scanner;

public class Student {
	int student_rollno;//0==>12==>11,
	String student_name;//null==>Depanshu==>"payal"
	 double student_percent;//0.0==>67.98==>,89.98
	  static String school_name="Somalwar School";
	  
	  public Student(int student_rollno, String student_name1 , double student_percent) {
			student_name=student_name1;
			this.student_percent=student_percent;
			this.student_rollno=student_rollno;
			System.out.println("Constructor call: "+student_rollno+" "+student_name);
		
		}

	
	@Override
	public String toString() {
		return "Student [student_rollno=" + student_rollno + ", student_name=" + student_name + ", student_percent="
				+ student_percent +  ", school_name=" +Student.school_name+"]";
	}
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter student rollno: ");
		int roll_no=xyz.nextInt();
		System.out.println("Enter student name: ");
		String name=xyz.next();
		System.out.println("enter student percent: ");
		double percent=xyz.nextDouble();
		Student s=new Student(roll_no,name,percent);
		System.out.println(s);
		//jvm by default calls the toString Method
		
	}

}

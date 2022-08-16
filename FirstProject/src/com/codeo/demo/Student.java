package com.codeo.demo;

//Entry of  50 Students
public class Student {

	int student_rollno;//0==>12==>11,
	String student_name;//null==>Depanshu==>"payal"
	double student_percent;//0.0==>67.98==>,89.98
	
	//constuctor is used to intialize the parameter
	//Jvm Provides you default constructor if you 
	//don't declare any constructor
	Student()
	{
		
	}
	//12,"Depanshu",67.98
	//11,"payal",89.98
	public Student(int student_rollno, String student_name1 , double student_percent) {
		student_name=student_name1;
		this.student_percent=student_percent;
		this.student_rollno=student_rollno;
		System.out.println("Constructor call: "+student_rollno+" "+student_name);
	
	}
	public static void main(String[] args) {
		//default constructor
		Student sudarshan=new Student();
		System.out.println(sudarshan.student_name+" "+sudarshan.student_rollno+ " "+sudarshan.student_percent);
		//parameterized constructor
		Student deepanshu=new Student(12,"Depanshu",67.98);
		System.out.println("StudentName: "+deepanshu.student_name);
		System.out.println("StudentRollno: "+deepanshu.student_rollno);
		System.out.println("StudentPercent: "+deepanshu.student_percent);
		Student payal=new Student(11,"payal",89.98);
		System.out.println("StudentName: "+payal.student_name);
	}

}

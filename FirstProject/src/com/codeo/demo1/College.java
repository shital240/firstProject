package com.codeo.demo1;

public class College{

	int student_id;//11
	String student_name;//sudarshan
	double student_percent;//78.98
	static String student_college="GH Raisoni";
	
	public College(int student_id, String student_name, double student_percent) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_percent = student_percent;
	}

	//Object class Method
	//toString is Predefined Method
	@Override
	public String toString() {
		return " [student_id=" + student_id + ", student_name=" + student_name + ", student_percent="
				+ student_percent + ", College_name=" + College.student_college + "]";
	}


	public static void main(String[] args) {
	
		College c1=new College(11,"sudarshan",78.98);
		System.out.println(c1.toString());
		College c2=new College(12,"akshay",88.98);
		System.out.println(c2);
		College c3=new College(13,"Rishi",79.98);
		System.out.println(c3);
	

	}

}

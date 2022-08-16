package com.codeo.demo1;

import java.util.*;


public class Employee {
	int employee_id;
	String employee_name;
	double employee_salary;
	
	
	public Employee(int employee_id, String employee_name, double employee_salary) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
	}

	
	public double salaryIncrement() {
		double finalsalary=employee_salary+(10*employee_salary/100);
	  return finalsalary;
	}

	public static void main(String args[]) {
		ArrayList<String> arr=new ArrayList<>();
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int emp_id=xyz.nextInt();
		System.out.println("Enter Employee name: ");
		String emp_name=xyz.next();
		System.out.println("Enter Employee salary: ");
		double emp_salary=xyz.nextDouble();
		System.out.println("Enter Employee Department: ");
		String department=xyz.next();
		System.out.println(emp_id+" "+emp_name+" "+emp_salary);
		Employee emp=new Employee(emp_id,emp_name,emp_salary);
		if(department.equals("IT")) {
			System.out.println("Loose coupling Values: ");
			System.out.println(emp.employee_id+" | "+emp.employee_name+" | "+" | "+emp.employee_salary);
		    System.out.println("Incremented salary: "+emp.salaryIncrement());
		}
		else {
			System.out.println("Loose coupling Values: ");
			System.out.println(emp.employee_id+" | "+emp.employee_name+" | "+" | "+emp.employee_salary);
		}
	
	}

}

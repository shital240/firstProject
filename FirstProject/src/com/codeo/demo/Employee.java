package com.codeo.demo;

public class Employee {
	//Write a program to Print 50 employees data
	int empoloyee_id;//0==>1==>2
	String employee_name;//null==>sudarshan==>Akshay
	double employee_salary;//0.0==>57000.54==>89000.54
    //1,"sudarshan",57000.54
	//(2,"Akshay",89000.54
     public Employee(int employee_id, String employee_name, double employee_salary) {
		this.empoloyee_id=employee_id;
		this.employee_name=employee_name;
		this.employee_salary=employee_salary;
		System.out.println("After constructor call: "+employee_id+" "+employee_name+" "+employee_salary);
	}

	public Employee() {
		
	}

	public static void main(String []rishikesh) {
    	 //Default Constructor or Nonparameterized 
		Employee employee=new Employee();
		System.out.println(employee);
		System.out.println(employee.employee_name);
		System.out.println(employee.employee_salary);
		System.out.println(employee.empoloyee_id);
		//Parameterized constructor
		Employee e1=new Employee(5,"sudarshan",57000.54);
		System.out.println(e1.empoloyee_id+" "+e1.employee_name+" "+e1.employee_salary);
		Employee e2=new Employee(2,"Akshay",89000.54);
		System.out.println(e2.empoloyee_id+" "+e2.employee_name+" "+e2.employee_salary);
		Employee e3=new Employee(3,"Nagendra",56434.76);
		System.out.println(e3.empoloyee_id+" "+e3.employee_name+" "+e3.employee_salary);
	}

}

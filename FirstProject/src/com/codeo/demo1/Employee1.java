package com.codeo.demo1;



public class Employee1 {
	int empoloyee_id;//0==>1==>2
	String employee_name;//null==>sudarshan==>Akshay
	double employee_salary;//0.0==>57000.54==>89000.54
	static String employee_company="codeograph solutions";
	public Employee1(int employee_id, String employee_name, double employee_salary) {
		this.empoloyee_id=employee_id;
		this.employee_name=employee_name;
		this.employee_salary=employee_salary;
		
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	


	@Override
	public String toString() {
		return "Employee1 [empoloyee_id=" + empoloyee_id + ", employee_name=" + employee_name + ", employee_salary="
				+ employee_salary + ", company_name=" +employee_company+"]";
	}





	public static void main(String[] args) {
		Employee1 e1=new Employee1(5,"sudarshan",57000.54);
		System.out.println(e1);
		//e1.add(3, 4);
		//e1.toString();
		Employee1 e2=new Employee1(2,"Akshay",89000.54);
		System.out.println(e2.toString());
		Employee1 e3=new Employee1(3,"Nagendra",56434.76);
		System.out.println(e3.toString());
		
	}

}

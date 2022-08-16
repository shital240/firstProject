package com.codeo.demo1;

public class Salesman {
  //temporary Variables 50 times use
	int sales_manId;
	String sales_manname;
	double sales_mansalary;
	//1,"Dheeraj",23456.65
	public Salesman(int sales_manId , String sales_manname, double sales_mansalary) {
		this.sales_manId=sales_manId;
		this.sales_manname=sales_manname;
		this.sales_mansalary=sales_mansalary;
	}
	
	public Salesman() {
		// TODO Auto-generated constructor stub
	}

	public void displaySalesman() {
		System.out.println("Welcome salesMan");
	}

	public static void main(String[] args) {
     Salesman salesman1=new Salesman(1,"Dheeraj",23456.65);
	System.out.println(salesman1.sales_manId+" "+salesman1.sales_manname+" "+salesman1.sales_mansalary);

	}

}

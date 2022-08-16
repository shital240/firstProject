package com.codeo.encapsulation;

import java.util.Scanner;

public class Meesho {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter email id: ");
	String email_id=sc.next();
	System.out.println("Enter Person Name:");
	String person_name=sc.next();
	System.out.println("Enter Person Mobile No: ");
	long person_mobileno=sc.nextLong();
	Gmail gmail=new Gmail();
	gmail.setEmailid(email_id);
	gmail.setMobile_no(person_mobileno);
    gmail.setPerson_name(person_name);
    System.out.println("=====================");
    System.out.println("login in Meesho by: "+gmail.getPerson_name());
    System.out.println("Get Email ID : "+gmail.getEmailid());
    System.out.println("=====================");
    System.out.println(gmail);

	}

}

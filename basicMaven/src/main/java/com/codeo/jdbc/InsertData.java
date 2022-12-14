package com.codeo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student_name");
		String student_name=sc.next();
		System.out.println("Enter student_mobileno: ");
		String student_mobileno=sc.next();
		System.out.println(student_name);
		 try {
			//Register JDBC Driver  for mysql
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection
		Connection con=null;
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","");
		System.out.println(con);
		 //create Statement object
		Statement statement=null;
		if(con!=null) {
			statement=con.createStatement();
		}
		//prepare the query
		String query="insert into student( student_name, student_mobileno) values('"+student_name+"','"+student_mobileno+"')";
		System.out.println(query);
		int result=0;
		//send and execute the query 
		if(statement!=null) {
			result=statement.executeUpdate(query);
		 System.out.println("Value of result will be: "+result);
		}
		//process the result
		if(result==1) {
			System.out.println("Data inserted successfully");
		}
		else {
			System.out.println("Data is not inserted");
		}
		statement.close();
		con.close();
		 }
		 catch(ClassNotFoundException e) {
			 e.printStackTrace();
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	
	}

}

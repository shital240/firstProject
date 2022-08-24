package com.codeo.jdbcbasics;

import java.sql.*;
import java.util.Scanner;


public class UpdateData {

	public static void main(String[] args) {
		Connection con=null;
		Statement statement=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student_id");
		int student_id=sc.nextInt();
		System.out.println("Enter student_name");
		String student_name=sc.next();
		System.out.println("Enter student_mobileno: ");
		String student_mobileno=sc.next();
		System.out.println("Id whose record should be updated:");
		int record_no=sc.nextInt();
		
		 try {
				//Register JDBC Driver for mysql database
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","");
			//create Statement object
			
			if(con!=null) {
				statement=con.createStatement();
			}
			//prepare the query
			String query="update student set student_id="+student_id+", student_name='"+student_name+"',student_mobileno='"+student_mobileno+"'where student_id="+record_no;
			System.out.println(query);
			int result=0;
			//send and execute the query 
			if(statement!=null) {
				result=statement.executeUpdate(query);
			}
			//process the result
			if(result==0) {
				System.out.println("Data is not Updated");
			}
			else {
				System.out.println("Data updated successfully");
			}
			statement.close();
			con.close();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		

	}

}

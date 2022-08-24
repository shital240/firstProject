package com.codeo.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PostGreSQLInsertion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student_id");
		int student_id=sc.nextInt();
		System.out.println("Enter student_name");
		String student_name=sc.next();
		System.out.println("Enter student_mobileno: ");
		String student_mobileno=sc.next();
		System.out.println(student_name);
		
		 try {
			//Register JDBC Driver for postGreSQL
		Class.forName("org.postgresql.Driver");
		//establish the connection
		Connection con=null;
		 con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test_db","postgres","Manager@123#");
		System.out.println(con);
		 //create Statement object
		Statement statement=null;
		if(con!=null) {
			statement=con.createStatement();
		}
		//prepare the query
		String query="insert into student1(student_id, student_name, student_mobileno) values("+student_id+",'"+student_name+"','"+student_mobileno+"')";
		System.out.println(query);
		int result=0;
		//send and execute the query 
		if(statement!=null) {
			result=statement.executeUpdate(query);
		 System.out.println("Value of result will be: "+result);
		}
		//process the result
		if(result==0) {
			System.out.println("Data is not inserted");
		}
		else {
			System.out.println("Data is inserted");
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

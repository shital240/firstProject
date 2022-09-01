package com.codeo.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department");
		String department=sc.next();
		System.out.println("Enter employee_name");
		String employee_name=sc.next();
		System.out.println("Enter Employee_dob: ");
		String Employee_dob=sc.next();
		System.out.println("Enter Employee_salary: ");
		String Employee_salary=sc.next();
       try {
    	 //Register JDBC Driver
   		Class.forName("com.mysql.cj.jdbc.Driver");
   		//establish the connection
   		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedirectory","root","");
       //create Prepared Statement
   		//PreparedStatement ==> Interface
   		PreparedStatement psmt=null;
   		String insert_query="insert into tbl_employee(name, dob, department, salary) values(?,?,?,?)";
   		System.out.println(insert_query);
   		if(con!=null) {
   		psmt=con.prepareStatement(insert_query);
   		}
   		if(psmt!=null) {
   			psmt.setString(1, employee_name);
   			psmt.setString(2, Employee_dob);
   			psmt.setString(3, department);
   			psmt.setString(4, Employee_salary);
   		}
   		if(psmt!=null) {
   			int result=0;
   			result=psmt.executeUpdate();
   			if(result!=0) {
   				System.out.println("Data inserted successfully");
   			}
   			else {
   				System.out.println("Issues in Data Insertion");
   			}
   		}
       }
       catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
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

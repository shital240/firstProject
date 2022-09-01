package com.codeo.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedUpdate {

	@SuppressWarnings("null")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement psmt=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student_name");
		String student_name=sc.next();
		System.out.println("Enter student_mobileno: ");
		String student_mobileno=sc.next();
		System.out.println("Id whose record should be updated:");
		int record_no=sc.nextInt();
		//register JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection with 
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","");
	    
	    //write the query
	    String update_query="update student set  student_name=?, student_mobileno=? where student_id="+record_no;
	   System.out.println(update_query);
	    if(con!=null) {
	    
	    
	    	psmt.setString(1, student_name);
	    	psmt.setString(2, student_mobileno);
	    }
	    if(con!=null) {
	    	psmt=con.prepareStatement(update_query);
	    }
	    int result=0;
	    if(psmt!=null) {
	    	result=psmt.executeUpdate();
	    }
	    if(result==1) {
	    	System.out.println("Data Updated successfully");
	    }
	    else {
	    	System.out.println("issue in data updation");
	    }
	}

}

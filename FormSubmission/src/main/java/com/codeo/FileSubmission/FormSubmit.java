package com.codeo.FileSubmission;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormSubmit extends HttpServlet{
	
	String name=null;
	String email=null;
	String password=null;
	PrintWriter pw=null;
	
	public void submitData(String name, String email, String password) {
		try {
		//Register JDBC Driver  for mysql
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection
		Connection con=null;
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/concepts","root","");
		System.out.println(con);
		 //create PreparedStatement object
		String query="insert into registration1(name, email, password) values(?,?,?)";
		System.out.println(query);
		PreparedStatement preparedstatement=null;
		if(con!=null) {
			preparedstatement=con.prepareStatement(query);
		   System.out.println(preparedstatement);
		}
		//prepare the query
		
		int result=0;
		//send and execute the query 
		if(preparedstatement!=null) {
			preparedstatement.setString(1, name);
			preparedstatement.setString(2, email);
			preparedstatement.setString(3, password);
		}
		if(preparedstatement!=null) {
			result=preparedstatement.executeUpdate();
		 
		}
		//process the result
		if(result!=0) {
			System.out.println("Data inserted successfully");
		    pw.println("Data inserted successfully");
		}
		else {
			System.out.println("Data is not inserted");
		     pw.println("Data is not inserted");
		}
		preparedstatement.close();
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		name=request.getParameter("firstName");
		email=request.getParameter("email");
		password=request.getParameter("password");
		
		System.out.println(name+" "+email+" "+password);
				
		FormSubmit fs=new FormSubmit();
		fs.submitData(name,email,password);
	    pw=response.getWriter();
	}
	
	
	

}

package com.codeo.studentdetails;

import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.Part;

public class StudentDetailsDao {

	
	public void addDetails(String name, String email, String password, String dob, InputStream file) {
		//persistent logic(CRUD)
		//Insertion
		try {
			//Register JDBC Driver  for mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			Connection con=null;
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/imageref","root","");
			System.out.println(con);
			 //create PreparedStatement object
			String query="insert into student_details( name, email, password, date, profile_pic) values(?,?,?,?,?)";
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
				preparedstatement.setString(4, dob);
				preparedstatement.setBlob(5, file);
			}
			if(preparedstatement!=null) {
				result=preparedstatement.executeUpdate();
			 
			}
			
			//process the result
			if(result!=0) {
				System.out.println("Data inserted successfully");
			   
			}
			else {
				System.out.println("Data is not inserted");
			  
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

}

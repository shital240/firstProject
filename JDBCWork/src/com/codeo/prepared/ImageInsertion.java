package com.codeo.prepared;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ImageInsertion {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {
	Scanner sc=null;
	sc=new Scanner(System.in);
	//student_id, student_name, student_email, student_mobileno, student_pic, student_entry_time
	System.out.println("Enter student_name: ");
	String student_name=sc.next();
	System.out.println("Enter Student_email: ");
	String student_email=sc.next();
	System.out.println("Enter student_mobileno: ");
	String student_mobileno=sc.next();
	System.out.println("Enter student_pic: ");
	String student_pic_path=sc.next();
	//locate the path
	File file=new File(student_pic_path);
	long length=file.length();
	System.out.println("File Length: "+length);
	//create the input stream for holding imagepath
	FileInputStream fis=new FileInputStream(file);
	//Register JDBC Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//establish the connection
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","");
	//Write the insert query for image parameter
	String insert_image_query="insert into student_data( student_name, student_email, student_mobileno, student_pic) values(?,?,?,?)";
	PreparedStatement psmt=null;
	if(con!=null) {
		psmt=con.prepareStatement(insert_image_query);
	}
	if(psmt!=null) {
		psmt.setString(1, student_name);
		psmt.setString(2, student_email);
		psmt.setString(3, student_mobileno);
		psmt.setBlob(4, fis);
	}
	if(psmt!=null) {
		int result=0;
		result=psmt.executeUpdate();
		if(result!=0) {
			System.out.println("Data inserted successfully");
		}
		else {
			System.out.println("Data not inserted");
		}
	}
	}

}

package com.codeo.prepared;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Resume_details {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {
		Scanner sc=null;
		sc=new Scanner(System.in);
		//student_id, student_name, student_email, student_mobileno, student_pic, student_entry_time
		System.out.println("Enter Person_name: ");
		String person_name=sc.next();
		System.out.println("Enter Person_email: ");
		String person_email=sc.next();
		System.out.println("Enter Person_mobileno: ");
		String person_mobileno=sc.next();
		System.out.println("Enter Person_resume: ");
		String person_resume=sc.next();
		//locate the path
		File file=new File(person_resume);
		long length=file.length();
		System.out.println("File Length: "+length);
		//create the input stream for holding imagepath
		Reader reader=new FileReader(file);
		//Register JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","");
		//Write the insert query for image parameter
		String insert_image_query="insert into resume_table(person_name, person_mobileno, person_emailid, person_resume) values(?,?,?,?)";
		PreparedStatement psmt=null;
		if(con!=null) {
			psmt=con.prepareStatement(insert_image_query);
		}
		if(psmt!=null) {
			psmt.setString(1, person_name);
			psmt.setString(2, person_email);
			psmt.setString(3, person_mobileno);
			psmt.setCharacterStream(4, reader);
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

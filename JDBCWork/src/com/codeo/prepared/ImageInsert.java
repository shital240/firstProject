package com.codeo.prepared;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ImageInsert {
	private static final String RETRIEVE_QUERY="SELECT  student_name, student_email, student_mobileno, student_pic WHERE student_id=?";
	public static void main(String[] args) {
		Scanner sc=null;
		int no=0;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int id=0;
		String name=null;
		String mobileno=null;
		InputStream is=null;
		OutputStream os=null;
		byte[] buffer=null;
		int bytesRead=0;
		try {
			//read inputs
			sc=new Scanner(System.in);
			if(sc!=null) {
				System.out.println("EnterApplicant Id::");
				no=sc.nextInt();
			}
			//register JDBC driver s/w
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
			//create PreparedStatement object
			if(con!=null)
				ps=con.prepareStatement(RETRIEVE_QUERY);
			//set values Query params
			if(ps!=null)
				ps.setInt(1,no);
			//send and execute SQL Query
			if(ps!=null) {
				rs=ps.executeQuery();
			}
			//process the ResultSEt object
			if(rs!=null) {
				if(rs.next()) {
					id=rs.getInt(1);
					name=rs.getString(2);
					mobileno=rs.getString(4);
					is=rs.getBinaryStream(5);
					System.out.println(id+"   "+name+"  "+mobileno);
					//write BLOB value Dest file
					os=new FileOutputStream("1.jpg");
					buffer=new byte[4096];
					while((bytesRead=is.read(buffer))!=-1) {
						os.write(buffer, 0, bytesRead);
					}
				}//if
				System.out.println("Photo retrived and stored in a file...");
			}//if
		}//try
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(RETRIEVE_QUERY);
			try {
				if(os!=null)
					os.close();
			}
			catch(IOException ioe) {
				ioe.printStackTrace();
			}
			
			try {
				if(is!=null)
					is.close();
			}
			catch(IOException ioe) {
				ioe.printStackTrace();
			}
			
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(sc!=null)
					sc.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}//finally
	}//main
}

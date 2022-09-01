package com.codeo.batchprocessing;

import java.sql.*;
import java.util.Scanner;

//Group Movie booking for friends/relatives
//Choices of Movies depending on end user
//total money spend on movie show.
public class MovieBookingApp {

	public static void main(String[] args) {
		Scanner sc=null;
		Connection con=null;
		PreparedStatement psmt=null;
		String movie_name=null;
		String person_name=null;
		String age=null;
		double movie_rate=0.0;
		int result[];
		int viewers=0;
		int seat_no=1;
		//Program start
		sc=new Scanner(System.in);
		System.out.println("Enter no of viewers");
		viewers=sc.nextInt();
		//viewers=2
		try {
		//Register JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish the connection between database software and app
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","");
		System.out.println(con);
		//write a query and PreparedStatement object
		String insert_query="insert into movie_booking(viewer_name, viewer_age, seat_no, movie_name, movie_rate) values(?,?,?,?,?)";
	//	String billing_query="select sum(movie_rate) from movie_booking";
		System.out.println(insert_query);
		if(con!=null) {
			psmt=con.prepareStatement(insert_query);
			//psmt=con.prepareStatement(billing_query);
		}
		//depending on user value;
		for(int i=0;i<viewers;i++) {
			System.out.println("Enter Movie Name");
			movie_name=sc.next();
			System.out.println("Enter Person Name");
			person_name=sc.next();
			System.out.println("Enter Person Age");
			age=sc.next();
			try {
				psmt.setString(1, person_name);
				psmt.setString(2, age);
				psmt.setInt(3, seat_no);
				psmt.setString(4, movie_name);
				if(movie_name.equals("LalSinghChada")) {
					movie_rate=200.34;
					psmt.setDouble(5, movie_rate);
					seat_no++;
				}
				else if(movie_name.equals("RakshaBandhan")) {
					movie_rate=234.32;
					psmt.setDouble(5, movie_rate);
					seat_no++;
				}
				else {
					System.out.println("Enter Proper input");
				}
				psmt.addBatch();
			}
			
			catch(Exception e){
				e.printStackTrace();	
			}
			try {
			result=psmt.executeBatch();
			if(result!=null) {
				System.out.println("Movie group booking done successfully");
			}
			else {
				System.out.println("Faliure in group booking");
			}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
package com.codeo.excel;

import java.sql.*;
import java.util.*;

public class DatabaseInsert {
	private static final String  INSERT_QUERY="INSERT INTO Book1.Sheet1 VALUES(?,?,?)";
	public static void main(String[] args) {
		Scanner sc=null;
		int no=0;
		String name=null,addrs=null;
		Connection  con=null;
		PreparedStatement ps=null;
		String query=null;
		int  count=0;
		try {
			sc=new Scanner(System.in);
			if(sc!=null) {
				System.out.println("Enter Student number::");
				no=sc.nextInt(); //gives 101
				System.out.println("Enter student name::");
				sc.nextLine();
				name=sc.nextLine(); //gives raja  rao
				System.out.println("Enter Student address");
				addrs=sc.nextLine();  //gives new hyd
			}
			   Class.forName("com.hxtt.sql.excel.ExcelDriver");
				//establish the connection
				con=DriverManager.getConnection("jdbc:excel:///E:/Morning Java Batch");
				//create STatement object
				if(con!=null)
					ps=con.prepareStatement(INSERT_QUERY);
				//set values to query params
				if(ps!=null) {
					ps.setInt(1,no);
					ps.setString(2,name);
					ps.setString(3,addrs);
				}
			   // execute SQL Query
				if(ps!=null)
					count=ps.executeUpdate();
				//process the Result
				if(count==0)
					System.out.println("Record not inserted");
				else
					System.out.println("Record  inserted");
		}//try
		catch(SQLException se) {
			if(se.getErrorCode()==1)
				System.out.println("Student already inserted with this sno");
			else if(se.getErrorCode()==12899)
				System.out.println("value is  too large for column");
			else if(se.getErrorCode()==933)
				System.out.println("Invalid SQL command");
			else
				System.out.println("Uknown Internal problem");
				
				
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//close jdbc objs
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

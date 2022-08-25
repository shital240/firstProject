package com.codeo.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostGresqlConnection {

	public static void main(String[] args) {
		  Connection connection = null;
	      try {
	    	  //Register JDBC Driver for postgresql
	         Class.forName("org.postgresql.Driver");
	         //Establishing connection between application and postgresql database software
	         connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb",
	            "postgres", "Manager@123#");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");

	}

}

package com.codeo.DBCP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import org.apache.commons.dbcp.BasicDataSource;

public class DBCPConnectionPool {
      
	 // private static BasicDataSource dataSource;//null value
	  
	    private static BasicDataSource getDataSource() {
	 
	       
	            BasicDataSource ds = new BasicDataSource();
	            ds.setUrl("jdbc:postgresql://localhost:5432/test_db");
	            ds.setUsername("postgres");
	            ds.setPassword("Manager@123#");
	 
	            //5 connection mimimum 
	            ds.setMinIdle(5);
	            ds.setMaxIdle(10);
	            ds.setMaxOpenPreparedStatements(100);
	 
	            
	       
	        return ds;
	    }
	 
	    public static void main(String[] args) throws SQLException
	    {
	         DBCPConnectionPool dbcp=new DBCPConnectionPool();
	    	BasicDataSource dataSource  = dbcp.getDataSource(); 
	                Connection connection = dataSource.getConnection();
	                PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM student1");
	        
	      
	                {
	System.out.println("The Connection Object is of Class: "+connection.getClass());
	            try (ResultSet resultSet = pstmt.executeQuery();)
	            {
	                while (resultSet.next())
	                {
	                    System.out.println(resultSet.getString(1) + "," + resultSet.getString(2) + "," + resultSet.getString(3));
	                }
	            }
	            catch (Exception e)
	            {
	                //connection.rollback();
	                e.printStackTrace();
	            }
	        }
	        }
	    }





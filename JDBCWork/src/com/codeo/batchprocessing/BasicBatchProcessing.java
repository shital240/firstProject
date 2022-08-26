package com.codeo.batchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BasicBatchProcessing {

	public static void main(String[] args) {
		String insert_query="insert into student(student_id,student_name,student_mobileno) values(2,'Nagendra','9898989898')";
		String delete_query="delete from student where student_id=1";
		String update_query="update student set student_name='sid' where student_id=2";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection
		Connection con=null;
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","");
		//set Autocomit mode
		 //con.setAutoCommit(false);
		 //create statement Object
		 Statement statement=null;
		 statement=con.createStatement();
		 //add queries to Batch
		 if(statement!=null) {
		 statement.addBatch(insert_query);
		 statement.addBatch(delete_query);
         statement.addBatch(update_query);	
		 }
         //execute the batch
         int result[]=statement.executeBatch();
         //process the result
         int sum=0;
         for(int i=0;i<result.length;++i) {
        	 sum=sum+result[i];
         }
         System.out.println("The records affected database will be: "+sum);
		}
		catch(Exception e) {
			
		}
	}

}

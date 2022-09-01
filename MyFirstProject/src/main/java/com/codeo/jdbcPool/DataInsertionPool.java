package com.codeo.jdbcPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DataInsertionPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String configure_file_path="src/main/java/com/codeo/jdbcPool/db.properties";
	    HikariConfig hcfg=new HikariConfig(configure_file_path);
	    HikariDataSource hdata=new HikariDataSource(hcfg);
	    Connection con=null;
	    PreparedStatement psmt=null;
	    ResultSet rs=null;
	    try {
	    	con=hdata.getConnection();
	    	String query="select * from student";
	    	psmt=con.prepareStatement(query);
	    	rs=psmt.executeQuery();
	    	while(rs.next()) {
	    		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	    	}
	    }
	    catch(SQLException e) {
	    	e.printStackTrace();
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			psmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

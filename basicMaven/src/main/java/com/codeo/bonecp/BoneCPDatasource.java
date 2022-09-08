package com.codeo.bonecp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoneCPDatasource {

	public static void main(String[] args)throws SQLException {
 
		try (Connection connection = DBUtil.getConnection();
				Statement st = connection.createStatement();) {
 
			String SQL = "SELECT *FROM student1";
			ResultSet rs = st.executeQuery(SQL);
			while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

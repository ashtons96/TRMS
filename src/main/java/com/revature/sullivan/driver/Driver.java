package com.revature.sullivan.driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.sullivan.cf.ConnectionFactory;


public class Driver {

	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		
		Statement stmt;
//		try {
//			stmt = conn.createStatement();
//			String sql = "insert into employees (username, employeepassword, first_name, last_name, email, city, state, title)"
//					+ "values ('Diesel', 'Superman34', 'Shaquille', 'Oneal', 'alwaysshaqtin@hotmail.com', 'Los Angeles', 'California', 'employee');";
//			
//			stmt.executeUpdate(sql);
//		}
//		catch (SQLException s) {
//			
//			s.printStackTrace();
//		}
		
	}
}

package com.revature.sullivan.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.revature.sullivan.cf.ConnectionFactory;
import com.revature.sullivan.pojo.Request;
import com.revature.sullivan.util.LoggingUtil;

public class RequestDAOImpl implements RequestDAO {
	
	private static Connection conn = ConnectionFactory.getConnection();

	@Override
	public void createRequest(Request r) {
		
			
			String sql = "insert into request(first_name,"
					+ "last_name, date, time, location, cost, grading_format, eventtype, comments) values"
					+ "(?,?,?,?,?,?,?,?,?)";
			
			try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			;
			pstmt.setString(1, r.getFirstName());
		//	System.out.println(r.getFirstName());
			pstmt.setString(2, r.getLastName());
			pstmt.setString(3, r.getDate());
			pstmt.setString(4,  r.getTime());
			pstmt.setString(5, r.getLocation());
			pstmt.setInt(6, r.getCost());
			pstmt.setString(7, r.getGradingFormat());
			pstmt.setString(8, r.getEventType());
			pstmt.setString(9, r.getComments());

			pstmt.executeUpdate();
		LoggingUtil.info("Submitted a form");
		} catch (SQLException e) {
			LoggingUtil.info("SQLException");
			e.printStackTrace();
		}

	}

	@Override
	public List<Request> getRequest() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Request> getRequest(int employeeID) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Request> getSecondaryRequest(int employeeID) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeRequest(int ID, Request r) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRequest(int ID) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyStatus(int ID, int s) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Request> getDepartmentRequest(int departmentID) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Request> viewFormBySupervisorID(Integer iD) {
		// TODO Auto-generated method stub
		return null;
	}

}
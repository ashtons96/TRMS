package com.revature.sullivan.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.sullivan.cf.ConnectionFactory;

public class PaymentsDAOImpl implements PaymentsDAO{

	private static Connection conn = ConnectionFactory.getConnection();

	public void setPending(Double pending, Integer employeeID) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update request set approval = ? where requestid = ?;");
			pstmt.setDouble(1, pending);
			pstmt.setInt(2, employeeID);
			pstmt.executeUpdate();
		} catch (SQLException e) {	
			e.printStackTrace();
		
		}
	}

	@Override
	public void setAvailable(Double available, Integer employeeID) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update request set reimbursement = ? where requestid = ?");
			pstmt.setDouble(1, available);
			pstmt.setInt(2, employeeID);
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();

		}
	}


	@Override
	public Double getAvailable(Integer employeeID) {
		Double ret = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement("select reimbursement from request where employeeid = ?");
			pstmt.setInt(1, employeeID);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				ret = rs.getDouble("available");
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		
		}
		return ret;
	}

	public Double getPending(Integer employeeID) {
		Double ret = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement("select approval from request where requestid = ?");
			pstmt.setInt(1, employeeID);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				ret = rs.getDouble("pending");
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return ret;
	}

	@Override
	public Double getAward(Integer employeeID) {
		Double ret = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement("select reimbursement from request where requestid = ?");
			pstmt.setInt(1, employeeID);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				ret = rs.getDouble("award");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		}

		return ret;
	}

	@Override
	public void setAward(Integer employeeID, Double award) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update request set reimbursement = ? where requestid = ?");
			pstmt.setDouble(1, award);
			pstmt.setInt(2, employeeID);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		}
	}

	public void setFinalPending(Double pending, Integer employeeID) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update request set approval = ? where requestid = ?");
			pstmt.setDouble(1, pending);
			pstmt.setInt(2, employeeID);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
}

	@Override
	public void setAwardPending(Double pending, Integer employeeID) {
		
	}

	@Override
	public Double getAwardPending(Integer employeeID) {
	
		return null;
	}

	@Override
	public void setTotalPending(Double pending, Integer employeeID) {
		// TODO Auto-generated method stub
		
	}

	public Object getEmployeebyRequestID(Integer requestID) {
		// TODO Auto-generated method stub
		return null;
	}


}

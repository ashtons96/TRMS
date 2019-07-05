package com.revature.sullivan.DAO;

import java.sql.SQLException;
import java.util.List;

import com.revature.sullivan.pojo.Request;

public interface RequestDAO {
	
	public void createRequest(Request r) throws SQLException;
	
	public List<Request> getRequest() throws SQLException;
	
	public List<Request> getRequest(int employeeID) throws SQLException;
	
	public List<Request> getSecondaryRequest(int employeeID) throws SQLException;
	
	public void changeRequest(int ID, Request r) throws SQLException;
	
	public void deleteRequest(int ID) throws SQLException;
	
	public void modifyStatus(int ID, int s) throws SQLException;
	
	List<Request> getDepartmentRequest (int departmentID) throws SQLException;

	
}

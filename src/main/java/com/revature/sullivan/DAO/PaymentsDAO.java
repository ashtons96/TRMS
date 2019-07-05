package com.revature.sullivan.DAO;

public interface PaymentsDAO {
	
	public void setAwardPending(Double pending, Integer employeeID);
	
	public void setAvailable(Double available, Integer employeeID);
	
	public Double getAvailable(Integer employeeID);
	
	public Double getAwardPending(Integer employeeID);
	
	public Double getAward(Integer employeeID);
	
	public void setAward(Integer employeeID, Double award);
	
	public void setTotalPending(Double pending, Integer employeeID);

}
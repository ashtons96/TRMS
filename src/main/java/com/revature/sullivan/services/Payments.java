package com.revature.sullivan.services;

public interface Payments {
	
	public Double calculateAwardPending(Double cost, String event);
	
	public Double getAwardPending(Integer employeeID);
	
	public void setAwardPending(Double pending, Integer employeeID);

	public void setTotalPending(Double pending, Integer employeeID);
	
	public Double getAvailable(Integer employeeID);
	
	public void setAvailable(Double pending, Integer employeeID);
	
	public Double getAward(Integer employeeID);
	
	public void setAward(Integer requestID);

}

package com.revature.sullivan.services;

import com.revature.sullivan.DAO.PaymentsDAOImpl;

public class PaymentsImpl implements Payments{
	private PaymentsDAOImpl pdi = new PaymentsDAOImpl();

	public Double calculatePending(Double cost, String eventType) {
		Double pending = null;
		switch (eventType) {
		case "course":
			pending = 0.8 * cost;
			break;
		case "prep-class":
			pending = 0.75 * cost;
			break;
		case "certification":
			pending = cost;
			break;
		case "training":
			pending = 0.9 * cost;
			break;
		case "presentation":
			pending = 0.6 * cost;
			break;
		case "others":
			pending = 0.3 * cost;
			break;
		}
		return pending;
	}

	public Double getPending(Integer employeeID) {
		return pdi.getPending(employeeID);
	}

	public void setPending(Double pending, Integer employeeID) {
		Double newPending = pending + pdi.getPending(employeeID);
		pdi.setPending(newPending, employeeID);
	}

	public void setFinalPending(Double pending, Integer employeeID) {
		pdi.setFinalPending(pending, employeeID);
	}

	@Override
	public Double getAvailable(Integer employeeID) {
		return pdi.getAvailable(employeeID);
	}

	@Override
	public void setAvailable(Double pending, Integer employeeID) {
		Double available;
		Double getPending = getPending(employeeID);
		Double getAward = getAward(employeeID); 
		available = 1000 - getPending - getAward;
		pdi.setAvailable(available, employeeID);
	}

	@Override
	public Double getAward(Integer employeeID) {
		return pdi.getAward(employeeID);
	}

	@Override
	public void setAward(Integer requestID) {
		Double award = pdi.getEmployeebyRequestID(requestID).getAward();
		Double pending = pdi.getEmployeebyRequestID(requestID).getPending();
		Double available = pdi.getEmployeebyRequestID(requestID).getAvailable();
		Integer employeeID = pdi.getEmployeebyRequestID(requestID).getEmployeeID();
		if (pending >= available) {
			award += available;
		} else {
			award += pending;
		}
		
		Double newPending = 1000 - available - award;
		setFinalPending(newPending, employeeID);
		Double newAvailable = 1000 - award - newPending;
		pdi.setAvailable(newAvailable, employeeID);
		pdi.setAward(employeeID, award);
	}

	@Override
	public Double calculateAwardPending(Double cost, String event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getAwardPending(Integer employeeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAwardPending(Double pending, Integer employeeID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTotalPending(Double pending, Integer employeeID) {
		// TODO Auto-generated method stub
		
	}
}
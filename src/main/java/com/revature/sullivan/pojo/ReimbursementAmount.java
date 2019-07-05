package com.revature.sullivan.pojo;

public class ReimbursementAmount extends Reimbursement {

	private int awardAmount;
	
	public ReimbursementAmount(String eventType, String eventDate, int cost, int awardAmount) {
		super(eventType, eventDate, cost, awardAmount);
		this.awardAmount = awardAmount;
		
	}
	
	public int getAwardAmount() {
		return awardAmount;
	
	}
	
	public void setAwardAmount(int awardAmount) {
		this.awardAmount = awardAmount;
	}
	
	@Override
	public String toString() {
		return "ReimbursementAmount [AwardAmount = " + awardAmount +"]"; 
	}
}

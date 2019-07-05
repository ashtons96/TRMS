package com.revature.sullivan.pojo;

public abstract class Reimbursement {

	private int requestID;
	private String eventType;
	private String eventDate;
	private String username;
	private int cost;
	
	
	
	public Reimbursement(int requestID, String eventType, String eventDate, String username, int cost) {
		super();
		this.requestID = requestID;
		this.eventType = eventType;
		this.eventDate = eventDate;
		this.username = username;
		this.cost = cost;
	}
	public Reimbursement(String eventType, String eventDate, int cost, int awardAmount) {
		// TODO Auto-generated constructor stub
	}
	public int getRequestID() {
		return requestID;
	}
	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Reimbursement [Request_ID = " + requestID
				+ "\nEvent_Type = " + eventType + "\nEvent_Date = " + eventDate
				+ "\nCost = " + cost + "]";
	}
}

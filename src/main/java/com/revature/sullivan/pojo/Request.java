package com.revature.sullivan.pojo;

import java.sql.Time;

public class Request {

	private int ID;
	private int employeeID;
	private String firstName;
	private String lastName;
	private int status;
	private int cost;
	private String eventType;
	private String location;
	private String date;
	private String description;
	private String gradingFormat;
	private String time;
	private String comments;
	
	
		
	
	public Request(String firstName, String lastName, String date, String time, String location, int cost, String gradingFormat, 
			String eventType, String comments) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cost = cost;
		this.eventType = eventType;
		this.location = location;
		this.date = date;
		this.gradingFormat = gradingFormat;
		this.time = time;
		this.comments = comments;
	}
	public int getID() {
		return ID;
		
	}
	public void setID(int ID) {
		this.ID = ID;
		
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGradingFormat() {
		return gradingFormat;
	}
	public void setGradingFormat(String gradingFormat) {
		this.gradingFormat = gradingFormat;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String Date) {
		this.date = date;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
}

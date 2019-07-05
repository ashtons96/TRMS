package com.revature.sullivan.pojo;

public class Attachments {
	
	private int ID;
	private String fileName;
	private int requestID;
	private String directory;
	private boolean approved;
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getRequestID() {
		return requestID;
	}
	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	

}

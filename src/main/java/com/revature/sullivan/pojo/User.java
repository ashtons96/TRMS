package com.revature.sullivan.pojo;

public class User {
    private String username;   
    private String password;
    private String fullname;
	private String address;
	private String city;
	private String state;
	private String zip;
	private int ID;
	private int departmentID;
	private String department;
	private String email;
	private String title;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getFullname() {
        return fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    public User(String username, String password, String fullname) {
        super();
        this.username = username;
        this.password = password;
        this.fullname = fullname;
    }
    
    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }
    
    public User(Integer employeeID, String username, String password, String title, int balance) {
        super();
    }
    
    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", fullname=" + fullname + "]";
    }
}



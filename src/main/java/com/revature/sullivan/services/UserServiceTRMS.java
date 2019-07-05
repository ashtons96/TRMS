package com.revature.sullivan.services;

import java.util.ArrayList;

import com.revature.sullivan.DAO.TRMSDAOImpl;
import com.revature.sullivan.pojo.User;

public class UserServiceTRMS implements UserService {
	private ArrayList<User> UserDAO;
    private TRMSDAOImpl t = new TRMSDAOImpl(); 
    public User loginUser(String username, String password) {

        System.out.println("username: " + username);
        System.out.println("password: " + password);

        User user = null;

        for (User check : t.getAllUser()) {
            if(check.getUsername().equals(username) && check.getPassword().equals(password)) {
                user = check;
                break;
            }
        }
        return user;

    }
	public ArrayList<User> getUserDAO() {
		return UserDAO;
	}
	public void setUserDAO(ArrayList<User> userDAO) {
		UserDAO = userDAO;
	}
}

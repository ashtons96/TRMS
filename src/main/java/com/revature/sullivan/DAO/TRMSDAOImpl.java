package com.revature.sullivan.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.sullivan.cf.ConnectionFactory;
import com.revature.sullivan.pojo.User;

public class TRMSDAOImpl implements TRMSDAO {

    private Connection conn = ConnectionFactory.getConnection();    

    public ArrayList<User> getAllUser() {

        ArrayList<User> userList = new ArrayList<User>();
        String sql = "select username, employeepassword from employees";

        PreparedStatement ps;

        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            

            while(rs.next()) {
            	
            	userList.add(new User(rs.getString(1),rs.getString(2)));
  
            }

        }    catch (SQLException e) {
                e.printStackTrace();
        }

        return userList;
    }


}
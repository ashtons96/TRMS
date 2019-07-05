package com.revature.sullivan.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.revature.sullivan.cf.ConnectionFactory;

public class EventDAOImpl implements EventDAO{

	ConnectionFactory cf;
	
	public EventDAOImpl() {
		ConnectionFactory conn = ConnectionFactory.getInstance();
		
	}
	
	@Override
	public Map<Integer, Double>getReimbursementAmount() throws SQLException{
		
		String sql = "select event_type,  reimbursement_percentage"
					+ "from event_type";
		
		try(Connection conn = cf.prepareStatement(sql)){
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			Map<Integer, Double> reimbursementMap = new HashMap<Integer, Double>();
			
			while(rs.next()) {
				reimbursementMap.put(rs.getInt(1), rs.getDouble(2)/ 100.0);
				
			}
			return reimbursementMap;
		}
	}
	
}

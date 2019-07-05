package com.revature.sullivan.DAO;

import java.sql.SQLException;
import java.util.Map;

public interface EventDAO {

	public Map<Integer, Double>getReimbursementAmount() throws SQLException;
	
	
}

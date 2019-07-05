/**
 * 
 */
package com.revature.sullivan.util;

import com.revature.sullivan.pojo.User;

public class GetBalance {
	
	public static double getPendingBalance(User user)
	{
		
		return 0;
		
	}
	public static double getApprovedBalance(User user)
	{
		
		return 0;
		
	}
	public static double getTotalBalance(User user)
	{
		double total = (1000 - getApprovedBalance(user) - getPendingBalance(user));
		return total;
	}
}



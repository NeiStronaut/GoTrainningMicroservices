package com.thiscounts.login;

import com.thiscounts.employee.Employee;

public interface LoginController {
	
	/**
	 * 
	 * @param id
	 * @param hash
	 * @return
	 */
	boolean login(String id, String hash);
	
	/**
	 * 
	 * @param login
	 * @return
	 */
	boolean update(Login login);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	String acquireSession(String id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Employee accquireEmployee(String id);
	
}

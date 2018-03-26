package com.thiscounts.login;

import com.thiscounts.employee.Employee;

public interface LoginController {
	
	boolean login(String id, String hash);
	
	boolean update(Login login);
	
	String acquireSession(String id);
	
	Employee accquireEmployee(String id);
	
}

package com.thiscounts.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiscounts.employee.Employee;

@RestController
public class LoginControllerBusiness implements LoginController {

	@Override
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public boolean login(String id, String hash) {
		return false;
	}

	@Override
	@RequestMapping(value = "/login", method = RequestMethod.PUT)
	public boolean update(Login login) {
		return false;
	}

	@Override
	@RequestMapping(value = "/login/session", method = RequestMethod.GET)
	public String acquireSession(String id) {
		return null;
	}

	@Override
	@RequestMapping(value = "/login/user", method = RequestMethod.GET)
	public Employee accquireEmployee(String id) {
		return null;
	}

}

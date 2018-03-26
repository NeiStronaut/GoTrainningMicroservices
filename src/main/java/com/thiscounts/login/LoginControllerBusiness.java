package com.thiscounts.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiscounts.employee.Employee;

@RestController
public class LoginControllerBusiness implements LoginController {
	
	@Autowired
	private LoginRepository repository;

	@Override
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public boolean login(String id, String hash) {
		return repository.login(id, hash);
	}

	@Override
	@RequestMapping(value = "/login", method = RequestMethod.PUT)
	public boolean update(Login login) {
		return repository.update(login);
	}

	@Override
	@RequestMapping(value = "/login/session", method = RequestMethod.GET)
	public String acquireSession(String id) {
		return repository.acquireSession(id);
	}

	@Override
	@RequestMapping(value = "/login/user", method = RequestMethod.GET)
	public Employee accquireEmployee(String id) {
		long userId = repository.acquireUserId(id);
		//NEXT: connect with service and get employee
		return null;
	}

}

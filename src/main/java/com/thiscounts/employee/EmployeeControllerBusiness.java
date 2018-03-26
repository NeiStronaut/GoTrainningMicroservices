package com.thiscounts.employee;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiscounts.company.Company;

@RestController
public class EmployeeControllerBusiness implements EmployeeController {

	@Override
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public boolean create(Employee employee) {
		return false;
	}

	@Override
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee findById(long id) {
		return null;
	}

	@Override
	@RequestMapping(value = "/employee", method = RequestMethod.PUT)
	public boolean update(Employee employee) {
		return false;
	}

	@Override
	@RequestMapping(value = "/employee/company-employees", method = RequestMethod.GET)
	public List<Employee> listAll(Company discount) {
		return null;
	}

}

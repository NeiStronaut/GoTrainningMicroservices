package com.thiscounts.employee;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiscounts.company.Company;

@RestController
public class EmployeeControllerBusiness implements EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public boolean create(Employee employee) {
		return repository.create(employee);
	}

	@Override
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public Employee findById(@PathParam("id")long id) {
		return repository.findById(id);
	}

	@Override
	@RequestMapping(value = "/employee", method = RequestMethod.PUT)
	public boolean update(Employee employee) {
		return repository.update(employee);
	}

	@Override
	@RequestMapping(value = "/employee/company-employees", method = RequestMethod.GET)
	public List<Employee> listAll(Company company) {
		return repository.listAll(company);
	}

}

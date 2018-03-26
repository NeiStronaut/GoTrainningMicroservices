package com.thiscounts.employee;

import java.util.List;

import com.thiscounts.company.Company;

public class EmployeeRepositoryBusiness implements EmployeeRepository {

	@Override
	public boolean create(Employee employee) {
		return false;
	}

	@Override
	public Employee findById(long id) {
		return null;
	}

	@Override
	public boolean update(Employee employee) {
		return false;
	}

	@Override
	public List<Employee> listAll(Company discount) {
		return null;
	}

}

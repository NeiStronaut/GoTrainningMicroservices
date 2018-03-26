package com.thiscounts.employee;

import java.util.List;

import com.thiscounts.company.Company;

public interface EmployeeController {

	boolean create(Employee employee);
	
	boolean update(Employee employee);
	
	Employee findById(long id);
	
	List<Employee> listAll(Company discount);
}

package com.thiscounts.employee;

import java.util.List;

import com.thiscounts.company.Company;

public interface EmployeeController {

	/**
	 * 
	 * @param employee
	 * @return
	 */
	boolean create(Employee employee);
	
	/**
	 * 
	 * @param employee
	 * @return
	 */
	boolean update(Employee employee);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Employee findById(long id);
	
	/**
	 * 
	 * @param company
	 * @return
	 */
	List<Employee> listAll(Company company);
}

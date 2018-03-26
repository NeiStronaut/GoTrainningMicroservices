package com.thiscounts.employee;

import java.util.List;

import com.thiscounts.company.Company;

public interface EmployeeRepository {

	/**
	 * 
	 * @param employee
	 * @return
	 */
	boolean create(Employee employee);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Employee findById(long id);
	
	/**
	 * 
	 * @param employee
	 * @return
	 */
	boolean update(Employee employee);
	
	/**
	 * 
	 * @param discount
	 * @return
	 */
	List<Employee> listAll(Company company);

}

package com.thiscounts.discount;

import java.util.List;

import com.thiscounts.company.Company;
import com.thiscounts.employee.Employee;

public interface CompanyDiscountRepository {

	/**
	 * 
	 * @param companyDiscount
	 * @return
	 */
	public boolean create(CompanyDiscount companyDiscount);

	/**
	 * 
	 * @param companyDiscount
	 * @return
	 */
	public boolean update(CompanyDiscount companyDiscount);

	/**
	 * 
	 * @param discount
	 * @return
	 */
	public List<CompanyDiscount> listAll(Company discount);

	/**
	 * 
	 * @param employee
	 * @return
	 */
	public List<CompanyDiscount> listAll(Employee employee);
	
}

package com.thiscounts.discount;

import java.util.List;

import com.thiscounts.company.Company;
import com.thiscounts.employee.Employee;

public interface DiscountController {

	/**
	 * 
	 * @param e
	 * @return
	 */
	boolean create(Discount discount);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Discount findById(long id);
	
	/**
	 * 
	 * @param d
	 * @return
	 */
	boolean update(Discount discount);
	
	/**
	 * 
	 * @param companyDiscount
	 * @return
	 */
	boolean createCompanyDiscount(CompanyDiscount companyDiscount);
	
	/**
	 * 
	 * @param companyDiscount
	 * @return
	 */
	boolean updateCompanyDiscount(CompanyDiscount companyDiscount);
	
	/**
	 * 
	 * @param d
	 * @return
	 */
	List<Discount> listAll(Discount discount);
	
	/**
	 * 
	 * @param company
	 * @return
	 */
	List<CompanyDiscount> listAll(Company company);
	
	/**
	 * 
	 * @param employee
	 * @return
	 */
	List<CompanyDiscount> listAll(Employee employee);
	
}

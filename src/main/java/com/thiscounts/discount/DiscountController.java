package com.thiscounts.discount;

import java.util.List;

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
	 * @param companyId
	 * @return
	 */
	List<CompanyDiscount> listAllCompanyDiscounts(long companyId);
	
	/**
	 * 
	 * @param employeeId
	 * @return
	 */
	List<CompanyDiscount> listAllEmployeeDiscounts(long employeeId);
	
}

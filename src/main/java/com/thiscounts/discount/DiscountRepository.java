package com.thiscounts.discount;

import java.util.List;

public interface DiscountRepository {

	/**
	 * 
	 * @param discount
	 * @return
	 */
	boolean create(Discount discount);
	
	/**
	 * 
	 * @param discount
	 * @return
	 */
	boolean update(Discount discount);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Discount findById(long id);
	
	/**
	 * 
	 * @param discount
	 * @return
	 */
	List<Discount> listAll(Discount discount);	

	/**
	 * A company buys the discount that was bought
	 * @param companyDiscount
	 * @return
	 */
	public boolean createCompanyDiscount(CompanyDiscount companyDiscount);

	/**
	 * A company changes the discount that was bought
	 * @param companyDiscount
	 * @return
	 */
	public boolean updateCompanyDiscount(CompanyDiscount companyDiscount);

	/**
	 * List all known discounts by the company
	 * @param companyId
	 * @return
	 */
	public List<CompanyDiscount> listAllCompanyDiscounts(long companyId);

	/**
	 * 
	 * @param employeeId
	 * @return
	 */
	List<CompanyDiscount> listAllEmployeeDiscounts(long employeeId);

}

package com.thiscounts.company;

import java.util.List;

public interface CompanyController {

	/**
	 * 
	 * @param discount
	 * @return
	 */
	boolean create(Company discount);	
	
	/**
	 * 
	 * @param discount
	 * @return
	 */
	boolean update(Company discount);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Company findById(long id);

	/**
	 * 
	 * @return
	 */
	List<Company> findAll();
	
}

package com.thiscounts.company;

import java.util.List;


public interface CompanyRepository {

	/**
	 * 
	 * @param discount
	 * @return
	 */
	boolean create(Company company);
	
	/**
	 * 
	 * @param discount
	 * @return
	 */
	boolean update(Company company);

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

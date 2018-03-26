package com.thiscounts.company;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository {

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

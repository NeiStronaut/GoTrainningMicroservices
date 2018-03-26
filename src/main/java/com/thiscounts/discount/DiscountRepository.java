package com.thiscounts.discount;

import java.util.List;

public interface DiscountRepository {

	/**
	 * 
	 * @param e
	 * @return
	 */
	boolean create(Discount e);
	
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
	boolean update(Discount d);
	
	/**
	 * 
	 * @param d
	 * @return
	 */
	List<Discount> listAll(Discount d);	
	
}

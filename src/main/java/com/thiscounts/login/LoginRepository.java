package com.thiscounts.login;

public interface LoginRepository {
	
	/**
	 * 
	 * @param id
	 * @param hash
	 * @return
	 */
	boolean login(String id, String hash);
	
	/**
	 * 
	 * @param l
	 * @return
	 */
	boolean update(Login l);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	String acquireSession(String id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	long acquireUserId(String id);
	
}

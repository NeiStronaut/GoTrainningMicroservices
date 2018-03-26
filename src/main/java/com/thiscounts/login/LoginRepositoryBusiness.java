package com.thiscounts.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class LoginRepositoryBusiness implements LoginRepository {
	
	@Autowired
	LoginRepositoryJpa jpaRepository;

	@Override
	public boolean login(String id, String hash) {
		return false;
	}

	@Override
	public boolean update(Login login) {
		return false;
	}

	@Override
	public String acquireSession(String id) {
		return null;
	}

	@Override
	public long acquireUserId(String id) {
		return 0;
	}

}

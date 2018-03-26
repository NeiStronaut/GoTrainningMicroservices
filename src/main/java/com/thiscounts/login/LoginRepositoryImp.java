package com.thiscounts.login;

public class LoginRepositoryImp implements LoginRepository {

	@Override
	public boolean login(String id, String hash) {
		return false;
	}

	@Override
	public boolean update(Login l) {
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

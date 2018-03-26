package com.thiscounts.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CompanyRepositoryBusiness implements CompanyRepository {

	@Autowired
	CompanyRepositoryJpa jpaRepository;
	
	
	@Override
	public boolean create(Company discount) {
		return false;
	}

	@Override
	public Company findById(long id) {
		return null;
	}

	@Override
	public boolean update(Company discount) {
		return false;
	}

	@Override
	public List<Company> findAll() {
		return null;
	}

}

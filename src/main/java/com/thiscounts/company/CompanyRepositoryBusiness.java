package com.thiscounts.company;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyRepositoryBusiness implements CompanyRepository {

	@Autowired
	CompanyRepositoryJpa jpaRepository;
	
	
	@Override
	public boolean create(Company company) {
		Company created = jpaRepository.saveAndFlush(company);
		return created != null;
	}

	@Override
	public boolean update(Company company) {
		Company created = jpaRepository.saveAndFlush(company);
		return created != null;
	}

	@Override
	public Company findById(long id) {
		Optional<Company> optional = jpaRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public List<Company> findAll() {
		return jpaRepository.findAll();
	}

}

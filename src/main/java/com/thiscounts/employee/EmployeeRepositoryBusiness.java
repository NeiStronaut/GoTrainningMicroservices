package com.thiscounts.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thiscounts.company.Company;

@Repository
public class EmployeeRepositoryBusiness implements EmployeeRepository {
	
	@Autowired
	EmployeeRepositoryJpa jpaRepository;

	@Override
	public boolean create(Employee employee) {
		Employee created = jpaRepository.saveAndFlush(employee);
		return created != null;
	}

	@Override
	public boolean update(Employee employee) {
		Employee created = jpaRepository.saveAndFlush(employee);
		return created != null;
	}

	@Override
	public Employee findById(long id) {
		Optional<Employee> optional = jpaRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public List<Employee> listAll(Company company) {
		return jpaRepository.findAll();
	}

}

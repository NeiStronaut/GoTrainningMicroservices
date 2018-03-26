package com.thiscounts.discount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.thiscounts.company.Company;
import com.thiscounts.employee.Employee;

public class DiscountRepositoryBusiness implements DiscountRepository, CompanyDiscountRepository {

	@Autowired
	private CompanyDiscountRepositoryJpa jpaCompanyDiscountRepository;
	
	@Autowired
	private DiscountRepositoryJpa jpaDiscountRepository;
	

	@Override
	public boolean create(Discount e) {
		return false;
	}

	@Override
	public Discount findById(long id) {
		return null;
	}

	@Override
	public boolean update(Discount d) {
		return false;
	}

	@Override
	public List<Discount> listAll(Discount d) {
		return null;
	}
		
		@Override
		public boolean create(CompanyDiscount companyDiscount) {
			return false;
		}

		@Override
		public boolean update(CompanyDiscount companyDiscount) {
			return false;
		}

		@Override
		public List<CompanyDiscount> listAll(Company discount) {
			return null;
		}

		@Override
		public List<CompanyDiscount> listAll(Employee employee) {
			return null;
		}
}

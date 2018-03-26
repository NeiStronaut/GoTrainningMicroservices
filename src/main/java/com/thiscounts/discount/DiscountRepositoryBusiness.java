package com.thiscounts.discount;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class DiscountRepositoryBusiness implements DiscountRepository {

	@Autowired
	private CompanyDiscountRepositoryJpa jpaCompanyDiscountRepository;

	@Autowired
	private DiscountRepositoryJpa jpaDiscountRepository;


	@Override
	public boolean create(Discount discount) {
		Discount created = jpaDiscountRepository.saveAndFlush(discount);
		return created != null;
	}

	@Override
	public boolean update(Discount discount) {
		Discount created = jpaDiscountRepository.saveAndFlush(discount);
		return created != null;
	}

	@Override
	public Discount findById(long id) {
		Optional<Discount> optional = jpaDiscountRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public List<Discount> listAll(Discount discount) {
		// NEXT: Find all by example
		// In the future clients may want to filter discounts
		return jpaDiscountRepository.findAll();
	}

	@Override
	public boolean createCompanyDiscount(CompanyDiscount companyDiscount) {
		CompanyDiscount created = jpaCompanyDiscountRepository.saveAndFlush(companyDiscount);
		return created != null;
	}

	@Override
	public boolean updateCompanyDiscount(CompanyDiscount companyDiscount) {
		CompanyDiscount created = jpaCompanyDiscountRepository.saveAndFlush(companyDiscount);
		return created != null;
	}

	@Override
	public List<CompanyDiscount> listAllCompanyDiscounts(long companyId) {
		return null;
	}

	@Override
	public List<CompanyDiscount> listAllEmployeeDiscounts(long employeeId) {
		return null;
	}
}

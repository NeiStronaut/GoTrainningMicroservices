package com.thiscounts.discount;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiscounts.company.Company;
import com.thiscounts.employee.Employee;

@RestController
public class DiscountControllerBusiness implements DiscountController {
	
	@Override
	@RequestMapping(value = "/discount", method = RequestMethod.POST)
	public boolean create(Discount e) {
		return false;
	}

	@Override
	@RequestMapping(value = "/discount", method = RequestMethod.GET)
	public Discount findById(long id) {
		return null;
	}

	@Override
	@RequestMapping(value = "/discount", method = RequestMethod.PUT)
	public boolean update(Discount d) {
		return false;
	}

	@Override
	@RequestMapping(value = "/discount/company-discount", method = RequestMethod.POST)
	public boolean createCompanyDiscount(CompanyDiscount companyDiscount) {
		return false;
	}

	@Override
	@RequestMapping(value = "/discount/company-discount", method = RequestMethod.PUT)
	public boolean updateCompanyDiscount(CompanyDiscount companyDiscount) {
		return false;
	}

	@Override
	@RequestMapping(value = "/discount/all", method = RequestMethod.GET)
	public List<Discount> listAll(Discount d) {
		return null;
	}

	@Override
	@RequestMapping(value = "/discount/company-discounts", method = RequestMethod.GET)
	public List<CompanyDiscount> listAll(Company discount) {
		return null;
	}

	@Override
	@RequestMapping(value = "/discount/employee-discounts", method = RequestMethod.GET)
	public List<CompanyDiscount> listAll(Employee employee) {
		return null;
	}

}

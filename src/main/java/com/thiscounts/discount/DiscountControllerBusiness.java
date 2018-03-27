package com.thiscounts.discount;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DiscountControllerBusiness implements DiscountController {
	
	@Autowired
	private DiscountRepository repository;
	
	@Override
	@RequestMapping(value = "/discount", method = RequestMethod.POST)
	public boolean create(Discount discount) {
		return repository.create(discount);
	}

	@Override
	@RequestMapping(value = "/discount", method = RequestMethod.PUT)
	public boolean update(Discount discount) {
		return repository.update(discount);
	}

	@Override
	@RequestMapping(value = "/discount/{id}", method = RequestMethod.GET)
	public Discount findById(@PathParam("id") long id) {
		return repository.findById(id);
	}

	@Override
	@RequestMapping(value = "/discount/company-discount", method = RequestMethod.POST)
	public boolean createCompanyDiscount(CompanyDiscount companyDiscount) {
		return  repository.createCompanyDiscount(companyDiscount);
	}

	@Override
	@RequestMapping(value = "/discount/company-discount", method = RequestMethod.PUT)
	public boolean updateCompanyDiscount(CompanyDiscount companyDiscount) {
		return repository.updateCompanyDiscount(companyDiscount);
	}

	@Override
	@RequestMapping(value = "/discount/all", method = RequestMethod.GET)
	public List<Discount> listAll(Discount discount) {
		return repository.listAll(discount);
	}

	@Override
	@RequestMapping(value = "/discount/company-discounts", method = RequestMethod.GET)
	public List<CompanyDiscount> listAllCompanyDiscounts(long companyId) {
		return repository.listAllCompanyDiscounts(companyId);
	}

	@Override
	@RequestMapping(value = "/discount/employee-discounts", method = RequestMethod.GET)
	public List<CompanyDiscount> listAllEmployeeDiscounts(long employeeId) {
		return repository.listAllEmployeeDiscounts(employeeId);
	}

}

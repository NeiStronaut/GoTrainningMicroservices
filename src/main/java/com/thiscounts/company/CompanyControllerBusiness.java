package com.thiscounts.company;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyControllerBusiness implements CompanyController {

	@Override
	@RequestMapping(value = "/company", method = RequestMethod.POST)
	public boolean create(Company discount) {
		return false;
	}

	@Override
	@RequestMapping(value = "/company", method = RequestMethod.PUT)
	public boolean update(Company discount) {
		return false;
	}

	@Override
	@RequestMapping(value = "/company", method = RequestMethod.GET)
	public Company findById(long id) {
		return null;
	}

	@Override
	@RequestMapping(value = "/company", method = RequestMethod.GET)
	public List<Company> findAll() {
		return null;
	}

}

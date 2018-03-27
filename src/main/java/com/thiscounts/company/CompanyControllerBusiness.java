package com.thiscounts.company;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class CompanyControllerBusiness implements CompanyController {

	@Autowired
	private CompanyRepository repository;

	@Override
	@RequestMapping(value = "/company", method = RequestMethod.POST)
	public boolean create(Company company) {
		return repository.create(company);
	}

	@Override
	@RequestMapping(value = "/company", method = RequestMethod.PUT)
	public boolean update(Company company) {
		return repository.update(company);
	}

	@Override
	@RequestMapping(value = "/company/{id}", method = RequestMethod.GET)
	public Company findById(@PathParam("id")long id) {
		return repository.findById(id);
	}

	@Override
	@RequestMapping(value = "/company", method = RequestMethod.GET)
	public List<Company> findAll() {
		return repository.findAll();
	}

}

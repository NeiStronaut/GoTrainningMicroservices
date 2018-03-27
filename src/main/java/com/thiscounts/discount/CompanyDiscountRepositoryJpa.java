package com.thiscounts.discount;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDiscountRepositoryJpa extends JpaRepository<CompanyDiscount, Long> {


	public final String QUERY_ALL_EMPLOYEE_DISCOUNTS = 
			"SELECT tcd " + 
            "FROM CompanyDiscount tcd RIGHT JOIN Employee e " +
            "WHERE tcd.companyId = e.companyId " +
            "AND e.id = :employeeId";
	
	/**
	 * List all known discounts by the company of the employee
	 * @param employeeId
	 * @return
	 */

	@Query(QUERY_ALL_EMPLOYEE_DISCOUNTS)
	public List<CompanyDiscount> listAllEmployeeDiscounts(@Param("employeeId")long employeeId);

}

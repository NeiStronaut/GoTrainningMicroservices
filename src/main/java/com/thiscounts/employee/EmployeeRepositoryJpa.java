package com.thiscounts.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepositoryJpa extends JpaRepository<Employee, Long> {


}

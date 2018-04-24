package com.thiscounts.login;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thiscounts.employee.Employee;

public class LoginEmployeeClient {

//	@FeignClient(value = "login - service", fallback = EmployeeClientFallback.class)
//	public interface EmployeeClient {
//		@RequestMapping(method=RequestMethod.GET, value="/employee/{id}")
//				Employee getClient(@PathVariable("employeeId") long employeeId);
//	}
//
//	@Component
//	public class EmployeeClientFallback implements EmployeeClient {
//
//		@Override
//		public Employee getClient(long employeeId) {
//			Employee employee = new Employee();
//			return employee	;
//		}
//
//	}

}

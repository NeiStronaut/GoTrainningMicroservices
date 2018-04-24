package com.thiscounts.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.thiscounts.employee.Employee;

@RefreshScope
@RestController
public class LoginControllerBusiness implements LoginController {

    @Autowired
    private RestTemplate restTemplate;
    
//    @Autowired
//    private EurekaClient eurekaClient;
//    
	@Autowired
	private LoginRepository repository;

	@Override
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public boolean login(String id, String hash) {
		return repository.login(id, hash);
	}

	@Override
	@RequestMapping(value = "/login", method = RequestMethod.PUT)
	public boolean update(Login login) {
		return repository.update(login);
	}

	@Override
	@RequestMapping(value = "/login/session", method = RequestMethod.GET)
	public String acquireSession(String id) {
		return repository.acquireSession(id);
	}

	@Override
	@RequestMapping(value = "/login/user", method = RequestMethod.GET)
	public Employee accquireEmployee(String id) {
		long userId = repository.acquireUserId(id);
		
		
		//NEXT: connect with service and get employee
//		Application application = eurekaClient.getApplication(employeeSearchServiceId);
//        InstanceInfo instanceInfo = application.getInstances().get(0);
//        String url = "http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() + "/" + "employee/find/" + myself;
//        System.out.println("URL" + url);
//        EmployeeInfo emp = restTemplate.getForObject(url, EmployeeInfo.class);
//        System.out.println("RESPONSE " + emp);
//        return emp;
//		
		
		
		
		
		
		
		return null;
	}

}

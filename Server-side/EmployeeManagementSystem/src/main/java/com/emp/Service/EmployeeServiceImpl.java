package com.emp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Entity.Employee;
import com.emp.Repo.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private IEmployeeRepo employeeRepo;

	@Override
	public Integer saveEmployee(Employee employee) {
		Employee savedEmployee = employeeRepo.save(employee); //injecting bean an using JPA methods injected gtom repo interface
		return savedEmployee.getId();
	}
	
	
}

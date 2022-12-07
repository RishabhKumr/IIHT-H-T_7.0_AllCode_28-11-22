package com.emp.Service;

import java.util.List;
import java.util.Optional;

import com.emp.Entity.Employee;

public interface IEmployeeService {
	Integer saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	Optional<Employee> getEmployee(Integer id);
	
	public void deleteEmployee(Integer id);
}

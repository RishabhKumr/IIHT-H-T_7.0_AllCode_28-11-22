package com.emp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Entity.Employee;
import com.emp.Exception.ResourceNotFoundExceptionHandler;
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

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(Integer id) {
		return employeeRepo.findById(id);
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepo.deleteById(id);		
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id) {
		//lets check if the emp exists with given value or not
		Employee existingEmployee = employeeRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundExceptionHandler("Employee","id",id));
		existingEmployee.setEname(employee.getEname());
		existingEmployee.setEposition(employee.getEposition());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setSalary(employee.getSalary());
		
		employeeRepo.save(existingEmployee);
		return existingEmployee;
		
	}
	
	
}

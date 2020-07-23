package com.canalogies.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canalogies.shop.model.Employee;
import com.canalogies.shop.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployees(){
		List<Employee> employees=(List<Employee>)employeeRepository.findAll();
		return employees;
	}
	
	public Employee getAllEmployeeId(int id){
		Employee employee=employeeRepository.findById(id).get();
		return employee;
	}
	
	public List<Employee> getAllEmployeeName(String name){
		List<Employee> employees=employeeRepository.findByEmpName(name);
		return employees;
	}
	
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		Employee e =employeeRepository.findById(employee.getId()).get();
		e.setEmpId("EMP_"+e.getId());;
		updateEmployee(e);
	}
	
	public void updateEmployee(Employee employee) {
		Employee e =employeeRepository.findById(employee.getId()).get();
		e=employee;
		employeeRepository.save(e);
	}
	
}

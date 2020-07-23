package com.canalogies.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.canalogies.shop.model.Employee;
import com.canalogies.shop.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllCustomers(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping("/employees/id/{empId}")
	public Employee getCustomerId(@PathVariable("empId") int empId){
		return employeeService.getAllEmployeeId(empId);
	}
	
	@RequestMapping("/employees/name/{empName}")
	public List<Employee> getCustomerName(@PathVariable("empName") String empName){
		return employeeService.getAllEmployeeName(empName);
	}
	
	
	@RequestMapping(value="/employees",method = RequestMethod.POST)
	public void saveCustomer(@RequestBody Employee employee){
		employeeService.saveEmployee(employee);
		 
	}
	
	@RequestMapping(value="/employees",method = RequestMethod.PUT)
	public void updateCustomer(@RequestBody Employee employee){
		employeeService.updateEmployee(employee);
	}
	
	
}

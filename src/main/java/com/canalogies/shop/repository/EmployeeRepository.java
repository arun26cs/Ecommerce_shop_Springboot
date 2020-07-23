package com.canalogies.shop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.canalogies.shop.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	public List<Employee> findByEmpId(String empId);
	public List<Employee> findByEmpName(String empName);
}

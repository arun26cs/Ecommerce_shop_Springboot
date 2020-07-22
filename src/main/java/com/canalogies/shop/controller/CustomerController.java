package com.canalogies.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.canalogies.shop.model.Customer;
import com.canalogies.shop.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomers();
	}
	
	@RequestMapping(value = "/customers/{customerId}")
	public Customer getCustomer(@PathVariable("customerId") int customerId) {
		return customerService.getCustomer(customerId);
	}
	
	@RequestMapping(value = "/customers1/{customerName}")
	public List<Customer> getCustomerName(@PathVariable("customerName") String customerName) {
		return customerService.getByCustomername(customerName);
	}
	
	@RequestMapping(value = "/customers",method = RequestMethod.POST)
	public void saveCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
	}
	
	@RequestMapping(value = "/customers",method = RequestMethod.PUT)
	public void updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
	}
}

package com.canalogies.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canalogies.shop.model.Customer;
import com.canalogies.shop.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<Customer> getAllCustomers(){
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll()
		.forEach(customers::add);
//		if(customers.isEmpty()) {
//			throw new RuntimeException("Customers table empty");
//		} 
		return customers;
	}
	
	public Customer getCustomer(int customerId) {
		Optional<Customer> customer=customerRepository.findById(customerId);
		//customer.orElseThrow(()->new RuntimeException("Customer not found "+customerId));
		return customer.get();
	}
	
	public List<Customer> getByCustomername(String customerName){
		List<Customer> customers = new ArrayList<>();
		customers=customerRepository.findByCustomername(customerName);
		if(customers.isEmpty()) {
			throw new RuntimeException("Customers table empty");
		} 
		return customers;
	}
	
	
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void updateCustomer(Customer customer) {
		Optional<Customer> customerEntity = customerRepository.findById(customer.getCustomerid());
		Customer c = customerEntity.get();
		c=customer;
		customerRepository.save(c);
	}
}

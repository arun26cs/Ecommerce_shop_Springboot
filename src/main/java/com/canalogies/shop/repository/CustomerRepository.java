package com.canalogies.shop.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.canalogies.shop.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	public List<Customer> findByCustomername(String customername);
	
}

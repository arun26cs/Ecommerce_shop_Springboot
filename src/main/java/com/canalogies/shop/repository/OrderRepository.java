package com.canalogies.shop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.canalogies.shop.model.Orders;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer>{

	public List<Orders> findByOrderId(String orderId);
	public List<Orders> findByCustomerCustomerid(int custid);
	public List<Orders> findByShipperId(int shipperId);
}

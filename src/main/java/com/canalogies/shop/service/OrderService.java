package com.canalogies.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canalogies.shop.model.Orders;
import com.canalogies.shop.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Orders> getAllOrders(){
		return (List<Orders>)orderRepository.findAll();
	}
	
	public List<Orders> getOrderById(String orderId){
		return orderRepository.findByOrderId(orderId);
	} 
	public  List<Orders> getOrderByCustomer(int custId){
		return (List<Orders>)orderRepository.findByCustomerCustomerid(custId);
	}
	
	public  List<Orders> getOrderByShipper(int shipperId){
		return (List<Orders>)orderRepository.findByShipperId(shipperId);
	}
	
	public void saveOrder(Orders order){
		 orderRepository.save(order);
		 order = orderRepository.findById(order.getId()).get();
		 order.setOrderId("ORD_"+order.getId());
		 updateOrder(order);
	} 
	public void updateOrder(Orders order) {
		Orders o = orderRepository.findById(order.getId()).get();
		o=order;
		orderRepository.save(o);
	}
	
}

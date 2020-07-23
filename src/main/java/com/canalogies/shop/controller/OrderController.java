package com.canalogies.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.canalogies.shop.model.Orders;
import com.canalogies.shop.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/orders")
	public List<Orders> getAllOrders(){
		return (List<Orders>)orderService.getAllOrders();
	}
	
	@RequestMapping("/orders/{id}")
	public List<Orders> getOrderById(@PathVariable("id") String id){
		return (List<Orders>)orderService.getOrderById(id);
	}
	
	@RequestMapping("/orders/customer/{id}")
	public List<Orders> getOrderByCustomer(@PathVariable("id") int id){
		return (List<Orders>)orderService.getOrderByCustomer(id);
	}
	
	@RequestMapping("/orders/shippers/{id}")
	public List<Orders> getOrderByShipper(@PathVariable("id") int shipperId){
		return (List<Orders>)orderService.getOrderByShipper(shipperId);
	}
	
	@RequestMapping(value = "/orders", method = RequestMethod.POST)
	public void saveOrder(@RequestBody Orders order){
		orderService.saveOrder(order);
	}
	
	@RequestMapping(value = "/orders", method = RequestMethod.PUT)
	public void updateOrder(@RequestBody Orders order){
		orderService.updateOrder(order);
	}
	
}

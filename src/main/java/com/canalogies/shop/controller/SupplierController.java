package com.canalogies.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.canalogies.shop.model.Supplier;
import com.canalogies.shop.service.SupplierService;

@RestController
public class SupplierController {

	@Autowired
	private SupplierService supplierService;
	
	@RequestMapping("/suppliers")
	public List<Supplier> getAllSuppliers(){
		return supplierService.getAllSuppliers();
	}
	
	@RequestMapping("/suppliers/{supplierName}")
	public List<Supplier> getSupplier(@PathVariable("supplierName") String supplierName){
		return supplierService.getSupplier(supplierName);
	}
	
	@RequestMapping(value = "/suppliers",method = RequestMethod.POST)
	public void saveSupplier(@RequestBody Supplier supplier) {
		supplierService.saveSupplier(supplier);
		
	}
	
	@RequestMapping(value = "/suppliers",method = RequestMethod.PUT)
	public void updateSupplier(@RequestBody Supplier supplier) {
		supplierService.updateSupplier(supplier); 
	}
	
}

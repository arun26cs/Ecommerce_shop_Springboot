package com.canalogies.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canalogies.shop.model.Product;
import com.canalogies.shop.model.Supplier;
import com.canalogies.shop.repository.SupplierRepository;

@Service
public class SupplierService {
	
	@Autowired
	private SupplierRepository supplierRepository;
	
	
	public List<Supplier> getAllSuppliers(){
		List<Supplier> suppliers = (List<Supplier>)supplierRepository.findAll();
		return suppliers;
	}
	
	public List<Supplier> getSupplier(String supplierName){
		List<Supplier> suppliers = supplierRepository.findBySupplierName(supplierName);
		return suppliers;
	}
	
	public void saveSupplier(Supplier supplier) {
		supplierRepository.save(supplier);
		supplier=supplierRepository.findById(supplier.getId()).get();
		supplier.setSupplierId("SUP_"+supplier.getId());
		updateSupplier(supplier);
	}
	
	public void updateSupplier(Supplier supplier) {
		Supplier s= supplierRepository.findById(supplier.getId()).get();
		s=supplier;
		supplierRepository.save(s);
	}
}

package com.canalogies.shop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.canalogies.shop.model.Supplier;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Integer> {

	public List<Supplier> findBySupplierName(String supplierName);
}

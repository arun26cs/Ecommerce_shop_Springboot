package com.canalogies.shop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.canalogies.shop.model.Category;
import com.canalogies.shop.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

	public List<Product> findByCategoryId(int catid);//id inside Category
	public List<Product> findBySupplierId(int supid);//id inside Category
	public List<Product> findByProductName(String productName);
	
}

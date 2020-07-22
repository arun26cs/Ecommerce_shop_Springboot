package com.canalogies.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canalogies.shop.model.Product;
import com.canalogies.shop.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		List<Product> products = (List<Product>)productRepository.findAll();
		return products;
	}
	
	public Product getProduct(String productName){
		Product product = productRepository.findByProductName(productName);
		return product;
	}
	
	public List<Product> getProductsByCategory(int catid){
		List<Product> products = productRepository.findByCategoryId(catid);
		return products;
	}
	
	public List<Product> getProductsBySupplier(int supid){
		List<Product> products = productRepository.findBySupplierId(supid);
		return products;
	}
	
	public void saveProduct(Product product) {
		productRepository.save(product);
		product = getProduct(product.getProductId());
		product.setProductId("prod_"+product.getId());
		updateProduct(product);
	}
	
	public void updateProduct(Product product) {
		Product p = productRepository.findById(product.getId()).get();
		p=product;
		productRepository.save(p);
	}
	
}

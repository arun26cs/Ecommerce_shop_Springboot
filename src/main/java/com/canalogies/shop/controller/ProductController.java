package com.canalogies.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.canalogies.shop.model.Product;
import com.canalogies.shop.model.Supplier;
import com.canalogies.shop.repository.ProductRepository;
import com.canalogies.shop.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	@RequestMapping("/products/{productName}")
	public List<Product> getProduct(@PathVariable("productName") String productName){
		return productService.getProduct(productName);
	}
	@RequestMapping("/products/categories/{catId}")
	public List<Product> getAllProductsByCategory(@PathVariable("catId") int catId){
		return productService.getProductsByCategory(catId);
	}
	@RequestMapping("/products/suppliers/{supId}")
	public List<Product> getAllProductsBySupplier(@PathVariable("supId") int supId){
		return productService.getProductsBySupplier(supId);
	}
	@RequestMapping(value = "/products",method = RequestMethod.POST)
	public void saveProduct(@RequestBody Product product) {
		productService.saveProduct(product); 
		
	}
	@RequestMapping(value = "/products",method = RequestMethod.PUT)
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);		
	}
}

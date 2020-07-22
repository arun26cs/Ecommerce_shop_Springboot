package com.canalogies.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canalogies.shop.model.Category;
import com.canalogies.shop.model.Customer;
import com.canalogies.shop.repository.CategoryRepository;
import com.canalogies.shop.repository.CustomerRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	public List<Category> getAllCategories(){
		List<Category> categories = new ArrayList<>();
		categories=(List<Category>)categoryRepository.findAll();
		return categories;
	}
	
	public Category getCategoryByName(String categoryname) {
		Category category=categoryRepository.findByCategoryName(categoryname);
		return category;
	}
	
	
	public void saveCategory(Category category) {
		categoryRepository.save(category);
		category=getCategoryByName(category.getCategoryName());
		category.setCategoryId("cat_"+category.getId());
		updateCategory(category);
	}
	
	public void updateCategory(Category category) {
		Optional<Category> categoryEntity = categoryRepository.findById(category.getId());
		Category c = categoryEntity.get();
		c=category;
		categoryRepository.save(c);
	} 
}

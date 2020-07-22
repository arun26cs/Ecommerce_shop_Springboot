package com.canalogies.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.canalogies.shop.model.Category;
import com.canalogies.shop.repository.CategoryRepository;
import com.canalogies.shop.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/categories")
	public List<Category> getAllCategories(){
		return categoryService.getAllCategories();
	}
	
	@RequestMapping(value = "/categories/{categoryName}")
	public Category getByCategoryname(@PathVariable("categoryName") String categoryName){
		return categoryService.getCategoryByName(categoryName);
	}
	
	@RequestMapping(value = "/categories",method = RequestMethod.POST)
	public void saveCategory(@RequestBody Category category){
		categoryService.saveCategory(category);
	}
	
	@RequestMapping(value = "/categories",method = RequestMethod.PUT)
	public void updateCategory(@RequestBody Category category){
		categoryService.updateCategory(category);
	}
	
	
		
}

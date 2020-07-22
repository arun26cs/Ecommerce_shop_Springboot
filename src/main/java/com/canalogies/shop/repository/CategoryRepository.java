package com.canalogies.shop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.canalogies.shop.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer>  {

	public Category findByCategoryName(String categoryname);
	
}

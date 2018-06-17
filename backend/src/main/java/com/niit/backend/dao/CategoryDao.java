package com.niit.backend.dao;

import java.util.List;

import com.niit.backend.model.Category;

public interface CategoryDao {

	public boolean catDao(Category cat);
	public List<Category> listofcategories();
	 public Category singleCategory(String categoryId);
	 public boolean deleteCategory(Category cat);
}

package com.naran.onlineshoping.dao;

import java.util.List;

import com.naran.onlineshoping.domain.Category;

public interface CategoryDao {
	
	List<Category> findAll();
	Category getCategoryById(int id);
}

package com.narayan.onlineshopingbackendtest.dao;

import java.util.List;

import com.narayan.onlineshopingbackendtest.domain.Category;

public interface CategoryDao {
	
	List<Category> findAll();
	Category getCategoryById(int id);
}

package com.naran.onlineshoping.service;

import java.util.List;

import com.naran.onlineshoping.domain.Category;

public interface CategoryService {
	List<Category> findAll();
	Category getCategoryById(int id);
}

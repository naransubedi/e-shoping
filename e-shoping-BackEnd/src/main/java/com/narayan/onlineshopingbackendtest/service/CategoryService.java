package com.narayan.onlineshopingbackendtest.service;

import java.util.List;

import com.narayan.onlineshopingbackendtest.domain.Category;

public interface CategoryService {
	List<Category> findAll();
	Category getCategoryById(int id);
}

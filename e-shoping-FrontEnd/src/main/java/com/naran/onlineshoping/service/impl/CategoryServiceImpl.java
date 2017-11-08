package com.naran.onlineshoping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naran.onlineshoping.dao.CategoryDao;
import com.naran.onlineshoping.domain.Category;
import com.naran.onlineshoping.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDao categoryDao;

	public List<Category> findAll() {
		return categoryDao.findAll();
	}

	public Category getCategoryById(int id) {
		return categoryDao.getCategoryById(id);
	}

}

package com.narayan.onlineshopingbackendtest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.narayan.onlineshopingbackendtest.dao.CategoryDao;
import com.narayan.onlineshopingbackendtest.domain.Category;
import com.narayan.onlineshopingbackendtest.service.CategoryService;

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

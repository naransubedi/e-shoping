package com.naran.onlineshoping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naran.onlineshoping.dao.CategoryDao;
import com.naran.onlineshoping.dao.ProductDao;
import com.naran.onlineshoping.domain.Category;
import com.naran.onlineshoping.domain.Product;
import com.naran.onlineshoping.service.CategoryService;
import com.naran.onlineshoping.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;

	@Override
	public List<Product> findAll() {
		
		return productDao.findAllProduct();
	}

	@Override
	public Product getProductById(int id) {
		return productDao.getProductById(id);
	}

	@Override
	public void delete(Product p) {
		
		productDao.delete(p);
		
	}

	@Override
	public void save(Product p) {
		productDao.save(p);
		
	}

	@Override
	public List<Product> findProductsByCategory(Category category) {
		return productDao.findProductsByCategory(category);
	}
	
}

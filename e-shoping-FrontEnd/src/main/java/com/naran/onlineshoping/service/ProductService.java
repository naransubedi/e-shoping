package com.naran.onlineshoping.service;

import java.util.List;

import com.naran.onlineshoping.domain.Category;
import com.naran.onlineshoping.domain.Product;

public interface ProductService {
	List<Product> findAll();
	Product getProductById(int id);
	void delete(Product p);
	void save(Product p);
	List<Product> findProductsByCategory(Category category);
}

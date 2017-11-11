package com.naran.onlineshoping.dao;

import java.util.List;

import com.naran.onlineshoping.domain.Product;

public interface ProductDao {
	
	public List<Product> findAllProduct();
	
	public Product getProductById(int id);
	
	public void save(Product p);
	
	public void delete(Product p);
	
	public List<Product> findProductsByCategoryId(int id);
	
}
